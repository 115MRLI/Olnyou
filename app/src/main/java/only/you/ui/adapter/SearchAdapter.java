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
import only.you.model.bean.onlyoueyes.Search;
import only.you.ui.widget.GlideCircleTransform;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 李永胜 E-mail:liys@wangang.cc
 * @time 2018/5/8
 */
public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Search.ItemListBean> itemList;
    private SearchListener listener;

    public SearchAdapter(List<Search.ItemListBean> itemList) {
        this.itemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_item, parent, false);
        return new SearchHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof SearchHolder) {
            SearchHolder menuHolder = (SearchHolder) holder;
            menuHolder.bindItem(itemList.get(position));
            Log.e("监听", "position: " + position + "  itemList.size()  :" + itemList.size());
            if (position == itemList.size() - 1) {
                listener.onLoad();
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class SearchHolder extends RecyclerView.ViewHolder {
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

        public SearchHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final Search.ItemListBean item) {
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

    public interface SearchListener {
        /**
         * itme点击
         *
         * @param item
         */
        void itmeClick(Search.ItemListBean item);

        /**
         * 加载更多
         */
        void onLoad();
    }

    public void setSearchListener(SearchListener listener2) {
        listener = listener2;
    }

    /**
     * 添加数据
     *
     * @param itemList2
     */
    public void changeData(List<Search.ItemListBean> itemList2) {
        for (Search.ItemListBean itemListBean : itemList2) {
            if (itemListBean.getData().getId() != 0){
                Log.e("详情名字", itemListBean.toString());
                itemList.add(itemListBean);
            }
        }
        notifyDataSetChanged();
    }
}
