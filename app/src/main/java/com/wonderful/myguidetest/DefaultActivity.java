package com.wonderful.myguidetest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.wonderful.myguidetest.circleIndicator.CircleIndicator;

/**
 * Created by KXwon on 2016/7/26.
 */
public class DefaultActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sample_default);

        ViewPager viewpager = (ViewPager)findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        viewpager.setAdapter(new SamplePagerAdapter());
        indicator.setViewPager(viewpager);
        viewpager.setCurrentItem(2);
    }


}
