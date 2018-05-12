package only.you.ui.contract;

import android.os.Bundle;

import java.util.List;

import only.you.base.BaseView;
import only.you.model.bean.gank.MeiZhi;

/**
 * @name Onlyou
 * @class name：only.you.ui.contract
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/9
 */
public interface AdmireInTheHeartContract extends BaseView {
    /**
     * 吐丝展示内容
     *
     * @param details 内容
     */
    void showToast(String details);

    /**
     * 添加数据
     */
    void addAdapter(List<MeiZhi.ResultsBean> results);

    /**
     * 跳转分类详情
     */
    void jumpThere(Bundle bundle);
}
