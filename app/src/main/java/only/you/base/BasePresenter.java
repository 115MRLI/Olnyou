package only.you.base;

/**
 * @name VideoDome
 * @class name：video.videodome.base
 * @anthor 家佑
 * @time 2018/4/10
 */
public interface BasePresenter<V extends BaseView> {

    void attachView(V baseView);

    void detachView();
}
