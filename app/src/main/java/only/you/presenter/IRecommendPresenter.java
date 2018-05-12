package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 家佑
 * @time 2018/5/4
 */
public interface IRecommendPresenter<T extends BaseView> extends BasePresenter<T> {
    /**
     * 获取推荐
     */
    void getRecommend();
}
