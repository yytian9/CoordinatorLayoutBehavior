package com.sky.coordinatorlayoutbehavior.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @创建者 yytian
 * @创建时间 2016/2/27 15:01
 * @描述
 * @更新人 yytian
 * @更新时间 2016/2/27 15:01
 * @更新描述
 */
public class MyAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private  ArrayList<String> mDatas;

    public MyAdapter(Context context,ArrayList<String> datas) {
        this.mDatas=datas;
        this.mContext=context;
    }

    static class ItemHolader extends RecyclerView.ViewHolder{

        private final TextView tv;

        public ItemHolader(TextView itemView) {
            super(itemView);
            this.tv=itemView;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = new TextView(mContext);
        return new ItemHolader(tv);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ItemHolader)holder).tv.setText(mDatas.get(position)+"");
    }

    @Override
    public int getItemCount() {
        if (mDatas != null) {
            return mDatas.size();
        }
        return 0;
    }
}
