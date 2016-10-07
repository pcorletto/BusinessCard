package com.example.android.businesscard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by hernandez on 10/4/2016.
 */
public class IntroFragment extends Fragment{

    private EditText editText2;

    public IntroFragment(){


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_intro, container, false);

        editText2 = (EditText) view.findViewById(R.id.editText2);

        editText2.setText("");

        editText2.setText("Mobile Applications Developer\nWeb Applications Developer\nComputational Consultant");

        return view;
    }
}
