package only.you.model.http.response;

import android.util.Log;

import java.util.List;

import only.you.model.bean.onlyoueyes.Correlation;
import only.you.model.http.api.Onlyou;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/7
 */
public class VideoDetailsModel {
    //    ApiRetrofit retrofit = new ApiRetrofit();
//    Onlyou apis = retrofit.getOnlyouApisService();
    private VideoDetailsListener listener;
    private Onlyou apis;

    public void getCorrelationCall(long id, int num) {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<Correlation> call = apis.getCorrelationCall(id, num);
        call.enqueue(new Callback<Correlation>() {
            @Override
            public void onResponse(Call<Correlation> call, Response<Correlation> response) {
                List<Correlation.VideoListBean> videoListBeen = response.body().getVideoList();
                Log.e("检索字符长度", videoListBeen.size() + "");
                listener.setMenu(videoListBeen);
            }

            @Override
            public void onFailure(Call<Correlation> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    public interface VideoDetailsListener {
        /**
         * 在view层展示弹窗
         *
         * @param content 弹窗内容
         */
        void showDialog(String content);

        /**
         * 获取菜单数据
         */
        void setMenu(List<Correlation.VideoListBean> videoListBeen);
    }

    public void setVideoDetailsListener(VideoDetailsListener listener2) {
        listener = listener2;
    }
}
