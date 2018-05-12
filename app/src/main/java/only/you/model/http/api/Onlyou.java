package only.you.model.http.api;

import java.util.List;

import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.model.bean.onlyoueyes.Classify;
import only.you.model.bean.onlyoueyes.Correlation;
import only.you.model.bean.onlyoueyes.Homepage;
import only.you.model.bean.onlyoueyes.One;
import only.you.model.bean.onlyoueyes.Search;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @name Onlyou
 * @class name：借鉴开眼api
 * @anthor 家佑
 * @time 2018/4/18
 */
public interface Onlyou {
    //获取分类
    //http://baobab.wandoujia.com/api/v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83

    //分类详情  category 名字， categoryId  id  ,start  开始的条数，num 获取的条数
    //http://baobab.wandoujia.com/api/v3/videos?category="广告"&categoryId=14&start=2&num=3

    //检索  query  关键字
    //http://baobab.kaiyanapp.com/api/v1/search?num=10&query=%E4%BD%A0&start=10

    //视频详情
    //http://baobab.wandoujia.com/api/v1/video/ 68092
    //详情页面推荐视频
    //http://baobab.wandoujia.com/api/v1/video/related/68092?num=5

    /**
     * 获取首页数据
     *
     * @return
     */
    @GET("v4/tabs/selected")
    Call<Homepage> getHomepage();

    /**
     * 下一页的推荐数据
     *
     * @return
     */
    @GET("v4/tabs/selected")
    Call<Homepage> getNextHomepage(@Query("date") long date, @Query("num") int num, @Query("page") int page);

    /**
     * 获取分类
     *
     * @return
     */
    @GET("v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    Call<List<Classify>> getClassify();

    /**
     * 获取分类详情
     *
     * @param category   分类名
     * @param categoryId 分类id
     * @param start      开始的条数
     * @param num        获取的条数
     * @return
     */
    @GET("v3/videos")
    Call<ClassificationDetails> getClassificationDetails(@Query("category") String category, @Query("categoryId") int categoryId, @Query("start") int start, @Query("num") int num);

    /**
     * 获取与该视频相关的视频
     *
     * @param id
     * @param num
     * @return
     */
    @GET("v1/video/related/{id}")
    Call<Correlation> getCorrelationCall(@Path("id") long id, @Query("num") int num);

    /**
     * 关键字搜索视频
     * @param query
     * @param start
     * @param num
     * @return
     */
    @GET("v1/search")
    Call<Search> getSearch(@Query("query") String query, @Query("start") int start, @Query("num") int num);

    /**
     * 获取每日一句话
     *
     * @param TransCode 030111
     * @param OpenId    123456789
     * @param Body      可以给一个空字符串
     * @return
     */
    @POST("https://api.hibai.cn/api/index/index")
    Call<One> getOne(@Field("TransCode") String TransCode, @Field("OpenId") String OpenId, @Field("Body") String Body);
}
