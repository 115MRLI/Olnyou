package only.you.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.onlyoueyes.Homepage;
import only.you.presenter.IRecommendPresenter;
import only.you.presenter.impl.RecommendPresenterImpl;
import only.you.ui.activity.VideoDetailsActivity;
import only.you.ui.contract.RecommendContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/5/3
 */
public class RecommendFragment extends BaseFragment implements RecommendContract {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private IRecommendPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.general_list_fragment;
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        presenter = new RecommendPresenterImpl();
        presenter.attachView(this);
        presenter.getRecommend();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(RecyclerView.Adapter adapter) {
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler.setAdapter(adapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void jumpHere(Homepage.ItemListBean item) {
        VideoDetailsActivity.jumpHereHome(getActivity(),item);
        Log.e("跳转测试","开始跳转了.........");
    }
}
