package only.you.ui.fragment;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseFragment;
import rx.Observer;

/**
 * @name Onlyou
 * @class name：only.you.ui.fragment
 * @anthor 家佑
 * @time 2018/4/24
 */
public class DayByDayFragment extends BaseFragment {
    @BindView(R.id.android_lin)
    RelativeLayout androidLin;
    @BindView(R.id.ios_lin)
    RelativeLayout iosLin;
    @BindView(R.id.front_lin)
    RelativeLayout frontLin;
    @BindView(R.id.android_str)
    TextView androidStr;
    @BindView(R.id.ios_str)
    TextView iosStr;
    @BindView(R.id.front_str)
    TextView frontStr;
    private List<TextView> textViews = new ArrayList<>();
    private List<RelativeLayout> linearLayouts = new ArrayList<>();

    @Override
    protected int getLayout() {
        return R.layout.daybyday_fragment;
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
        getLIines();
        getTexts();
        for (RelativeLayout linearLayout : linearLayouts) {
            onClick(linearLayout);
        }
        for (TextView textView:textViews) {
            setTextViewsStyle(textView);
        }
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        showFragment(new AndroidFragment());
    }

    /**
     * 获取菜单文字
     */
    private void getTexts() {
        textViews.add(androidStr);
        textViews.add(iosStr);
        textViews.add(frontStr);
    }

    /**
     * 获取菜单
     */
    private void getLIines() {
        linearLayouts.add(androidLin);
        linearLayouts.add(iosLin);
        linearLayouts.add(frontLin);
    }

    /**
     * 跳转fragment
     */
    private void showFragment(Fragment fragment) {
        // 获取 FragmentTransaction  对象
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        //如果fragment2没有被添加过，就添加它替换当前的fragment1
        transaction.replace(R.id.frame_skill, fragment).commit();
    }

    private void changeTextView(int position) {
        for (int i = 0; i < textViews.size(); i++) {
            if (i == position) {
                textViews.get(i).setTextColor(Color.parseColor("#333333"));
            } else {
                textViews.get(i).setTextColor(Color.parseColor("#A7A7A7"));
            }
        }
    }

    /**
     * 设置字体样式
     *
     * @param frontStr
     */
    private void setTextViewsStyle(TextView frontStr) {
        //得到AssetManager
        AssetManager mgr = getActivity().getAssets();
        //根据路径得到Typeface
        Typeface tf = Typeface.createFromAsset(mgr, "fonts/woman.ttf");
        //设置字体
        frontStr.setTypeface(tf);
    }

    /**
     * 防抖
     *
     * @param view
     */
    private void onClick(final View view) {
        RxView.clicks(view)
                .throttleFirst(2, TimeUnit.SECONDS)
                .subscribe(new Observer<Object>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Object o) {
                        switch (view.getId()) {
                            case R.id.android_lin:
                                changeTextView(0);
                                showFragment(new AndroidFragment());
                                break;
                            case R.id.ios_lin:
                                changeTextView(1);
                                showFragment(new IosFragment());
                                break;
                            case R.id.front_lin:
                                changeTextView(2);
                                showFragment(new FrontFragment());
                                break;
                            default:

                                break;
                        }
                    }
                });
    }
}
