package only.you.app;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.SupportActivity;

import org.xutils.DbManager;
import org.xutils.x;

import java.util.HashSet;
import java.util.Set;

/**
 * @name VideoDome
 * @class name：video.videodome.app
 * @anthor jiayou
 * @time 2018/4/10
 */
public class App extends Application {
    private static App instance;
    private Set<FragmentActivity> allActivities;
    public static Context mContext;

    private static DbManager.DaoConfig daoConfig;

    public DbManager.DaoConfig getDaoConfig() {
        return daoConfig;
    }

    /**
     * 获取自定义Application
     *
     * @return
     */
    public static App getInstance() {
        return instance;
    }

    /**
     * 注册当前Activity到集合
     *
     * @param act 当前的activity
     */
    public void registerActivity(FragmentActivity act) {
        if (allActivities == null) {
            allActivities = new HashSet<FragmentActivity>();
        }
        allActivities.add(act);
    }

    /**
     * 从集合中清除当前 activity
     *
     * @param act
     */
    public void unregisterActivity(SupportActivity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }

    /**
     * 退出程序
     */
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (FragmentActivity act : allActivities) {
                    if (act != null && !act.isFinishing())
                        act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mContext = getApplicationContext();
        initializedDatabase();
    }

    /**
     * 初始化数据库
     */
    private void initializedDatabase() {
        x.Ext.init(this);//Xutils初始化
        daoConfig = new DbManager.DaoConfig()
                .setDbName("onlyou") //数据库名字
                .setDbVersion(1)//数据库版本号
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {

                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

                    }
                });
    }

}
