package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 家佑
 * @time 2018/5/5
 */
public interface IVideoDetailsPresenter<T extends BaseView> extends BasePresenter<T> {
    /**
     * 获取相关视频
     *
     * @param id
     * @param num
     */
    void getCorrelationCall(long id, int num);
}
