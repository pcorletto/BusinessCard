package com.example.android.businesscard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menu_sections, new SectionsFragment()).commit();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menu_colors, new ColorsFragment()).commit();
        }


        }


    }





