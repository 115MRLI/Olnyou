package only.you.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.presenter.IDetailsListPresenter;
import only.you.presenter.impl.DetailsListPresenterImpl;
import only.you.ui.activity.VideoDetailsActivity;
import only.you.ui.adapter.DetailsAdapter;
import only.you.ui.contract.DetailsLisContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/3
 */
public class GeneralListFragment extends BaseFragment implements DetailsLisContract {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private IDetailsListPresenter presenter;
//    @BindView(R.id.loadingline)
//    LinearLayout loadingline;

    @Override
    protected int getLayout() {
        return R.layout.general_list_fragment;
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        Bundle bundle = getArguments();
        presenter = new DetailsListPresenterImpl();
        presenter.attachView(this);
        presenter.loadIDetailsList(0, 10, bundle.getString("name"), bundle.getInt("id"));
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
//        if (recycler.canScrollVertically(1) == true) {
//            OnlyoUtils.showToast("方法1滑动到底部了");
//        }
//
//        if (OnlyoUtils.isVisBottom(recycler) == true) {
//            OnlyoUtils.showToast("方法2滑动到底部了");
//        }
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(DetailsAdapter adapter) {
        if (adapter != null) {
            recycler.setAdapter(adapter);
        } else {
            OnlyoUtils.showToast("数据加载失败");
        }

    }

    @Override
    public void jumpHere(ClassificationDetails.ItemListBean item) {
        VideoDetailsActivity.junmpHereDetails(getActivity(), item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
