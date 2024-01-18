package com.bongotech.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class Fragment_2 extends Fragment {

    ArrayList< HashMap<String, String> > arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    TextView showBtn, resultTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_2, container, false);

        showBtn = fragmentView.findViewById(R.id.showBtn);
        resultTv = fragmentView.findViewById(R.id.resultTv);




        hashMap = new HashMap<>();
        hashMap.put("kr", "사랑");
        hashMap.put("bn", "Valobasa");
        arrayList.add(hashMap);





        HashMap<String, String> hmap = arrayList.get(0);

        resultTv.setText(hashMap.get("kr"));


        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultTv.setText(hashMap.get("bn"));


            }
        });









        return fragmentView;
    }
}