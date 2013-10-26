package com.mbq.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cyanogenmod.mbq.lockclock.R;
import com.mbq.utils.Utils;

public class HoloLight extends Fragment {
        
          @Override
          public View onCreateView(LayoutInflater inflater, ViewGroup container,
              Bundle savedInstanceState) {
                  
            final View view = inflater.inflate(R.layout.holo_light, container, false);
            
            Button HoloLight = (Button) view.findViewById(R.id.HoloLightButton);
            HoloLight.setOnClickListener(new OnClickListener() {

               public void onClick(View v) {
            	   Utils.changeToTheme(getActivity(), Utils.Holo_Light);

               }
            });            
            
                return view;
          }
}
