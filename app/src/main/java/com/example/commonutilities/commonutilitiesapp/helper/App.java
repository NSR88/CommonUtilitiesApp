package com.example.commonutilities.commonutilitiesapp.helper;

import android.app.Application;
import android.content.Context;


public class App extends Application {

	// Note: Your consumer key and secret should be obfuscated in your source code before shipping.

	public static final String TAG = App.class
			.getSimpleName();


	private static Context mContext;
	public static App instance;
	private static void checkInstance() {
		if (instance == null)
			throw new IllegalStateException("Application not created yet!");
	}

	public static App getInstance() {
		checkInstance();
		return instance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
//		TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Montserrat-UltraLight.otf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

		mContext = this;
		instance = this;
	}

	public static Context getContext() {
		return mContext;
	}





	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);

	}


}