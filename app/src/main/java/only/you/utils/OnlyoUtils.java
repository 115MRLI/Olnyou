package only.you.utils;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import only.you.app.App;
import only.you.model.bean.onlyoueyes.Classify;

/**
 * @name Onlyou
 * @class name：only.you.utils
 * @anthor 家佑
 * @time 2018/4/20
 */
public class OnlyoUtils {
    private static Toast toast = null;

    /**
     * 吐丝方法
     *
     * @param message 吐丝内容
     */
    public static void showToast(final String message) {
        ThreadUtils.runOnMainThread(new Runnable() {
            @Override
            public void run() {
                if (toast != null) {
                    toast.cancel();
                    toast = null;
                } else {
                    toast = Toast.makeText(App.mContext, message, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    /**
     * 按照List中的某个Int类型的属性进行排序
     *
     * @param list
     */
    @SuppressWarnings("unchecked")
    public static List sortIntMethod(List list) {
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Classify stu1 = (Classify) o1;
                Classify stu2 = (Classify) o2;
                if (stu1.getPosition() > stu2.getPosition()) {
                    return 1;
                } else if (stu1.getPosition() == stu2.getPosition()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        return list;
    }

    /**
     * 判断RecyclerView是否滚动到底部
     *
     * @param recyclerView
     * @return
     */
    public static boolean isVisBottom(RecyclerView recyclerView) {
        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        //屏幕中最后一个可见子项的position
        int lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
        //当前屏幕所看到的子项个数
        int visibleItemCount = layoutManager.getChildCount();
        //当前RecyclerView的所有子项个数
        int totalItemCount = layoutManager.getItemCount();
        //RecyclerView的滑动状态
        int state = recyclerView.getScrollState();
        if (visibleItemCount > 0 && lastVisibleItemPosition == totalItemCount - 1 && state == recyclerView.SCROLL_STATE_IDLE) {
            return true;
        } else {
            return false;
        }
    }
}
