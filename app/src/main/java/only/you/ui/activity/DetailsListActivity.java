package only.you.ui.activity;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.presenter.IDetailsListPresenter;
import only.you.presenter.impl.DetailsListPresenterImpl;
import only.you.ui.adapter.DetailsAdapter;
import only.you.ui.contract.DetailsLisContract;

public class DetailsListActivity extends AppCompatActivity  implements DetailsLisContract{
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.collapsing_toolbar_layout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private IDetailsListPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_list);
        ButterKnife.bind(this);

        initView();
        initEvent();
    }

    private void initEvent() {
        Bundle bundle = getIntent().getExtras();
        collapsingToolbarLayout.setTitle(bundle.getString("name"));
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
        Glide.with(this).load(bundle.getString("image")).centerCrop().skipMemoryCache(true).into(iv);
        presenter.loadIDetailsList(0,10,bundle.getString("name"),bundle.getInt("id"));
    }

    private void initView() {
        presenter = new DetailsListPresenterImpl();
        presenter.attachView(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_notifications) {
            Log.d("cylog", "click menu");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    /**
     * 跳转到本页面
     *
     * @param context
     */
    public static void junmHere(Context context,Bundle bundle) {
        Intent intent = new Intent(context, DetailsListActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    public void showToast(String details) {

    }

    @Override
    public void addAdapter(DetailsAdapter adapter) {
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

    @Override
    public void jumpHere(ClassificationDetails.ItemListBean item) {
        VideoDetailsActivity.junmpHereDetails(this,item);
    }

}
