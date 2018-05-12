package only.you.model.http.response;

import java.util.List;

import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.model.http.api.Onlyou;
import only.you.model.http.api.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @name Onlyou
 * @class name：only.you.model.http.response
 * @anthor 家佑
 * @time 2018/5/2
 */
public class DetailsListModel {
    //    ApiRetrofit retrofit = new ApiRetrofit();
//    Onlyou apis = retrofit.getOnlyouApisService();
    private DetailsListener listener;
    private Onlyou apis;

    /**
     * 加载分类信息
     *
     * @param start
     * @param num
     * @param category
     * @param categoryId
     */
    public void loadIDetailsList(final int start, int num, String category, int categoryId) {
        ServiceGenerator.changeApiBaseUrl("http://baobab.kaiyanapp.com/api/");
        apis = ServiceGenerator.createServiceFrom(Onlyou.class);
        Call<ClassificationDetails> call = apis.getClassificationDetails(category, categoryId, start, num);
        call.enqueue(new Callback<ClassificationDetails>() {
            @Override
            public void onResponse(Call<ClassificationDetails> call, Response<ClassificationDetails> response) {

                List<ClassificationDetails.ItemListBean> itemList = response.body().getItemList();
//                for (ClassificationDetails.ItemListBean itemListBean : itemList) {
//                    Log.e("详情名字", itemListBean.getData().getTitle() + "--------" + itemListBean.getData().getCover().getDetail());
//                }
                if (start == 0) {
                    listener.setMenu(itemList);
                } else {
                    listener.setLoad(itemList);
                }

            }

            @Override
            public void onFailure(Call<ClassificationDetails> call, Throwable t) {
                listener.showDialog(t.toString());
            }
        });

    }

    //回调接口
    public interface DetailsListener {
        /**
         * 在view层展示弹窗
         *
         * @param content 弹窗内容
         */
        void showDialog(String content);

        /**
         * 获取菜单数据
         */
        void setMenu(List<ClassificationDetails.ItemListBean> list);

        /**
         * 加载更多
         *
         * @param list
         */
        void setLoad(List<ClassificationDetails.ItemListBean> list);

    }

    /**
     * 设置回调
     *
     * @param listener2
     */
    public void setClassifyListener(DetailsListener listener2) {
        listener = listener2;
    }
}
