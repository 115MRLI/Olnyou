package only.you.ui.activity;


import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import only.you.R;
import only.you.app.App;
import only.you.base.BaseActivity;
import only.you.presenter.IClassifyPresenter;
import only.you.presenter.impl.ClassifyPresenterImpl;
import only.you.ui.adapter.MenuAdaptet;
import only.you.ui.contract.ClassifyContract;
import only.you.ui.widget.ItemTouchHelperAdapter;
import only.you.ui.widget.SimpleItemTouchHelperCallback;
import only.you.utils.OnlyoUtils;

public class ClassifyActivity extends BaseActivity implements ClassifyContract {
    @BindView(R.id.recycle)
    RecyclerView recyclerView;
    @BindView(R.id.back_lin)
    LinearLayout backLin;
    @BindView(R.id.titlestr)
    TextView titleStr;
    IClassifyPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_classify;
    }

    @Override
    protected void initView() {
        presenter = new ClassifyPresenterImpl();
        presenter.attachView(this);
        presenter.loadMenuData();
        super.initView();
    }

    @Override
    protected void initEvent() {
        //根据路径得到Typeface
        Typeface tf = App.setFontType(true);
        //设置字体
        titleStr.setTypeface(tf);
        //返回
        backLin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        super.initEvent();
    }

    @Override
    protected void getIntentData() {
        super.getIntentData();
    }

    @Override
    public void showToast(String details) {
        OnlyoUtils.showToast(details);
    }

    @Override
    public void addAdapter(RecyclerView.Adapter adapter) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        //创建SimpleItemTouchHelperCallback
        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback((ItemTouchHelperAdapter) adapter);
        //用Callback构造ItemtouchHelper
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        //调用ItemTouchHelper的attachToRecyclerView方法建立联系
        touchHelper.attachToRecyclerView(recyclerView);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.upDataTable();
    }

    @Override
    public void jumpThere(Bundle bundle) {
        DetailsListActivity.junmHere(this,bundle);
    }

    /**
     * 跳转到本页面
     * @param context
     */
    public  static void junmHere(Context context){
        context.startActivity(new Intent(context,ClassifyActivity.class));
    }
}
