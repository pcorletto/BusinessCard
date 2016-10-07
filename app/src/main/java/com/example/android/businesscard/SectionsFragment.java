package com.example.android.businesscard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hernandez on 10/4/2016.
 */
public class SectionsFragment extends Fragment{

    private Button intro_button, contact_button, services_button,
    experience_button, education_button;

    String fragment_name;
    SharedPreferences sharedPreferences;

    Fragment frag;
    FragmentTransaction transaction;

    public SectionsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_sections, container, false);

        intro_button = (Button) view.findViewById(R.id.intro_button);
        contact_button = (Button) view.findViewById(R.id.contact_button);
        services_button = (Button) view.findViewById(R.id.services_button);
        experience_button = (Button) view.findViewById(R.id.experience_button);
        education_button = (Button) view.findViewById(R.id.education_button);

        frag = new IntroFragment();
        transaction = getFragmentManager().beginTransaction().
                add(R.id.containers, frag);
        transaction.commit();

        intro_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                frag = new IntroFragment();

                fragment_name = "com.example.android.businesscard.IntroFragment";

                // Store new fragment_name into SharedPrefs file

                sharedPreferences = getContext().getSharedPreferences
                        (getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.FRAGMENT_NAME), fragment_name);
                editor.commit();

                // Finished with SharedPrefs

                transaction = getFragmentManager().beginTransaction().
                        replace(R.id.containers, frag);

                transaction.commit();

                return true;
            }
        });

        contact_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                frag = new ContactFragment();

                fragment_name = "com.example.android.businesscard.ContactFragment";

                // Store new fragment_name into SharedPrefs file

                sharedPreferences = getContext().getSharedPreferences
                        (getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.FRAGMENT_NAME), fragment_name);
                editor.commit();

                // Finished with SharedPrefs

                transaction = getFragmentManager().beginTransaction().
                        replace(R.id.containers, frag);

                transaction.commit();

                return true;
            }
        });

        services_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                frag = new ServicesFragment();

                fragment_name = "com.example.android.businesscard.ServicesFragment";

                // Store new fragment_name into SharedPrefs file

                sharedPreferences = getContext().getSharedPreferences
                        (getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.FRAGMENT_NAME), fragment_name);
                editor.commit();

                // Finished with SharedPrefs

                transaction = getFragmentManager().beginTransaction().
                        replace(R.id.containers, frag);

                transaction.commit();

                return true;
            }
        });

        experience_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                frag = new ExperienceFragment();

                fragment_name = "com.example.android.businesscard.ExperienceFragment";

                // Store new fragment_name into SharedPrefs file

                sharedPreferences = getContext().getSharedPreferences
                        (getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.FRAGMENT_NAME), fragment_name);
                editor.commit();

                // Finished with SharedPrefs

                transaction = getFragmentManager().beginTransaction().
                        replace(R.id.containers, frag);

                transaction.commit();

                return true;
            }
        });

        education_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                frag = new EducationFragment();

                fragment_name = "com.example.android.businesscard.EducationFragment";

                // Store new fragment_name into SharedPrefs file

                sharedPreferences = getContext().getSharedPreferences
                        (getString(R.string.FRAGMENT_NAME), Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.FRAGMENT_NAME), fragment_name);
                editor.commit();

                // Finished with SharedPrefs

                transaction = getFragmentManager().beginTransaction().
                        replace(R.id.containers, frag);

                transaction.commit();

                return true;
            }
        });


        return view;
    }

}
