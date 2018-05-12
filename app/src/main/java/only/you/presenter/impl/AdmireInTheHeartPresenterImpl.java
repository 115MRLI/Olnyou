package only.you.presenter.impl;

import android.util.Log;

import java.util.List;

import only.you.model.bean.gank.MeiZhi;
import only.you.model.http.response.GankModel;
import only.you.presenter.IAdmireInTheHeartPresenter;
import only.you.ui.contract.AdmireInTheHeartContract;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 家佑
 * @time 2018/5/9
 */
public class AdmireInTheHeartPresenterImpl<T extends AdmireInTheHeartContract> implements IAdmireInTheHeartPresenter<T> {
    private T baseView;
    private GankModel model;

    public AdmireInTheHeartPresenterImpl() {
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
    public void getGankWelfare(int page) {
        if (baseView !=null){
            model.getGankWelfare(page, new Callback<MeiZhi>() {
                @Override
                public void onResponse(Call<MeiZhi> call, Response<MeiZhi> response) {
                    List<MeiZhi.ResultsBean> results  = response.body().getResults();
                    baseView.addAdapter(results);
                }

                @Override
                public void onFailure(Call<MeiZhi> call, Throwable t) {
                    Log.e("错误回调",t.toString());
                    baseView.showToast(t.toString());
                }
            });
        }
    }
}
