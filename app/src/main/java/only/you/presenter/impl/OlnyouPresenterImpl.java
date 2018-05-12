package only.you.presenter.impl;

import android.util.Log;

import org.xutils.ex.DbException;

import java.util.List;

import only.you.model.bean.onlyoueyes.Classify;
import only.you.model.http.response.OlnyouModel;
import only.you.presenter.IOlnyouPresenter;
import only.you.ui.adapter.OnlyouMenuAdapter;
import only.you.ui.contract.HomeFragmentContract;
import only.you.utils.DBHelper;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/4/21
 */
public class OlnyouPresenterImpl<T extends HomeFragmentContract> implements IOlnyouPresenter<T>, OlnyouModel.OlnyouListener {
    private T baseView;
    private OlnyouModel model;

    public OlnyouPresenterImpl() {
        model = new OlnyouModel();
        model.setClassifyListener(this);
    }

    @Override
    public void attachView(T baseView) {
        if (baseView != null) {
            this.baseView = baseView;
        }
    }

    @Override
    public void detachView() {
        baseView = null;
    }

    @Override
    public void loadMenuData() {
        if (baseView != null) {
            try {
                if (DBHelper.db.findAll(Classify.class) == null) {
                    Log.w("打印", "YES请求网络");
                    model.loadMenuData();
                } else {
                    List<Classify> classifies = DBHelper.db.findAll(Classify.class);
                    if (classifies.size() < 10) {
                        Log.w("打印", "请求网络");
                        model.loadMenuData();
                    } else {
                        Log.w("打印", "NO请求网络");
                        //为每个选项添加没选中
                        for (Classify classify : classifies) {
                            classify.setIselected(false);
                        }
                        //添加推荐
                        Classify classify = new Classify();
                        classify.setName("推荐");
                        classify.setId(0);
                        classify.setPosition(-1);
                        classify.setIselected(true);
                        classifies.add(classify);
                        OnlyouMenuAdapter adaptet = new OnlyouMenuAdapter(OnlyoUtils.sortIntMethod(classifies));
                        baseView.addAdapter(adaptet);
                    }
                }

            } catch (DbException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void loadRecommend() {

    }

    //model回调方法
    @Override
    public void showDialog(String content) {
        if (baseView != null) {
            baseView.showToast(content);
        }
    }

    @Override
    public void setMenu(List<Classify> list) {
        if (baseView != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setPosition(i);
                try {
                    DBHelper.db.save(list.get(i));
                } catch (DbException e) {
                    e.printStackTrace();
                }
            }
            //为每个选项添加没选中
            for (Classify classify : list) {
                classify.setIselected(false);
            }
            //添加推荐
            Classify classify = new Classify();
            classify.setName("推荐");
            classify.setId(0);
            classify.setPosition(-1);
            classify.setIselected(true);
            list.add(classify);
            OnlyouMenuAdapter adaptet = new OnlyouMenuAdapter(OnlyoUtils.sortIntMethod(list));
            baseView.addAdapter(adaptet);
        }
    }
}
