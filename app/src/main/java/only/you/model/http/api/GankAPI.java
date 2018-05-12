package only.you.model.http.api;

import only.you.model.bean.gank.Android;
import only.you.model.bean.gank.Expand;
import only.you.model.bean.gank.IOS;
import only.you.model.bean.gank.LeadingEnd;
import only.you.model.bean.gank.MeiZhi;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @name Onlyou
 * @class name：only.you.model.http.api
 * @anthor 家佑
 * @time 2018/5/9
 */
public interface GankAPI {

    //GANK_BASE_URL = "http://gank.io/api/";

    /**
     * 获取福利图片
     *
     * @param page
     * @return
     */
    @GET("data/福利/20/{page}")
    Call<MeiZhi> getGankWelfare(@Path("page") int page);

    /**
     * android周刊
     *
     * @param page
     * @return
     */
    @GET("data/Android/10/{page}")
    Call<Android> getGankAndroid(@Path("page") int page);

    /**
     * 拓展周刊
     *
     * @param page
     * @return
     */
    @GET("data/拓展资源/10/{page}")
    Call<Expand> getGankExpand(@Path("page") int page);

    /**
     * ios周刊
     *
     * @param page
     * @return
     */
    @GET("data/iOS/10/{page}")
    Call<IOS> getGankIOS(@Path("page") int page);

    /**
     * 前端周刊
     *
     * @param page
     * @return
     */
    @GET("data/前端/10/{page}")
    Call<LeadingEnd> getGankLeadingEnd(@Path("page") int page);
}
