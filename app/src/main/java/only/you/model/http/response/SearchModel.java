package only.you.model.http.response;

import java.util.List;

import only.you.model.bean.onlyoueyes.Search;
import only.you.model.http.api.Onlyou;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/8
 */
public class SearchModel {
//    private ApiRetrofit retrofit = new ApiRetrofit();
//    private Onlyou apis = retrofit.getOnlyouApisService();
    private SearchListener listener;
    private Onlyou apis;
    public void getSearch(String query, int start, int num) {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<Search> call = apis.getSearch(query, start, num);
        call.enqueue(new Callback<Search>() {
            @Override
            public void onResponse(Call<Search> call, Response<Search> response) {
                List<Search.ItemListBean> itemList = response.body().getItemList();

//                Log.e("检索", itemList.size() + " **************");
//                Log.e("检索", response.body().toString());
                listener.setMenu(itemList);
            }

            @Override
            public void onFailure(Call<Search> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });
    }

    public interface SearchListener {
        /**
         * 在view层展示弹窗
         *
         * @param content 弹窗内容
         */
        void showDialog(String content);

        /**
         * 获取菜单数据
         */
        void setMenu(List<Search.ItemListBean> itemList);
    }

    public void setSearchListener(SearchListener listener2) {
        listener = listener2;
    }
}
