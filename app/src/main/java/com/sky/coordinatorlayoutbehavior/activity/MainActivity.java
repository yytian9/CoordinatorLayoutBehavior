package com.sky.coordinatorlayoutbehavior.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sky.coordinatorlayoutbehavior.R;
import com.sky.coordinatorlayoutbehavior.adapter.MyAdapter;

import java.util.ArrayList;

/**
 * @创建者 yytian
 * @创建时间 2016/3/8 0:18
 * @描述
 * @更新人 yytian
 * @更新时间 2016/3/8 0:18
 * @更新描述
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        manager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);

        ArrayList<String> datas = new ArrayList<>();

        for(int i=0;i<100;i++){
            datas.add(i + "");
        }
        MyAdapter adapter = new MyAdapter(this, datas);
        mRecyclerView.setAdapter(adapter);
    }
}
