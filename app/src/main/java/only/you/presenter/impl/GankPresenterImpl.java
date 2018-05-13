package only.you.presenter.impl;


import java.util.ArrayList;
import java.util.List;

import only.you.model.bean.gank.Android;
import only.you.model.bean.gank.Expand;
import only.you.model.bean.gank.IOS;
import only.you.model.bean.gank.LeadingEnd;
import only.you.model.bean.gank.ResultsBean;
import only.you.model.http.response.GankModel;
import only.you.presenter.IGankPresenter;
import only.you.ui.contract.GankContract;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 家佑
 * @time 2018/5/13
 */
public class GankPresenterImpl<T extends GankContract> implements IGankPresenter<T> {
    private T baseView;
    private GankModel model;
    private List<ResultsBean> resultsBeen = new ArrayList<>();
    public GankPresenterImpl() {
        model = new GankModel();
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
    public void getGankAndroid(int page) {
        if (baseView !=null){
            model.getGankAndroid(page, new Callback<Android>() {
                @Override
                public void onResponse(Call<Android> call, Response<Android> response) {
                    if (response.body().isError() == false){
                        resultsBeen = response.body().getResults();
                        baseView.addAdapter(resultsBeen);
                    }

                }

                @Override
                public void onFailure(Call<Android> call, Throwable t) {
                    baseView.showToast(t.toString());
                }
            });
        }
    }

    @Override
    public void getGankExpand(int page) {
        if (baseView !=null){
            model.getGankExpand(page, new Callback<Expand>() {
                @Override
                public void onResponse(Call<Expand> call, Response<Expand> response) {
                    if (response.body().isError() == false){
                        resultsBeen = response.body().getResults();
                        baseView.addAdapter(resultsBeen);
                    }
                }

                @Override
                public void onFailure(Call<Expand> call, Throwable t) {
                    baseView.showToast(t.toString());
                }
            });
        }
    }

    @Override
    public void getGankIOS(int page) {
        if (baseView !=null){
            model.getGankIOS(page, new Callback<IOS>() {
                @Override
                public void onResponse(Call<IOS> call, Response<IOS> response) {
                    if (response.body().isError() == false){
                        resultsBeen = response.body().getResults();
                        baseView.addAdapter(resultsBeen);
                    }
                }

                @Override
                public void onFailure(Call<IOS> call, Throwable t) {
                    baseView.showToast(t.toString());
                }
            });
        }
    }

    @Override
    public void getGankLeadingEnd(int page) {
        if (baseView !=null){
            model.getGankLeadingEnd(page, new Callback<LeadingEnd>() {
                @Override
                public void onResponse(Call<LeadingEnd> call, Response<LeadingEnd> response) {
                    if (response.body().isError() == false){
                        resultsBeen = response.body().getResults();
                        baseView.addAdapter(resultsBeen);
                    }
                }

                @Override
                public void onFailure(Call<LeadingEnd> call, Throwable t) {
                    baseView.showToast(t.toString());
                }
            });
        }
    }
}
