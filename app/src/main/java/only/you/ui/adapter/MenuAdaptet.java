package only.you.ui.adapter;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.xutils.ex.DbException;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import only.you.R;
import only.you.app.App;
import only.you.model.bean.onlyoueyes.Classify;
import only.you.ui.widget.ItemTouchHelperAdapter;
import only.you.utils.DBHelper;

/**
 * @name Onlyou
 * @class name：可拖拽的ime适配器
 * @anthor 家佑
 * @time 2018/4/19
 */
public class MenuAdaptet extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemTouchHelperAdapter {
    private List<Classify> classifies;
    private boolean isdupdata = true;
    private ItmeClick lister2  = null;
    public MenuAdaptet(List<Classify> classifies) {
        this.classifies = classifies;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_itme, parent, false);
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

    @Override
    public void onItemMove(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        int fromPosition = source.getAdapterPosition();
        int toPosition = target.getAdapterPosition();
        if (fromPosition < classifies.size() && toPosition < classifies.size()) {
            //交换数据位置
            Collections.swap(classifies, fromPosition, toPosition);
            Log.w("交换位置", "位置1：" + fromPosition + "    位置2：" + toPosition);
            //刷新位置交换
            notifyItemMoved(fromPosition, toPosition);

        }
        //移动过程中移除view的放大效果
        onItemClear(source);

    }

    @Override
    public void onItemDissmiss(RecyclerView.ViewHolder source) {
        int position = source.getAdapterPosition();
        classifies.remove(position); //移除数据
        notifyItemRemoved(position);//刷新数据移除
    }

    @Override
    public void onItemSelect(RecyclerView.ViewHolder source) {
        //当拖拽选中时放大选中的view
        source.itemView.setScaleX(1.2f);
        source.itemView.setScaleY(1.2f);
    }

    @Override
    public void onItemClear(RecyclerView.ViewHolder source) {
        //拖拽结束后恢复view的状态
        source.itemView.setScaleX(1.0f);
        source.itemView.setScaleY(1.0f);
        isdupdata = false;
    }

    class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.menu_iv)
        ImageView menuIv;
        @BindView(R.id.titlestr)
        TextView titleStr;
        @BindView(R.id.detailsstr)
        TextView detailsStr;
        @BindView(R.id.itmecard)
        CardView itmecard;
        public MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindItem(final Classify item) {
            titleStr.setText("# " + item.getName());
            detailsStr.setText(item.getDescription());
            Glide.with(App.mContext).load(item.getHeaderImage()).centerCrop().skipMemoryCache(true).into(menuIv);
            itmecard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    DetailsListActivity.junmHere(App.mContext);
                    Bundle bundle = new Bundle();
                    bundle.putString("name",item.getName());
                    bundle.putString("image",item.getBgPicture());
                    bundle.putInt("id",item.getId());
                    lister2.onItmeClick(bundle);
                }
            });
        }
    }

    /**
     * 更新本地表
     */
    public void upDataTable() {
        if (isdupdata == false) {
            for (int i = 0; i < classifies.size(); i++) {
                classifies.get(i).setPosition(i);
            }
            Log.e("jihe: ", classifies.toString());
            try {
                DBHelper.db.saveOrUpdate(classifies);
            } catch (DbException e) {
                e.printStackTrace();
            }
            isdupdata = !isdupdata;
        }
    }
    public interface ItmeClick{
      void  onItmeClick(Bundle bundle);
    }
    public void setItmeClick(ItmeClick lister){
        lister2 = lister;
    }
}
