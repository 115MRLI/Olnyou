package only.you.ui.activity;


import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import only.you.R;
import only.you.base.BaseActivity;

public class GankWebActivity extends BaseActivity {
    @BindView(R.id.titlestr)
    TextView titlestr;
    @BindView(R.id.webview)
    WebView webview;
    @Override
    protected int getLayout() {
        return R.layout.activity_gank_web;
    }

    @Override
    protected void initView() {
        super.initView();
        String url = getIntent().getStringExtra("url");
        String name = getIntent().getStringExtra("name");
        titlestr.setText(name);
        //得到AssetManager
        AssetManager mgr = getAssets();
        //根据路径得到Typeface
        Typeface tf = Typeface.createFromAsset(mgr, "fonts/woman.ttf");
        //设置字体
        titlestr.setTypeface(tf);

        WebSettings webSettings = webview.getSettings();
        //设置WebView属性，能够执行Javascript脚本
        webSettings.setJavaScriptEnabled(true);
        //设置可以访问文件
        webSettings.setAllowFileAccess(true);
        //设置不支持缩放
        webSettings.setBuiltInZoomControls(false);
        //加载需要显示的网页
        webview.loadUrl(url);
        //设置Web视图
        webview.setWebViewClient(new webViewClient ());
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void getIntentData() {
        super.getIntentData();
    }
    /**
     * 携参跳转到本页面
     *
     * @param activity
     * @param url
     * @param name
     */
    public static void jumpHere(Activity activity, String url, String name) {
        Intent intent = new Intent(activity, GankWebActivity.class);
        intent.putExtra("url", url);
        intent.putExtra("name", name);
        activity.startActivity(intent);
    }
    //Web视图
    private class webViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        finish();//结束退出程序
        return false;
    }
}
