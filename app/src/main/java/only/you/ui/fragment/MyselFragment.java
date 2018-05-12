package only.you.ui.fragment;

import android.content.Context;
import android.view.LayoutInflater;

import only.you.R;
import only.you.base.BaseFragment;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/4/24
 */
public class MyselFragment extends BaseFragment{
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
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }
}
