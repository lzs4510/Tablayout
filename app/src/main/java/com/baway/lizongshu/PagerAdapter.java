package com.baway.lizongshu;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by 李宗书 on 2017/6/22.
 */

public class PagerAdapter extends android.support.v4.view.PagerAdapter {
    private ArrayList<View> mlist;

    public PagerAdapter(ArrayList<View> mlist) {
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist==null?0:mlist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = mlist.get(position);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mlist.get(position));
    }


}
