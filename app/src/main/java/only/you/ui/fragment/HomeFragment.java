package only.you.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import only.you.model.bean.onlyoueyes.Classify;
import only.you.presenter.IOlnyouPresenter;
import only.you.presenter.impl.OlnyouPresenterImpl;
import only.you.ui.activity.ClassifyActivity;
import only.you.ui.activity.SearchActivity;
import only.you.ui.adapter.OnlyouMenuAdapter;
import only.you.ui.contract.HomeFragmentContract;
import only.you.utils.OnlyoUtils;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/4/24
 */
public class HomeFragment extends BaseFragment implements HomeFragmentContract, View.OnClickListener {
    @BindView(R.id.menu_lin)
    LinearLayout menuLin;
    @BindView(R.id.search_lin)
    LinearLayout searchLin;
    @BindView(R.id.recycle)
    RecyclerView recycle;
    private IOlnyouPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.home_fragment;
    }

    @Override
    protected void lazyFetchData() {
        super.lazyFetchData();
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
        presenter = new OlnyouPresenterImpl();
        presenter.attachView(this);
        presenter.loadMenuData();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        menuLin.setOnClickListener(this);
        searchLin.setOnClickListener(this);
        RecommendFragment recommendFragment = new RecommendFragment();
        showFragment(recommendFragment);

    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(OnlyouMenuAdapter adapter) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycle.setLayoutManager(layoutManager);
        recycle.setAdapter(adapter);
        adapter.setOnlyouMenuListener(new OnlyouMenuAdapter.OnlyouMenuListener() {
            @Override
            public void getData(Classify item) {
                GeneralListFragment generalListFragment = new GeneralListFragment();
                Bundle bundle = new Bundle();
                // 传递实体类，需要实体类实现Serializable接口
                bundle.putSerializable("name", item.getName());
                // 传递int类型数
                bundle.putInt("id", item.getId());
                //设置数据
                generalListFragment.setArguments(bundle);
                //调用上面的方法由 fragment1 跳转到 fragment2
                showFragment(generalListFragment);
            }

            @Override
            public void getRecommend() {
                RecommendFragment recommendFragment = new RecommendFragment();
                showFragment(recommendFragment);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_lin:
                ClassifyActivity.junmHere(getContext());
                break;
            case R.id.search_lin:
//                DetailsListActivity.junmHere(getContext());
                SearchActivity.junmpHereSearch(getActivity());
                break;
            default:
                break;
        }
    }

    /**
     * @param fragment2 跳转后的fragment
     */
    private void showFragment(Fragment fragment2) {
        // 获取 FragmentTransaction  对象
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        //如果fragment2没有被添加过，就添加它替换当前的fragment1
        transaction.replace(R.id.framee, fragment2).commit();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
