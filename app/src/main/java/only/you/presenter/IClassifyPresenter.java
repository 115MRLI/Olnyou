package only.you.presenter;

import only.you.base.BasePresenter;
import only.you.base.BaseView;

/**
 * @name Onlyou
 * @class name：only.you.presenter
 * @anthor 家佑
 * @time 2018/4/19
 */
public interface IClassifyPresenter<T extends BaseView> extends BasePresenter<T> {
    /**
     * 加载分类数据
     */
    void loadMenuData();

    /**
     * 更新表
     */
    void upDataTable();
}
