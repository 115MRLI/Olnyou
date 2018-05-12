package only.you.ui.contract;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 家佑
 * @time 2018/4/19
 */
public interface ClassifyContract extends BaseView {
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
     * 跳转分类详情
     */
    void jumpThere(Bundle bundle);
}
