package only.you.presenter.impl;

import java.util.List;

import only.you.model.bean.onlyoueyes.Correlation;
import only.you.model.bean.onlyoueyes.Utilsbean;
import only.you.model.http.response.VideoDetailsModel;
import only.you.presenter.IVideoDetailsPresenter;
import only.you.ui.adapter.VideoDetailsAdapter;
import only.you.ui.contract.VideoDetailsContract;

/**
 * @name Onlyou
 * @class name：only.you.presenter.impl
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/7
 */
public class VideoDetailsPresenterImpl<T extends VideoDetailsContract> implements IVideoDetailsPresenter<T>, VideoDetailsModel.VideoDetailsListener {
    private T baseView;
    private VideoDetailsModel model;

    public VideoDetailsPresenterImpl() {
        model = new VideoDetailsModel();
        model.setVideoDetailsListener(this);
    }

    @Override
    public void attachView(T baseView) {
        this.baseView = baseView;
    }

    @Override
    public void detachView() {
        baseView = null;
    }

    @Override
    public void getCorrelationCall(long id, int num) {
        model.getCorrelationCall(id, num);
    }

    @Override
    public void showDialog(String content) {
        if (baseView != null) {
            baseView.showToast(content);
        }
    }

    @Override
    public void setMenu(List<Correlation.VideoListBean> videoListBeen) {
        if (baseView != null) {
            VideoDetailsAdapter adapter = new VideoDetailsAdapter(videoListBeen);
            baseView.addAdapter(adapter);
            adapter.setClickListener(new VideoDetailsAdapter.ClickListener() {
                @Override
                public void onItmeClick(Correlation.VideoListBean bean) {
                    Utilsbean utilsbean = new Utilsbean(bean.getId(), bean.getPlayUrl(), bean.getTitle(), bean.getCoverForDetail()
                            , bean.getDescription(), bean.getCategory(), bean.getTags().get(0).getName(), bean.getTags().get(1).getName()
                            , bean.getTags().get(2).getName(), bean.getTags().get(0).getBgPicture(), bean.getTags().get(1).getBgPicture(), bean.getTags().get(2).getBgPicture());
                    baseView.initViews(utilsbean);
                }
            });
        }

    }
}
