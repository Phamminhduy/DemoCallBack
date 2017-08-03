package com.example.phamm.demobottomtabhost;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by phamm on 7/30/2017.
 */

public class TabFactory implements TabHost.TabContentFactory{
    final Context context;

    public TabFactory(Context context) {
        this.context = context;
    }

    @Override
    public View createTabContent(String s) {
        View view = new View(context);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
