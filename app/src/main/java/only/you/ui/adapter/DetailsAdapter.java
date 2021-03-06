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
import only.you.model.bean.onlyoueyes.ClassificationDetails;
import only.you.ui.widget.GlideCircleTransform;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 家佑
 * @time 2018/5/2
 */
public class DetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ClassificationDetails.ItemListBean> itemList;
    private SlideListener listener;
    private int numpages = 0;
    public DetailsAdapter(List<ClassificationDetails.ItemListBean> itemList) {
        this.itemList = itemList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_item, parent, false);
        return new DetailsHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof DetailsHolder) {
            DetailsHolder menuHolder = (DetailsHolder) holder;
            menuHolder.bindItem(itemList.get(position));
            Log.e("监听", "position: " + position + "  itemList.size()  :" + itemList.size());
            if (position == itemList.size() - 1) {
                //如果服务器返回数据为0将不再向服务器请求数据
                if (numpages != 0) {
                    listener.onLoad(itemList.size());
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class DetailsHolder extends RecyclerView.ViewHolder {
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

        public DetailsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final ClassificationDetails.ItemListBean item) {
            Glide.with(App.mContext).load(item.getData().getCover().getDetail()).centerCrop().skipMemoryCache(true).into(detailsIv);
            Glide.with(App.mContext).load(item.getData().getAuthor().getIcon()).transform(new GlideCircleTransform(App.mContext)).skipMemoryCache(true).into(headIv);
            detailstv.setText(item.getData().getTitle());
            titletv.setText("# " + item.getData().getAuthor().getName());
//            Log.e("详情名字",item.getData().getTitle()+"--------"+item.getData().getCover().getDetail());
            itmecard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItmeClick(item);
                }
            });
        }
    }

    public interface SlideListener {
        /**
         * 加载更多
         *
         * @param size
         */
        void onLoad(int size);

        /**
         * itme点击方法
         *
         * @param item
         */
        void onItmeClick(ClassificationDetails.ItemListBean item);
    }

    /**
     * 设置接口监听
     *
     * @param listener2
     */
    public void setSlideListener(SlideListener listener2) {
        listener = listener2;
    }

    /**
     * 改变适配器数据
     *
     * @param listBeanList
     */
    public void changeData(List<ClassificationDetails.ItemListBean> listBeanList) {
        numpages = listBeanList.size();
        for (ClassificationDetails.ItemListBean bean : listBeanList) {
            itemList.add(bean);
        }
        notifyDataSetChanged();
    }
}
