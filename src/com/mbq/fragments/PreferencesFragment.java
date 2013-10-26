package com.mbq.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.Preference.OnPreferenceClickListener;

import com.cyanogenmod.mbq.lockclock.R;
import com.mbq.SetThemeActivity.Themes;

public class PreferencesFragment extends PreferenceFragment implements OnPreferenceClickListener {
	private static final String AppTheme = "AppTheme";
	
	Preference pref;

    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            addPreferencesFromResource(R.xml.preferencefragmentpreferences);
            
	        pref = findPreference(AppTheme);
	        
            // Prevent it from opening right away
            pref.setOnPreferenceClickListener(this);            

        }

	@Override
	public boolean onPreferenceClick(Preference preference) {
		Intent setThemes = new Intent(getActivity(), Themes.class);
        startActivity(setThemes);
		return false;
	}	
}