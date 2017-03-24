package com.dev.ipati.viewpagergithub.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.ipati.viewpagergithub.R;

public class FragmentTwo extends Fragment {
    private final static String KEY = "FragmentTwo";

    public static FragmentTwo newInstance(String nameFragment) {
        FragmentTwo fragmentTwo = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putString(KEY, nameFragment);
        fragmentTwo.setArguments(bundle);
        return fragmentTwo;
    }

    @Override
    public View onCreateView(LayoutInflater mInflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = mInflater.inflate(R.layout.activity_fragment_two, container, false);
        initInstance(view);
        return view;

    }

    private void initInstance(View view) {

    }
}
