package only.you.ui.widget;

import android.support.v7.widget.RecyclerView;

/**
 * 解耦接口
 * 定义RecycleView的Adapter和SimpleItemTouchHelperCallback直接交互的接口方法
 * RecycleView的itme拖动
 *
 * @anthor 家佑
 * @time 2018/4/19
 */
public interface ItemTouchHelperAdapter {
    /**
     * 数据交换
     **/
    void onItemMove(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target);

    /**
     * 数据删除
     **/
    void onItemDissmiss(RecyclerView.ViewHolder source);

    /**
     * drag或者swipe选中
     **/
    void onItemSelect(RecyclerView.ViewHolder source);

    /**
     * 状态清除
     **/
    void onItemClear(RecyclerView.ViewHolder source);
}
