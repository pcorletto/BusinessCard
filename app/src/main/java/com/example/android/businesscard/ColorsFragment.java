package com.example.android.businesscard;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * Created by hernandez on 10/4/2016.
 */
public class ColorsFragment extends Fragment{

    private Button red_button, blue_button;

    Fragment frag;
    FragmentTransaction transaction;

    String fragment_name;
    SharedPreferences sharedPreferences;

    FrameLayout containers;

    public ColorsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.menu_colors, container, false);

        red_button = (Button) view.findViewById(R.id.red_button);
        blue_button = (Button) view.findViewById(R.id.blue_button);
        containers = (FrameLayout) view.findViewById(R.id.containers);

        red_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(frag == null) {

                    frag = new RedFragment();

                    transaction = getFragmentManager().beginTransaction().
                            add(R.id.containers, frag);

                    transaction.commit();

                }

                else{


                    sharedPreferences = getContext().getSharedPreferences(
                            getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);
                    fragment_name = sharedPreferences.getString(getString(R.string.FRAGMENT_NAME), "");


                    try {
                        frag = (Fragment) (Class.forName(fragment_name).newInstance());

                        transaction = getFragmentManager().beginTransaction().
                                add(R.id.containers, frag);

                        transaction.commit();

                        frag.getFragmentManager().popBackStackImmediate();

                        frag.getView().setBackgroundColor(Color.parseColor("#D53448"));

                    } catch (java.lang.InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                }

                return true;
            }
        });

        blue_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(frag == null) {

                    frag = new BlueFragment();

                    transaction = getFragmentManager().beginTransaction().
                            add(R.id.containers, frag);

                    transaction.commit();

                }

                else{


                    sharedPreferences = getContext().getSharedPreferences(
                            getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);
                    fragment_name = sharedPreferences.getString(getString(R.string.FRAGMENT_NAME), "");


                    try {
                        frag = (Fragment) (Class.forName(fragment_name).newInstance());

                        transaction = getFragmentManager().beginTransaction().
                                add(R.id.containers, frag);

                        transaction.commit();

                        frag.getFragmentManager().popBackStackImmediate();

                        frag.getView().setBackgroundColor(Color.parseColor("#34D5C4"));

                    } catch (java.lang.InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                }

                return true;
            }
        });

        return view;

    }
}
