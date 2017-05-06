package com.harik.lenovo.tabbed;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentWeb extends WebViewFragment {

    @Override
    public void onResume() {
        super.onResume();
    }

    public fragmentWeb() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_web, container, false);
    }

}
