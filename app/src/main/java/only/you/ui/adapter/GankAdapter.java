package only.you.ui.adapter;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.model.bean.gank.ResultsBean;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 家佑
 * @time 2018/5/13
 */
public class GankAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ResultsBean> list;
    private boolean processFlag = true; //默认可以点击
    private int numpages = 0;
    public OnLoadListener listener = null;

    public GankAdapter(List<ResultsBean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gank_itme, parent, false);
        return new GankViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof GankViewHolder) {
            GankViewHolder gankViewHolder = (GankViewHolder) holder;
            Log.e("android*********","方法没有走呀");
            gankViewHolder.bindItem(list.get(position));
            gankViewHolder.card_gank.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (processFlag) {
                        setProcessFlag();//
                        listener.onItmeClick(list.get(position));
                        new TimeThread().start();
                    }

                }
            });
            if (position == list.size() - 1) {
                //如果服务器返回数据为0将不再向服务器请求数据
                if (numpages != 0) {
                    listener.onLoadMore();
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class GankViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_gank)
        CardView card_gank;
        @BindView(R.id.titlestr)
        TextView titlestr;
        @BindView(R.id.typestr)
        TextView typestr;
        @BindView(R.id.whostr)
        TextView whostr;
        @BindView(R.id.timestr)
        TextView timestr;

        public GankViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final ResultsBean gank) {
            String time = gank.getPublishedAt().substring(0,10);
            timestr.setText(time);
            titlestr.setText(gank.getDesc());
            typestr.setText(gank.getType());
            whostr.setText("author : "+gank.getWho());
            Log.e("网址",gank.getUrl());
            if (gank.getType().equals("iOS")){
                typestr.setBackgroundResource(R.drawable.type_ios_bc);
            }else if (gank.getType().equals("前端")){
                typestr.setBackgroundResource(R.drawable.type_xia_bc);
            }else if (gank.getType().equals("拓展资源")){
                typestr.setBackgroundResource(R.drawable.type_q_bc);
            }
        }
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

    public interface OnLoadListener {
        void onLoadMore();

        void onItmeClick(ResultsBean gank);
    }
    public void setOnLoadListener(OnLoadListener mlistener) {
        listener = mlistener;
    }
    /**
     * 添加数据
     */
    public void setChangeData(List<ResultsBean> results2) {
        numpages = results2.size();
        Log.e("android",results2.toString());
        for (ResultsBean resultsBean : results2) {
            list.add(resultsBean);
        }
        notifyDataSetChanged();
    }
}
