package com.demo.myrecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demo.ui.adapter.HomeAdapter;

import java.util.ArrayList;

/**
 * Created by aifengbin on 2017/1/13.
 */

public class HomeActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<String> mDatas;
    private final String TAG="homeActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_recycleview);
        initData();
        recyclerView= (RecyclerView) findViewById(R.id.id_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));//分隔线
        homeAdapter = new HomeAdapter(mDatas);
        recyclerView.setAdapter(homeAdapter);
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add("" + (char) i);
//            Log.i(TAG,"hello world!!!");

        }

    }


}
