package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/9
 */
public interface IAdmireInTheHeartPresenter<T extends BaseView> extends BasePresenter<T> {
    void getGankWelfare(int page);
}
