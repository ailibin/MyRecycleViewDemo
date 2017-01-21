package com.demo.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.demo.myrecycleviewdemo.R;
import com.demo.ui.viewholder.MyViewHolder;

import java.util.ArrayList;

/**
 * Created by aifengbin on 2017/1/13.
 */

public class HomeAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private ArrayList<String> mDatas = new ArrayList<>();
    public HomeAdapter(ArrayList<String> mDatas){
        this.mDatas=mDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder=  new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate((R.layout.item_home),parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.tv.setText(mDatas.get(position));

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
