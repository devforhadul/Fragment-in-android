package com.bongotech.fragment;

import static android.view.WindowManager.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    Button frag1, frag2, frag3;
    BottomNavigationView bNavigate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bNavigate = findViewById(R.id.bNavigate);

        //==============================================

        bottomNavi(); //Bottom Navigation Menu
        ssDisable(); //Disable ss and record


/*        //for not allow ss
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager, WindowManager.LayoutParams.FLAG_SECURE);*/








    }


    private void bottomNavi(){

        bNavigate.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if ( item.getItemId() == R.id.home){

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay, new Fragment_1());
                    fragmentTransaction.commit();




                } else if ( item.getItemId() == R.id.notify) {

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay, new Fragment_2());
                    fragmentTransaction.commit();



                } else if ( item.getItemId() == R.id.video) {

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLay, new Fragment_3());
                    fragmentTransaction.commit();


                }


                return true;
            }
        });

    }//finish menu bar

    //disable ss
    private  void ssDisable(){

        // Disable ss
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

    }



}