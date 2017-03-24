package com.dev.ipati.viewpagergithub;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.dev.ipati.viewpagergithub.Fragment.FragmentOne;
import com.dev.ipati.viewpagergithub.Fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        AdapterFragment adapterFragment = new AdapterFragment(getSupportFragmentManager());
        mViewPager.setAdapter(adapterFragment);

    }

    class AdapterFragment extends FragmentPagerAdapter {
        public AdapterFragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return FragmentOne.newInstance("FragmentOne");
            } else if (position == 1) {
                return FragmentTwo.newInstance("FragmentTwo");
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
