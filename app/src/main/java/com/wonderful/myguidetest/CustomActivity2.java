package com.wonderful.myguidetest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wonderful.myguidetest.circleIndicator.CircleIndicator;

/**
 * Created by KXwon on 2016/7/26.
 */
public class CustomActivity2 extends Activity{

    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sample_custom_animation);

        btn_start = (Button) findViewById(R.id.btn_start);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        viewpager.setAdapter(new SamplePagerAdapter());
       // viewpager.setPageTransformer(true, new PagerTransformer());
        viewpager.setPageTransformer(true, new PagerTransformer2());
        indicator.setViewPager(viewpager);

        //设置监听
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //显示按钮
                if (position == 4) {
                    btn_start.setVisibility(View.VISIBLE);
                } else {
                    btn_start.setVisibility(View.GONE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomActivity2.this,"测试",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
