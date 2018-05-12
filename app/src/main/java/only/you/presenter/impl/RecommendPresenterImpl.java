package only.you.presenter.impl;

import android.util.Log;

import java.util.List;

import only.you.model.bean.onlyoueyes.Homepage;
import only.you.model.http.response.RecommendModel;
import only.you.presenter.IRecommendPresenter;
import only.you.ui.adapter.RecommendAdapter;
import only.you.ui.contract.RecommendContract;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 家佑
 * @time 2018/5/4
 */
public class RecommendPresenterImpl<T extends RecommendContract> implements IRecommendPresenter<T>, RecommendModel.RecommendListener {
    private T baseView;
    private RecommendModel model;
    private RecommendAdapter adapter;

    public RecommendPresenterImpl() {
        model = new RecommendModel();
        model.setRecommendListener(this);
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
    public void getRecommend() {
        model.getRecommend();
    }

    @Override
    public void showDialog(String content) {
        if (baseView != null) {
            baseView.showToast(content);
        }
    }

    @Override
    public void setMenu(List<Homepage.ItemListBean> itemList, long data) {
        if (baseView != null) {
            adapter = new RecommendAdapter(itemList, data);
            baseView.addAdapter(adapter);
            adapter.setRecommendListener(new RecommendAdapter.RecommendListener() {
                @Override
                public void itmeClick(Homepage.ItemListBean item) {
                    Log.e("跳转测试", "准备开始跳转了.........");
                    baseView.jumpHere(item);
                }

                @Override
                public void onLoad(long data) {
                    model.getLoad(data);
                }
            });

        }

    }

    @Override
    public void getMoreLoad(List<Homepage.ItemListBean> itemList, long data) {
        if (baseView != null) {
            adapter.changeData(itemList, data);
        }
    }
}
