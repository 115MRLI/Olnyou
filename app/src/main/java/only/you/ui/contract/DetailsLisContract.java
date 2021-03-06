package only.you.ui.contract;

import only.you.base.BaseView;
import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.ui.adapter.DetailsAdapter;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 家佑
 * @time 2018/5/2
 */
public interface DetailsLisContract extends BaseView {
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
    void addAdapter(DetailsAdapter adapter);

    /**
     * 跳转到详情页
     */
    void jumpHere(ClassificationDetails.ItemListBean item);
}
