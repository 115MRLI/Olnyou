package only.you.model.http.api;

import java.io.File;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import only.you.app.App;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @name Onlyou
 * @class name：only.you.model.http.api
 * @anthor 家佑
 * @time 2018/4/20
 */
public class ApiRetrofit {
    public static final String Eyes_BASE_URL = "http://baobab.kaiyanapp.com/api/";
    public Onlyou OnlyouApiService;
//    private static Retrofit retrofit;
    public Onlyou getOnlyouApisService() {
        return OnlyouApiService;
    }
    public ApiRetrofit() {
        //缓存文件夹
        File cacheFile = new File(App.mContext.getCacheDir(), "responses");
        //缓存大小为10M
        int cacheSize = 10 * 1024 * 1024;
        //创建缓存对象
        Cache cache = new Cache(cacheFile, cacheSize);

        OkHttpClient client = new OkHttpClient.Builder()
                .cache(cache)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Eyes_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        OnlyouApiService = retrofit.create(Onlyou.class);

    }


//    private static Retrofit.Builder builder = new Retrofit.Builder()
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .baseUrl(apiBaseUrl);
//
//
//    public static void changeApiBaseUrl(String newApiBaseUrl) {
//        apiBaseUrl = newApiBaseUrl;
//
//        builder = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl(apiBaseUrl);
//    }

}
