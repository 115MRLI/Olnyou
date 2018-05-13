package only.you.ui.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.app.App;
import only.you.model.bean.gank.MeiZhi;


/**
 * Created by家佑
 */

public class GankListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<MeiZhi.ResultsBean> results;
    public OnLoadListener listener = null;
    private boolean processFlag = true; //默认可以点击
    private int numpages = 0;

    public GankListAdapter(List<MeiZhi.ResultsBean> meiZhis) {
        this.results = meiZhis;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gank_itme_meizhi, parent, false);
        return new GankMeiZhiViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof GankMeiZhiViewHolder) {
            GankMeiZhiViewHolder gankMeiZhiViewHolder = (GankMeiZhiViewHolder) holder;
            gankMeiZhiViewHolder.bindItem(results.get(position));
            gankMeiZhiViewHolder.card_meizhi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (processFlag) {
                        setProcessFlag();//
                        listener.onItmeClick(position);
                        new TimeThread().start();
                    }

                }
            });
            if (position == results.size() - 1) {
                //如果服务器返回数据为0将不再向服务器请求数据
                if (numpages != 0) {
                    listener.onLoadMore();
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    class GankMeiZhiViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.card_meizhi)
        CardView card_meizhi;
        @BindView(R.id.iv_meizhi)
        ImageView iv_meizhi;
        @BindView(R.id.tv_meizhi_title)
        TextView tv_meizhi_title;

        public GankMeiZhiViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final MeiZhi.ResultsBean meizhi) {
            tv_meizhi_title.setText(meizhi.getDesc());
            Glide.with(App.mContext).load(meizhi.getUrl()).centerCrop().skipMemoryCache(true).into(iv_meizhi);
        }
    }

    public void setOnLoadListener(OnLoadListener mlistener) {
        listener = mlistener;
    }


    public interface OnLoadListener {
        void onLoadMore();

        void onItmeClick(int position);
    }

    /**
     * 添加数据
     */
    public void setChangeData(List<MeiZhi.ResultsBean> results2) {
        numpages = results2.size();
        for (MeiZhi.ResultsBean resultsBean : results2) {
            results.add(resultsBean);
        }
        notifyDataSetChanged();
    }

    /**
     * 数据集和
     *
     * @return
     */
    public List<MeiZhi.ResultsBean> getAdapterDate() {
        return results;
    }

    /**
     * 设置按钮在短时间内被重复点击的有效标识（true表示点击有效，false表示点击无效）
     */
    private synchronized void setProcessFlag() {
        processFlag = false;
    }

    /**
     * 计时线程（防止在一定时间段内重复点击按钮）
     */
    private class TimeThread extends Thread {
        public void run() {
            try {
                sleep(1000);
                processFlag = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
