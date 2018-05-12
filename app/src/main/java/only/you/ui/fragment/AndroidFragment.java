package only.you.ui.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import only.you.R;
import only.you.base.BaseFragment;
import only.you.ui.contract.AndroidContract;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/5/10
 */
public class AndroidFragment extends BaseFragment implements AndroidContract {
    @Override
    protected int getLayout() {
        return R.layout.general_list_fragment;
    }

    @Override
    protected void initView(LayoutInflater inflater) {
        super.initView(inflater);
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    public void showToast(String details) {

    }

    @Override
    public void addAdapter(RecyclerView.Adapter adapter) {

    }
}
