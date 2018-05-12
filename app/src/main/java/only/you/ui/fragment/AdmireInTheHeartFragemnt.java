package only.you.ui.fragment;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.gank.MeiZhi;
import only.you.presenter.IAdmireInTheHeartPresenter;
import only.you.presenter.impl.AdmireInTheHeartPresenterImpl;
import only.you.ui.activity.GankPicActivity;
import only.you.ui.adapter.GankListAdapter;
import only.you.ui.contract.AdmireInTheHeartContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/4/24
 */
public class AdmireInTheHeartFragemnt extends BaseFragment implements AdmireInTheHeartContract  {
    @BindView(R.id.recycle)
    RecyclerView recycle;
    @BindView(R.id.titlestr)
    TextView titlestr;
    private GankListAdapter gankListAdapter;
    private List<MeiZhi.ResultsBean> results = new ArrayList<>();
    private IAdmireInTheHeartPresenter presenter;
    private int page = 1;

    @Override
    protected int getLayout() {
        return R.layout.admireintheheart_fragment;
    }

    @Override
    protected void lazyFetchData() {
        super.lazyFetchData();
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        presenter = new AdmireInTheHeartPresenterImpl();
        presenter.attachView(this);
        gankListAdapter = new GankListAdapter(results);
        recycle.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        recycle.setLayoutManager(new LinearLayoutManager(getContext()));
        recycle.setAdapter(gankListAdapter);
    }

    @Override
    protected void initEvent() {
        super.initEvent();
//        CardItemTouchHelperCallback cardCallback = new CardItemTouchHelperCallback(recycle.getAdapter(), results);
//        ItemTouchHelper touchHelper = new ItemTouchHelper(cardCallback);
//        CardLayoutManager cardLayoutManager = new CardLayoutManager(recycle, touchHelper);
//        recycle.setLayoutManager(cardLayoutManager);
//        touchHelper.attachToRecyclerView(recycle);
        presenter.getGankWelfare(page);
        gankListAdapter.setOnLoadListener(new GankListAdapter.OnLoadListener() {
            @Override
            public void onLoadMore() {
                page++;
                presenter.getGankWelfare(page);
            }

            @Override
            public void onItmeClick(int position) {
                GankPicActivity.jumpHere(getActivity(),gankListAdapter.getAdapterDate(),position);
            }
        });
        //设置字体样式
        AssetManager mgr = getActivity().getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "fonts/woman.ttf");
        titlestr.setTypeface(tf);
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(List<MeiZhi.ResultsBean> results) {
        gankListAdapter.setChangeData(results);
    }

    @Override
    public void jumpThere(Bundle bundle) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

}
