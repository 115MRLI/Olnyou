package only.you.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.gank.ResultsBean;
import only.you.presenter.IGankPresenter;
import only.you.presenter.impl.GankPresenterImpl;
import only.you.ui.adapter.GankAdapter;
import only.you.ui.contract.GankContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/5/10
 */
public class AndroidFragment extends BaseFragment implements GankContract {
    private IGankPresenter presenter;
    private int page = 1;
    private List<ResultsBean> list = new ArrayList<>();
    private GankAdapter adapter;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @Override
    protected int getLayout() {
        return R.layout.general_list_fragment;
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        presenter = new GankPresenterImpl();
        presenter.attachView(this);
        presenter.getGankAndroid(page);
        adapter = new GankAdapter(list);
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(List<ResultsBean> resultsBeen) {
        adapter.setChangeData(resultsBeen);
        adapter.setOnLoadListener(new GankAdapter.OnLoadListener() {
            @Override
            public void onLoadMore() {
                page++;
                presenter.getGankAndroid(page);
            }

            @Override
            public void onItmeClick(int position) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
