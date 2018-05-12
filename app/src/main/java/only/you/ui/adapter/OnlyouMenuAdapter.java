package only.you.ui.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.model.bean.onlyoueyes.Classify;

/**
 * @name Onlyou
 * @class name：only.you.ui.adapter
 * @anthor 家佑
 * @time 2018/4/21
 */
public class OnlyouMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Classify> classifies;
    private OnlyouMenuListener listener;

    public OnlyouMenuAdapter(List<Classify> classifies) {
        this.classifies = classifies;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_menu_itme, parent, false);
        return new MenuHolder(rootView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MenuHolder) {
            MenuHolder menuHolder = (MenuHolder) holder;
            menuHolder.bindItem(classifies.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return classifies.size();
    }

    class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.menu_str)
        TextView menuStr;
        @BindView(R.id.menu_line)
        View menuLine;
        @BindView(R.id.menu_lin)
        RelativeLayout menuLin;

        public MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final Classify item) {
            menuStr.setText(item.getName());
            if (item.iselected() == true) {
                menuStr.setTextColor(Color.parseColor("#333333"));
                menuLine.setBackgroundColor(Color.parseColor("#333333"));
            } else {
                menuStr.setTextColor(Color.parseColor("#A7A7A7"));
                menuLine.setBackgroundColor(Color.parseColor("#ffffff"));
            }
            menuLin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (Classify classify : classifies) {
                        if (item.getId() == classify.getId()) {
                            classify.setIselected(true);
                            if (!item.getName().equals("推荐")) {
                                listener.getData(item);
                            } else {
                                listener.getRecommend();
                            }

                        } else {
                            classify.setIselected(false);
                        }
                    }
                    notifyDataSetChanged();
                }
            });
        }
    }

    public void setOnlyouMenuListener(OnlyouMenuListener listener2) {
        listener = listener2;
    }

    public interface OnlyouMenuListener {
        /**
         * 点击的数据
         *
         * @param item
         */
        void getData(Classify item);

        /**
         * 获取推荐
         */
        void getRecommend();
    }
}
