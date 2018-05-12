package only.you.ui.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
import only.you.model.bean.onlyoueyes.Homepage;
import only.you.ui.widget.GlideCircleTransform;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 家佑
 * @time 2018/5/4
 */
public class RecommendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Homepage.ItemListBean> itemList;
    private RecommendListener listener;
    private long data;

    public RecommendAdapter(List<Homepage.ItemListBean> itemList, long data) {
        this.itemList = itemList;
        this.data = data;
        for (int i = 0; i < itemList.size(); i++) {
            if (!itemList.get(i).getData().getDataType().equals("VideoBeanForClient")) {
                itemList.remove(i);
            }
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_item, parent, false);
        return new RecommendHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RecommendHolder) {
            RecommendHolder menuHolder = (RecommendHolder) holder;
            menuHolder.bindItem(itemList.get(position));
            Log.e("监听", "position: " + position + "  itemList.size()  :" + itemList.size());
            if (position == itemList.size() - 1) {
                listener.onLoad(data);
            }
        }
    }

    @Override
    public int getItemCount() {
        Log.e("详情名字", itemList.size() + " **************");
        return itemList.size();
    }

    class RecommendHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.details_iv)
        ImageView detailsIv;
        @BindView(R.id.head_iv)
        ImageView headIv;
        @BindView(R.id.detailstv)
        TextView detailstv;
        @BindView(R.id.titletv)
        TextView titletv;
        @BindView(R.id.itmecard)
        CardView itmecard;

        public RecommendHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final Homepage.ItemListBean item) {
            if (item.getType().equals("video")) {
                Log.e("详情名字", item.getType());
                Glide.with(App.mContext).load(item.getData().getCover().getDetail()).centerCrop().skipMemoryCache(true).into(detailsIv);
                Glide.with(App.mContext).load(item.getData().getAuthor().getIcon()).transform(new GlideCircleTransform(App.mContext)).skipMemoryCache(true).into(headIv);
                detailstv.setText(item.getData().getTitle());
                titletv.setText("# " + item.getData().getAuthor().getName());
                itmecard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        listener.itmeClick(item);
                    }
                });
            }

        }
    }

    public interface RecommendListener {
        /**
         * itme点击
         *
         * @param item
         */
        void itmeClick(Homepage.ItemListBean item);

        /**
         * 加载更多
         *
         * @param data
         */
        void onLoad(long data);
    }

    public void setRecommendListener(RecommendListener listener2) {
        listener = listener2;
    }

    public void changeData(List<Homepage.ItemListBean> itemList2, long data) {
        this.data = data;
        for (int i = 0; i < itemList2.size(); i++) {
            if (!itemList2.get(i).getData().getDataType().equals("VideoBeanForClient")) {
                itemList2.remove(i);
            }
        }
        for (Homepage.ItemListBean itemListBean : itemList2) {
            itemList.add(itemListBean);
        }
        notifyDataSetChanged();
    }
}
