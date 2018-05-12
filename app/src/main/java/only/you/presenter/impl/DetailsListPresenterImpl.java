package only.you.presenter.impl;


import android.util.Log;

import java.util.List;

import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.model.http.response.DetailsListModel;
import only.you.presenter.IDetailsListPresenter;
import only.you.ui.adapter.DetailsAdapter;
import only.you.ui.contract.DetailsLisContract;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/2
 */
public class DetailsListPresenterImpl<T extends DetailsLisContract> implements IDetailsListPresenter<T>, DetailsListModel.DetailsListener {
    private T baseView = null;
    private DetailsListModel model;
    private String category;
    private int categoryId;
    private int number = 5;
    private DetailsAdapter detailsAdapter = null;

    public DetailsListPresenterImpl() {
        model = new DetailsListModel();
        model.setClassifyListener(this);
    }

    @Override
    public void loadIDetailsList(int start, int num, String category, int categoryId) {
        this.category = category;
        this.categoryId = categoryId;
        model.loadIDetailsList(start, num, category, categoryId);
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
    public void showDialog(String content) {
        if (baseView != null) {
            baseView.showToast(content);
        }
    }

    @Override
    public void setMenu(List<ClassificationDetails.ItemListBean> list) {
        if (baseView != null) {
            detailsAdapter = new DetailsAdapter(list);
            baseView.addAdapter(detailsAdapter);
            detailsAdapter.setSlideListener(new DetailsAdapter.SlideListener() {
                @Override
                public void onLoad(int position) {
                    model.loadIDetailsList(position, number, category, categoryId);
                }

                @Override
                public void onItmeClick(ClassificationDetails.ItemListBean item) {
                    Log.e("跳转测试", "准备开始跳转了.........");
                    baseView.jumpHere(item);
                }
            });
        }
    }

    @Override
    public void setLoad(List<ClassificationDetails.ItemListBean> list) {
        if (baseView != null) {
            detailsAdapter.changeData(list);
        }
    }
}
