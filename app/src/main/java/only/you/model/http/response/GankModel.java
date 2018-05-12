package only.you.model.http.response;

import only.you.model.http.api.GankAPI;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 家佑
 * @time 2018/5/9
 */
public class GankModel{
    private GankAPI apis;

    public GankModel() {
        ServiceGenerator.changeApiBaseUrl("http://gank.io/api/");
        apis = ServiceGenerator.createServiceFrom(GankAPI.class);
    }

    /**
     * 获取福利图片
     *
     * @param page
     * @return
     */
    public <T> void getGankWelfare(int page, Callback<T> callback) {
        Call<T> call = (Call<T>) apis.getGankWelfare(page);
        call.enqueue(callback);
    }

    /**
     * android周刊
     *
     * @param page
     * @return
     */
    public <T>void getGankAndroid(int page,  Callback<T> callback) {
        Call<T> call = (Call<T>) apis.getGankAndroid(page);
        call.enqueue(callback);
    }

    /**
     * 拓展周刊
     *
     * @param page
     * @return
     */
    public <T> void getGankExpand(int page, Callback<T> callback) {
        Call<T> call = (Call<T>) apis.getGankExpand(page);
        call.enqueue(callback);
    }

    /**
     * ios周刊
     *
     * @param page
     * @return
     */
    public <T> void getGankIOS(int page, Callback<T> callback) {
        Call<T> call = (Call<T>) apis.getGankIOS(page);
        call.enqueue(callback);
    }

    /**
     * 前端周刊
     *
     * @param page
     * @return
     */
    public <T>void getGankLeadingEnd(int page, Callback<T> callback) {
        Call<T> call = (Call<T>) apis.getGankLeadingEnd(page);
        call.enqueue(callback);
    }

}
