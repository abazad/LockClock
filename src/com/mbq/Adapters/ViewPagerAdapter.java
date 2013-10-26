package com.mbq.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mbq.fragments.Holo;
import com.mbq.fragments.HoloLight;
import com.mbq.fragments.HoloLightDarkActionBar;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 3;
	// Tab Titles
	private String tabtitles[] = new String[] { "Holo Light", "Holo Light DarkActionBar", "Holo" };
	Context context;

	public ViewPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {

		case 0:
			HoloLight holoLightTheme = new HoloLight();
			return holoLightTheme;		
			
		case 1:
			HoloLightDarkActionBar holoLightDABTheme = new HoloLightDarkActionBar();
			return holoLightDABTheme;	
			
		case 2:
			Holo holoTheme = new Holo();
			return holoTheme;					

		}
		return null;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabtitles[position];
	}
}