package com.innovail.trouble.android.core;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import com.innovail.trouble.core.JavaTroubleApplication;

import android.os.Bundle;

public class JavaTroubleAndroidActivity extends AndroidApplication {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;

        initialize (new JavaTroubleApplication (), cfg);
    }
}