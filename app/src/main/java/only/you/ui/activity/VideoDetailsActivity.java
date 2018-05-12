package only.you.ui.activity;


import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import butterknife.BindView;
import cn.jzvd.JZVideoPlayerStandard;
import only.you.R;
import only.you.base.BaseActivity;
import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.model.bean.onlyoueyes.Homepage;
import only.you.model.bean.onlyoueyes.Search;
import only.you.model.bean.onlyoueyes.Utilsbean;
import only.you.presenter.IVideoDetailsPresenter;
import only.you.presenter.impl.VideoDetailsPresenterImpl;
import only.you.ui.contract.VideoDetailsContract;

public class VideoDetailsActivity extends BaseActivity implements VideoDetailsContract {
    @BindView(R.id.videoplayer)
    JZVideoPlayerStandard videoplayer;
    @BindView(R.id.videotitle)
    TextView videotitle;
    @BindView(R.id.videodetails)
    TextView videodetails;
    @BindView(R.id.videotype)
    TextView videotype;
    @BindView(R.id.tagstv1)
    TextView tagstv1;
    @BindView(R.id.tagstv3)
    TextView tagstv3;
    @BindView(R.id.tagstv2)
    TextView tagstv2;
    @BindView(R.id.tagsiv1)
    ImageView tagsiv1;
    @BindView(R.id.tagsiv2)
    ImageView tagsiv2;
    @BindView(R.id.tagsiv3)
    ImageView tagsiv3;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.theendstr)
    TextView theendstr;

    private long id;

    private IVideoDetailsPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_video_details;
    }

    @Override
    protected void initView() {
        super.initView();
        presenter = new VideoDetailsPresenterImpl();
        presenter.attachView(this);

    }

    @Override
    protected void initEvent() {
        super.initEvent();

        Intent intent = this.getIntent();
        if (intent.getExtras().getInt("flag") == 2) {
            Homepage.ItemListBean item = (Homepage.ItemListBean) intent.getSerializableExtra("item");

            Utilsbean utilsbean = new Utilsbean(item.getData().getId(), item.getData().getPlayUrl(), item.getData().getTitle(), item.getData().getCover().getDetail()
                    , item.getData().getDescription(), item.getData().getCategory(), item.getData().getTags().get(0).getName(), item.getData().getTags().get(1).getName()
                    , item.getData().getTags().get(2).getName(), item.getData().getTags().get(0).getBgPicture(), item.getData().getTags().get(1).getBgPicture(), item.getData().getTags().get(2).getBgPicture());
            initViews(utilsbean);
        } else if (intent.getExtras().getInt("flag") == 1){
            ClassificationDetails.ItemListBean item = (ClassificationDetails.ItemListBean) intent.getSerializableExtra("item");
            Utilsbean utilsbean = new Utilsbean(item.getData().getId(), item.getData().getPlayUrl(), item.getData().getTitle(), item.getData().getCover().getDetail()
                    , item.getData().getDescription(), item.getData().getCategory(), item.getData().getTags().get(0).getName(), item.getData().getTags().get(1).getName()
                    , item.getData().getTags().get(2).getName(), item.getData().getTags().get(0).getBgPicture(), item.getData().getTags().get(1).getBgPicture(), item.getData().getTags().get(2).getBgPicture());
            initViews(utilsbean);
        }else {
            Search.ItemListBean item = (Search.ItemListBean) intent.getSerializableExtra("item");
            Utilsbean utilsbean = new Utilsbean(item.getData().getId(), item.getData().getPlayUrl(), item.getData().getTitle(), item.getData().getCover().getDetail()
                    , item.getData().getDescription(), item.getData().getCategory(), item.getData().getTags().get(0).getName(), item.getData().getTags().get(1).getName()
                    , item.getData().getTags().get(2).getName(), item.getData().getTags().get(0).getBgPicture(), item.getData().getTags().get(1).getBgPicture(), item.getData().getTags().get(2).getBgPicture());
            initViews(utilsbean);
        }
        setTextStyles(videotitle, true);
        setTextStyles(theendstr, false);
        recycler.setNestedScrollingEnabled(false);
    }

    @Override
    protected void getIntentData() {
        super.getIntentData();
    }

    /**
     * 主页跳转到
     *
     * @param activity
     * @param item
     */
    public static void jumpHereHome(Activity activity, Homepage.ItemListBean item) {
        Intent intent = new Intent(activity, VideoDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("item", item);
        bundle.putInt("flag", 2);
        intent.putExtras(bundle);
        Log.e("跳转测试", "跳跳转了.........");
        activity.startActivity(intent);
    }

    /**
     * 其他标签跳转到
     *
     * @param activity
     * @param item
     */
    public static void junmpHereDetails(Activity activity, ClassificationDetails.ItemListBean item) {
        Intent intent = new Intent(activity, VideoDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("item", item);
        bundle.putInt("flag", 1);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    /**
     * 搜索跳转到
     *
     * @param activity
     * @param item
     */
    public static void junmpHereSearch(Activity activity, Search.ItemListBean item) {
        Intent intent = new Intent(activity, VideoDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("item", item);
        bundle.putInt("flag", 3);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    /**
     * 设置字体样式
     *
     * @param view
     * @param flag
     */
    private void setTextStyles(TextView view, boolean flag) {
        //得到AssetManager
        AssetManager mgr = getAssets();
        Typeface tf = null;
        if (flag) {
            //根据路径得到Typeface
            tf = Typeface.createFromAsset(mgr, "fonts/woman.ttf");
        } else {

            //根据路径得到Typeface
            tf = Typeface.createFromAsset(mgr, "fonts/fish.TTF");
        }

        //设置字体
        view.setTypeface(tf);
    }

    @Override
    public void onBackPressed() {
        if (videoplayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoplayer.releaseAllVideos();
    }

    @Override
    public void showToast(String details) {

    }

    @Override
    public void addAdapter(RecyclerView.Adapter adapter) {
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }

    @Override
    public void initViews(Utilsbean utilsbean) {
        videoplayer.releaseAllVideos();
        id = utilsbean.getId();
        videoplayer.setUp(utilsbean.getPlayUrl(), JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, utilsbean.getTitle());
        videoplayer.thumbImageView.setImageURI(Uri.parse(utilsbean.getDetail()));
        videotitle.setText(utilsbean.getTitle());
        videodetails.setText(utilsbean.getDescription());
        videotype.setText(" # " + utilsbean.getCategory() + " # ");
        tagstv1.setText(" # " + utilsbean.getTagstr1() + " # ");
        tagstv2.setText(" # " + utilsbean.getTagstr2() + " # ");
        tagstv3.setText(" # " + utilsbean.getTagstr3() + " # ");
        Glide.with(this).load(utilsbean.getTagstriv3()).centerCrop().skipMemoryCache(true).into(tagsiv1);
        Glide.with(this).load(utilsbean.getTagstriv2()).centerCrop().skipMemoryCache(true).into(tagsiv2);
        Glide.with(this).load(utilsbean.getTagstriv1()).centerCrop().skipMemoryCache(true).into(tagsiv3);
        presenter.getCorrelationCall(id, 5);
        videoplayer.startVideo();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
