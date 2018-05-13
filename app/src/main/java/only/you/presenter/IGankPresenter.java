package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 家佑
 * @time 2018/5/12
 */
public interface IGankPresenter<T extends BaseView> extends BasePresenter<T> {
    /**
     * android 周刊
     *
     * @param page
     */
    void getGankAndroid(int page);

    /**
     * 前端
     *
     * @param page
     */
    void getGankExpand(int page);

    /**
     * ios
     *
     * @param page
     */
    void getGankIOS(int page);

    /**
     * jishu
     *
     * @param page
     */
    void getGankLeadingEnd(int page);
}
