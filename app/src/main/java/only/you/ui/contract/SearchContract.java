package only.you.ui.contract;

import android.support.v7.widget.RecyclerView;

import only.you.base.BaseView;
import only.you.model.bean.onlyoueyes.Search;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 家佑
 * @time 2018/5/8
 */
public interface SearchContract extends BaseView {
    /**
     * 吐丝展示内容
     *
     * @param details 内容
     */
    void showToast(String details);

    /**
     * 加入适配器
     *
     * @param adapter
     */
    void addAdapter(RecyclerView.Adapter adapter);

    /**
     * 跳转详情
     *
     * @param bundle
     */
    void jumpThere(Search.ItemListBean bean);
}
