package com.dev.ipati.viewpagergithub.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.ipati.viewpagergithub.R;

public class FragmentOne extends Fragment {
    private final static String KEY = "FragmentOne";

    public static FragmentOne newInstance(String nameFragment) {
        FragmentOne fragmentOne = new FragmentOne();
        Bundle bundle = new Bundle();
        bundle.putString(KEY, nameFragment);
        fragmentOne.setArguments(bundle);
        return fragmentOne;
    }

    @Override
    public View onCreateView(LayoutInflater mInflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = mInflater.inflate(R.layout.activity_fragment_one, container, false);
        iniInstance(view);
        return view;
    }

    private void iniInstance(View view) {

    }
}
