package com.example.qamberhaider.sales.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qamberhaider.sales.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Noteboard extends Fragment {


    public Noteboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_noteboard, container, false);


    }

}
