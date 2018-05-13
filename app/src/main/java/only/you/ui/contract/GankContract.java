package only.you.ui.contract;


import java.util.List;

import only.you.base.BaseView;
import only.you.model.bean.gank.ResultsBean;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 家佑
 * @time 2018/5/12
 */
public interface GankContract extends BaseView {
    /**
     * 吐丝展示内容
     *
     * @param details 内容
     */
    void showToast(String details);

    /**
     * 加入适配器数据
     */
    void addAdapter(List<ResultsBean> resultsBeen);
}
