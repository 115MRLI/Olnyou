package only.you.ui.fragment;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.gank.ResultsBean;
import only.you.presenter.IGankPresenter;
import only.you.presenter.impl.GankPresenterImpl;
import only.you.ui.activity.GankWebActivity;
import only.you.ui.adapter.GankAdapter;
import only.you.ui.contract.GankContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/4/24
 */
public class MyselFragment extends BaseFragment implements GankContract {
    private IGankPresenter presenter;
    private int page = 1;
    private List<ResultsBean> list = new ArrayList<>();
    private GankAdapter adapter;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.titlestr)
    TextView titlestr;
    @Override
    protected int getLayout() {
        return R.layout.myself_fragment;
    }

    @Override
    public void onAttach(Context mContext) {
        super.onAttach(mContext);
    }

    @Override
    protected void lazyFetchData() {
        super.lazyFetchData();
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        presenter = new GankPresenterImpl();
        presenter.attachView(this);
        presenter.getGankExpand(page);
        adapter = new GankAdapter(list);
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        //得到AssetManager
        AssetManager mgr = getActivity().getAssets();
        //根据路径得到Typeface
        Typeface tf = Typeface.createFromAsset(mgr, "fonts/woman.ttf");
        //设置字体
        titlestr.setTypeface(tf);
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
                presenter.getGankExpand(page);
            }

            @Override
            public void onItmeClick(ResultsBean gank) {
                GankWebActivity.jumpHere(getActivity(),gank.getUrl(),"技术杂烩");
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
