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
public class EducationFragment extends Fragment{

    private EditText editText2;

    public EducationFragment(){


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_education, container, false);

        editText2 = (EditText) view.findViewById(R.id.editText2);

        editText2.setText("");
        editText2.setText("Education");

        return view;
    }
}
