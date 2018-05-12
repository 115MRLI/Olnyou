package only.you.presenter.impl;

import android.os.Bundle;
import android.util.Log;

import org.xutils.ex.DbException;

import java.util.List;

import only.you.model.bean.onlyoueyes.Classify;
import only.you.model.http.response.ClassifyModel;
import only.you.presenter.IClassifyPresenter;
import only.you.ui.adapter.MenuAdaptet;
import only.you.ui.contract.ClassifyContract;
import only.you.utils.DBHelper;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 家佑
 * @time 2018/4/19
 */
public class ClassifyPresenterImpl<T extends ClassifyContract> implements IClassifyPresenter<T>, ClassifyModel.ClassifyListener, MenuAdaptet.ItmeClick {
    private T baseView;
    private ClassifyModel model;
    private MenuAdaptet adaptet = null;

    public ClassifyPresenterImpl() {
        model = new ClassifyModel();
        model.setClassifyListener(this);

    }

    @Override
    public void attachView(T baseView) {
        this.baseView = baseView;

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
                        adaptet = new MenuAdaptet(OnlyoUtils.sortIntMethod(classifies));
                        adaptet.setItmeClick(this);
                        baseView.addAdapter(adaptet);
                    }
                }

            } catch (DbException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void upDataTable() {
        if (adaptet != null) {
            adaptet.upDataTable();
        }
    }

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
                    DBHelper.db.saveOrUpdate(list.get(i));
                } catch (DbException e) {
                    e.printStackTrace();
                }
            }
            adaptet = new MenuAdaptet(OnlyoUtils.sortIntMethod(list));
            adaptet.setItmeClick(this);
            baseView.addAdapter(adaptet);
        }
    }

    @Override
    public void onItmeClick(Bundle bundle) {
        if (baseView != null) {
            baseView.jumpThere(bundle);
        }
    }
}
