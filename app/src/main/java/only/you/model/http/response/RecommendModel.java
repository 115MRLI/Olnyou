package only.you.model.http.response;

import android.util.Log;

import java.util.List;

import only.you.model.bean.onlyoueyes.Homepage;
import only.you.model.http.api.Onlyou;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 家佑
 * @time 2018/5/4
 */
public class RecommendModel {
    private RecommendListener listener;
//    ApiRetrofit retrofit = new ApiRetrofit();
//    Onlyou apis = retrofit.getOnlyouApisService();

    private  Onlyou apis;
    public void getRecommend() {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<Homepage> call = apis.getHomepage();
        call.enqueue(new Callback<Homepage>() {
            @Override
            public void onResponse(Call<Homepage> call, Response<Homepage> response) {

                List<Homepage.ItemListBean> itemList = response.body().getItemList();
                Log.e("详情名字", itemList.size() + " **************");
                Log.e("详情名字", response.body().toString());
//
                for (int i = 0; i < itemList.size(); i++) {
                    if (!itemList.get(i).getType().equals("video")) {
                        itemList.remove(i);
                    }
//                    Log.e("详情名字",itemList.get(i).toString());
                }
                String url = response.body().getNextPageUrl();
                String url1 = url.substring(url.indexOf("date="), url.length());
                url1 = url1.replaceAll("date=", "");
                long date = Long.parseLong(url1.substring(0, url1.indexOf("&num")));
                listener.setMenu(itemList, date);
            }

            @Override
            public void onFailure(Call<Homepage> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    public void getLoad(long data) {
        Log.e("date", "下一个：" + data);
        Call<Homepage> call = apis.getNextHomepage(data, 2, 3);
        call.enqueue(new Callback<Homepage>() {
            @Override
            public void onResponse(Call<Homepage> call, Response<Homepage> response) {
                List<Homepage.ItemListBean> itemList = response.body().getItemList();
                for (int i = 0; i < itemList.size(); i++) {
                    if (!itemList.get(i).getType().equals("video")) {
                        itemList.remove(i);
                    }
                }
                String url = response.body().getNextPageUrl();
                String url1 = url.substring(url.indexOf("date="));
                url1 = url1.replaceAll("date=", "");
                long date = Long.parseLong(url1.substring(0, url1.indexOf("&num")));
                listener.getMoreLoad(itemList, date);
            }

            @Override
            public void onFailure(Call<Homepage> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    public interface RecommendListener {
        /**
         * 在view层展示弹窗
         *
         * @param content 弹窗内容
         */
        void showDialog(String content);

        /**
         * 获取菜单数据
         */
        void setMenu(List<Homepage.ItemListBean> itemList, long data);

        /**
         * 加载更多
         *
         * @param itemList
         * @param data
         */
        void getMoreLoad(List<Homepage.ItemListBean> itemList, long data);
    }

    public void setRecommendListener(RecommendListener listener2) {
        listener = listener2;
    }
}
