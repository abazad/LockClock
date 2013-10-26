package com.mbq.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.cyanogenmod.mbq.lockclock.R;
import com.mbq.utils.Utils;

public class Holo extends Fragment {

          @Override
          public View onCreateView(LayoutInflater inflater, ViewGroup container,
              Bundle savedInstanceState) {
                  
            final View view = inflater.inflate(R.layout.holo, container, false);           
            
            Button Holo = (Button) view.findViewById(R.id.HoloButton);
            Holo.setOnClickListener(new OnClickListener() {

               public void onClick(View v) {
            	   Utils.changeToTheme(getActivity(), Utils.Holo);

               }
            });            
            
                return view;
          }
}