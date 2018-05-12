package only.you.utils;


import org.xutils.DbManager;
import org.xutils.x;

import only.you.app.App;

/**
 * @name Onlyou
 * @class name：数据库工具类
 * @anthor 家佑
 * @time 2018/4/19
 */
public class DBHelper {
    public static DbManager db = x.getDb(App.getInstance().getDaoConfig());
}
