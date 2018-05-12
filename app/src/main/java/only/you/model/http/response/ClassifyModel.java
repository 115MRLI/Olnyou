package only.you.model.http.response;


import android.util.Log;

import java.util.List;

import only.you.model.bean.onlyoueyes.Classify;
import only.you.model.http.api.Onlyou;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 家佑
 * @time 2018/4/20
 */
public class ClassifyModel {
    private ClassifyListener listener;
    //    ApiRetrofit retrofit = new ApiRetrofit();
//    Onlyou apis = retrofit.getOnlyouApisService();
    private Onlyou apis;

    public void loadMenuData() {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<List<Classify>> call = apis.getClassify();
        call.enqueue(new Callback<List<Classify>>() {
            @Override
            public void onResponse(Call<List<Classify>> call, Response<List<Classify>> response) {
                List<Classify> list = response.body();
                listener.setMenu(list);
                Log.e("ss", response.body().toString() + "*********");
            }

            @Override
            public void onFailure(Call<List<Classify>> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    //回调接口
    public interface ClassifyListener {
        /**
         * 在view层展示弹窗
         *
         * @param content 弹窗内容
         */
        void showDialog(String content);

        /**
         * 获取菜单数据
         */
        void setMenu(List<Classify> list);


    }

    /**
     * 设置回调
     *
     * @param listener2
     */
    public void setClassifyListener(ClassifyListener listener2) {
        listener = listener2;
    }
}
