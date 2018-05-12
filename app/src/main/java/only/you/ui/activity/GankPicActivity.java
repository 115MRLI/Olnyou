package only.you.ui.activity;


import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import only.you.R;
import only.you.app.App;
import only.you.base.BaseActivity;
import only.you.model.bean.gank.MeiZhi;
import only.you.ui.widget.MNGestureView;
import only.you.ui.widget.ZoomOutPageTransformer;

public class GankPicActivity extends BaseActivity {
    @BindView(R.id.viewPagerBrowser)
    ViewPager viewPagerBrowser;
    @BindView(R.id.mnGestureView)
    MNGestureView mnGestureView;
    @BindView(R.id.tvNumShow)
    TextView tvNumShow;
    @BindView(R.id.rl_black_bg)
    RelativeLayout rl_black_bg;


    private ImageView currentImageView; //需要保存的图片
    private List<MeiZhi.ResultsBean> welFareLists = new ArrayList<>();
    private int currentPosition = 0;
    private GankPicActivity context;

    @Override
    protected int getLayout() {
        return R.layout.activity_gank_pic;
    }

    @Override
    protected void initView() {
        super.initView();
        context = this;
        List<MeiZhi.ResultsBean> resultsBeen = (List<MeiZhi.ResultsBean>) getIntent().getSerializableExtra("resultsBeen");
        currentPosition = getIntent().getIntExtra("position",0);
        welFareLists.addAll(resultsBeen);

    }

    @Override
    protected void initEvent() {
        super.initEvent();
        tvNumShow.setText(String.valueOf((currentPosition + 1) + "/" + welFareLists.size()));
        viewPagerBrowser.setAdapter(new MyAdapter());
        viewPagerBrowser.setPageTransformer(true, new ZoomOutPageTransformer());
        viewPagerBrowser.setCurrentItem(currentPosition);
        viewPagerBrowser.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPosition = position;
                tvNumShow.setText(String.valueOf((position + 1) + "/" + welFareLists.size()));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mnGestureView.setOnSwipeListener(new MNGestureView.OnSwipeListener() {
            @Override
            public void downSwipe() {
                finishBrowser();
            }

            @Override
            public void onSwiping(float deltaY) {
                tvNumShow.setVisibility(View.GONE);

                float mAlpha = 1 - deltaY / 500;
                if (mAlpha < 0.3) {
                    mAlpha = 0.3f;
                }
                if (mAlpha > 1) {
                    mAlpha = 1;
                }
                rl_black_bg.setAlpha(mAlpha);
            }

            @Override
            public void overSwipe() {
                tvNumShow.setVisibility(View.VISIBLE);
                rl_black_bg.setAlpha(1);
            }
        });
    }

    @Override
    protected void getIntentData() {
        super.getIntentData();
    }

    private void finishBrowser() {
        tvNumShow.setVisibility(View.GONE);
        rl_black_bg.setAlpha(0);
        finish();
        this.overridePendingTransition(0, R.anim.browser_exit_anim);
    }

    private class MyAdapter extends PagerAdapter {

        private LayoutInflater layoutInflater;

        public MyAdapter() {
            layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return welFareLists.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            View inflate = layoutInflater.inflate(R.layout.mn_image_browser_item_show_image, container, false);
            final PhotoView imageView = (PhotoView) inflate.findViewById(R.id.photoImageView);
            RelativeLayout rl_browser_root = (RelativeLayout) inflate.findViewById(R.id.rl_browser_root);


            final String url = welFareLists.get(position).getUrl();
            Glide.with(context)
                    .load(url)
                    .thumbnail(0.2f)
                    .into(imageView);


            rl_browser_root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finishBrowser();
                }
            });

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finishBrowser();
                }
            });
            imageView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    currentImageView = imageView;
                    return false;
                }
            });
            container.addView(inflate);
            return inflate;
        }
    }

    /**
     * 跳转到本页面
     *
     * @param cActivity
     * @param welFareLists
     */
    public static void jumpHere(Activity cActivity, List<MeiZhi.ResultsBean> welFareLists,int position) {
        Intent intent = new Intent(cActivity, GankPicActivity.class);
        intent.putExtra("resultsBeen", (Serializable) welFareLists);
        intent.putExtra("position",position);
        cActivity.startActivity(intent);
    }
//    private void saveImage() {
//        currentImageView.setDrawingCacheEnabled(true);
//        final Bitmap bitmap = Bitmap.createBitmap(currentImageView.getDrawingCache());
//        currentImageView.setDrawingCacheEnabled(false);
//        if (bitmap == null) {
//            return;
//        }
//        //save Image
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                final boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(bitmap, Constants.BasePath, System.currentTimeMillis() + ".jpg", true);
//                App.getHandler().post(new Runnable() {
//                    @Override
//                    public void run() {
//                        dissmissProgressDialog();
//                        if (saveBitmapToSD) {
//                            showProgressSuccess("保存成功");
//                        } else {
//                            showProgressError("保存失败");
//                        }
//                    }
//                });
//            }
//        }).start();
//    }
}
