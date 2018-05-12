package only.you.model.http.response;

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
 * @time 2018/4/21
 */
public class OlnyouModel {
    private OlnyouListener listener;
    private Onlyou apis;
//    ApiRetrofit retrofit = new ApiRetrofit();
//    Onlyou apis = retrofit.getOnlyouApisService();

    public void loadMenuData() {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<List<Classify>> call = apis.getClassify();
        call.enqueue(new Callback<List<Classify>>() {
            @Override
            public void onResponse(Call<List<Classify>> call, Response<List<Classify>> response) {
                List<Classify> list = response.body();
                listener.setMenu(list);
            }

            @Override
            public void onFailure(Call<List<Classify>> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    public interface OlnyouListener {
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
    public void setClassifyListener(OlnyouListener listener2) {
        listener = listener2;
    }
}
