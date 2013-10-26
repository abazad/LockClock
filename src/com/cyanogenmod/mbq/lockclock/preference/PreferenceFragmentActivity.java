package com.cyanogenmod.mbq.lockclock.preference;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;

import com.cyanogenmod.mbq.lockclock.R;
import com.mbq.SetThemeActivity.Themes;
import com.mbq.utils.Utils;

public class PreferenceFragmentActivity extends PreferenceActivity implements OnPreferenceClickListener {
	private static final String AppTheme = "AppTheme";
	
	Preference pref;

    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Utils.onActivityCreateSetTheme(this);

            addPreferencesFromResource(R.xml.preferencefragmentpreferences);
            
	        pref = findPreference(AppTheme);
	        
            // Prevent it from opening right away
            pref.setOnPreferenceClickListener(this);            

        }

	@Override
	public boolean onPreferenceClick(Preference preference) {
		Intent setThemes = new Intent(this, Themes.class);
        startActivity(setThemes);
		return false;
	}	
}