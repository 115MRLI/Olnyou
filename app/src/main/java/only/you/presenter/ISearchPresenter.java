package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/8
 */
public interface ISearchPresenter<T extends BaseView> extends BasePresenter<T> {
    /**
     * 获取要搜索的关键字
     *
     * @param query
     */
    void getSearch(String query);
}
