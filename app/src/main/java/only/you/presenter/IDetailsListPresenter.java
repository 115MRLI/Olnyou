package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/2
 */
public interface IDetailsListPresenter<T extends BaseView>  extends BasePresenter<T>{
    /**
     * 获取分类列表
     *
     * @param start
     * @param num
     * @param category
     * @param categoryId
     */
    void loadIDetailsList(int start, int num, String category, int categoryId);
}
