package com.example.commonutilities.commonutilitiesapp.helper;

import android.content.Context;
import android.content.SharedPreferences;


public class AppSharedPreferences {

    public static boolean loadIsSuccessfullyRegistered(Context ctx) {
        boolean isSuccessfullyRegistered = false;
        try {
            SharedPreferences prefs = ctx.getSharedPreferences("AppPref", Context.MODE_PRIVATE);
            isSuccessfullyRegistered = prefs.getBoolean("successfullyRegistered", false);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return isSuccessfullyRegistered;
    }

    public static void saveIsSuccessfullyRegisteredPreference(Context ctx, boolean isSuccessfullyRegistered) {
        try {
			// MY_PREFS_NAME - a static String variable like:
			//public static final String MY_PREFS_NAME = "MyPrefsFile";
			SharedPreferences.Editor editor = ctx.getSharedPreferences("AppPref", Context.MODE_PRIVATE).edit();
			editor.putBoolean("successfullyRegistered", isSuccessfullyRegistered);

			editor.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



    public static void saveUserIDPreference(Context ctx, String userID) {

        try {

            SharedPreferences.Editor editor = ctx.getSharedPreferences("AppPref", Context.MODE_PRIVATE).edit();
            editor.putString("UserID", userID);
            editor.commit();
//			SharedPreferences prefs = ctx.getSharedPreferences("AppPref", Context.MODE_PRIVATE);
//			UserIDStr = prefs.getString("UserID", "");



        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static String loadUserIDPreference(Context ctx) {
        String UserIDStr = "";
        try {
            SharedPreferences prefs = ctx.getSharedPreferences("AppPref", Context.MODE_PRIVATE);
            UserIDStr = prefs.getString("UserID", "123");



        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return UserIDStr;
    }


}
