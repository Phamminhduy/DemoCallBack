package com.example.phamm.demobottomtabhost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by phamm on 8/1/2017.
 */

public class Tab1_b extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_b,container,false);
        TextView txt = view.findViewById(R.id.textView);
        Bundle bundle = getArguments();
        txt.setText(bundle.getString("Data"));
        return view;
    }
}
