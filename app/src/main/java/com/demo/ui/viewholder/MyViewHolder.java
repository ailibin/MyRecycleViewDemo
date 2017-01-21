package com.demo.ui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.demo.myrecycleviewdemo.R;

/**
 * Created by aifengbin on 2017/1/13.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView tv;
    public MyViewHolder(View itemView) {
        super(itemView);
        tv= (TextView) itemView.findViewById(R.id.id_num);

    }
}
