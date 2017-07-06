package com.baway.lizongshu;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TabLayout tb;
    private ViewPager mvp;
    private PagerAdapter pd;
    private ArrayList<View> mlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (TabLayout) findViewById(R.id.tab);
        mvp = (ViewPager) findViewById(R.id.vp);
        ///修改222

        tb.addTab(tb.newTab().setText("周一"));
        tb.addTab(tb.newTab().setText("周二"));
        tb.addTab(tb.newTab().setText("周三"));
        tb.addTab(tb.newTab().setText("周四"));
        tb.addTab(tb.newTab().setText("周五"));
        tb.addTab(tb.newTab().setText("周六"));
        tb.addTab(tb.newTab().setText("周日"));
//分支1
        LayoutInflater lf = LayoutInflater.from(this);
        View v1 = lf.inflate(R.layout.item1, null);
        View v2 = lf.inflate(R.layout.item2, null);
        View v3 = lf.inflate(R.layout.item3, null);
        View v4 = lf.inflate(R.layout.item4, null);
        View v5 = lf.inflate(R.layout.item5, null);
        View v6 = lf.inflate(R.layout.item6, null);
        View v7 = lf.inflate(R.layout.item7, null);
        mlist.add(v1);
        mlist.add(v2);
        mlist.add(v3);mlist.add(v4);mlist.add(v5);
        mlist.add(v6);mlist.add(v7);
        pd = new PagerAdapter(mlist);
        mvp.setAdapter(pd);
        //tb.setupWithViewPager(mlist.get(po));
        //Viewpager的接听事件：
        mvp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb));
        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();
                mvp.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    }