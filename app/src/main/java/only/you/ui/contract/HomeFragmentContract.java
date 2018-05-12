package only.you.ui.contract;

import android.support.v7.widget.RecyclerView;

import only.you.base.BaseView;
import only.you.ui.adapter.OnlyouMenuAdapter;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/4/24
 */
public interface HomeFragmentContract extends BaseView {
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
    void addAdapter(OnlyouMenuAdapter adapter);
}
