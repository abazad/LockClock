package com.mbq.utils;

import com.cyanogenmod.mbq.lockclock.R;

import android.app.Activity;
import android.content.Intent;

public class Utils {
	private static int mTheme;

	public final static int Holo_Light = 0 ;	
	public final static int Holo = 1;
	public final static int Holo_Light_DAB = 2;
	
	public static void changeToTheme(Activity activity, int theme) {
		
		mTheme = theme;
		
		activity.finish();
		
		activity.startActivity(new Intent(activity, activity.getClass()));
		
	}
	
	public static void onActivityCreateSetTheme(Activity activity) {
		
		switch (mTheme) {
		
		case Holo_Light:
			activity.setTheme(R.style.Holo_Light);
			break;	
			
		case Holo:
			activity.setTheme(R.style.Holo);
			break;			
			
		case Holo_Light_DAB:
			activity.setTheme(R.style.Holo_Light_DAB);
			break;			
		}		
	}
}
