package only.you.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.app.App;
import only.you.model.bean.onlyoueyes.Correlation;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 家佑
 * @time 2018/5/7
 */
public class VideoDetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Correlation.VideoListBean> videoList;
    private ClickListener listener;

    public VideoDetailsAdapter(List<Correlation.VideoListBean> videoList) {
        this.videoList = videoList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.correlation_itme, parent, false);
        return new VideoDetailsHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VideoDetailsHolder) {
            VideoDetailsHolder menuHolder = (VideoDetailsHolder) holder;
            menuHolder.bindItem(videoList.get(position));
            Log.e("监听", "position: " + position + "  itemList.size()  :" + videoList.size());
        }
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    class VideoDetailsHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.correlatin_iv)
        ImageView correlatinIv;
        @BindView(R.id.correlatin_title)
        TextView correlatinTitle;
        @BindView(R.id.videotype)
        TextView videotype;
        @BindView(R.id.itme)
        RelativeLayout itme;

        public VideoDetailsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final Correlation.VideoListBean bean) {
            Glide.with(App.mContext).load(bean.getCoverForDetail()).centerCrop().skipMemoryCache(true).into(correlatinIv);
            correlatinTitle.setText(bean.getTitle());
            videotype.setText("# " + bean.getCategory());
            itme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItmeClick(bean);
                }
            });
        }
    }

    public interface ClickListener {
        /**
         * Itme点击方法
         *
         * @param bean
         */
        void onItmeClick(Correlation.VideoListBean bean);
    }

    public void setClickListener(ClickListener listener2) {
        listener = listener2;
    }
}
