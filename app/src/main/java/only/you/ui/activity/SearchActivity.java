package only.you.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseActivity;
import only.you.model.bean.onlyoueyes.Search;
import only.you.presenter.ISearchPresenter;
import only.you.presenter.impl.SearchPresenterImpl;
import only.you.ui.contract.SearchContract;
import only.you.utils.OnlyoUtils;

public class SearchActivity extends BaseActivity implements View.OnClickListener, SearchContract {
    @BindView(R.id.search_lin)
    LinearLayout searchLin;

    @BindView(R.id.search_et)
    EditText searchEt;

    @BindView(R.id.cancal)
    ImageView cancal;

    @BindView(R.id.search_tv)
    TextView searchTv;

    @BindView(R.id.recycler)
    RecyclerView recycler;

    private ISearchPresenter presenter;
    @Override
    protected int getLayout() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView() {
        super.initView();
        keyboad(true);
        presenter = new SearchPresenterImpl();
        presenter.attachView(this);
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        searchTv.setOnClickListener(this);
        cancal.setOnClickListener(this);
        cancal.setVisibility(View.GONE);
        //输入框的输入判断
        searchEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    searchLin.setVisibility(View.VISIBLE);
                    cancal.setVisibility(View.GONE);
                } else {
                    searchLin.setVisibility(View.GONE);
                    cancal.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    protected void getIntentData() {
        super.getIntentData();
    }

    /**
     * 软键盘的弹出或者关闭
     *
     * @param flag
     */
    private void keyboad(boolean flag) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (flag) {
            // 获取编辑框焦点
            searchEt.setFocusable(true);
            //打开软键盘

            imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        } else {
            //关闭软键盘
            imm.hideSoftInputFromWindow(searchEt.getWindowToken(), 0);
        }


    }

    /**
     * 其他标签跳转到
     *
     * @param activity
     */
    public static void junmpHereSearch(Activity activity) {
        Intent intent = new Intent(activity, SearchActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_tv:
                keyboad(false);
                presenter.getSearch(searchEt.getText().toString().trim());
                break;
            case R.id.cancal:
                searchEt.setText("");
                break;
            default:
                break;
        }
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(RecyclerView.Adapter adapter) {
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

    @Override
    public void jumpThere(Search.ItemListBean bean) {
        VideoDetailsActivity.junmpHereSearch(this, bean);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
