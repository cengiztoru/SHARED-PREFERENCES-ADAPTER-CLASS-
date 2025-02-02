package com.cengiztoru.sendingdatatoserver;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceAdapter {

    static final String FILE_NAME = "SharedPrefData";

    public void putString(Context context, String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        //MODE_PRIVATE is block accesing to file from another action. We can use getPreferences in here but getPreferences
        //can using only where to calling. However getShared Class is can use all activities.
     
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit(); //editör is closed

    }

    public String getString (Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,"").toString().trim();
    }

    public void putInteger(Context context, String key, int value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit(); //editör is closed.

    }

    public int getInteger (Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key,0);
    }

    public void putBoolean(Context context, String key, Boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit(); 

    }

    public int getBoolean (Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key,0);
    }

    public void removeKeyWithValue(Context context,String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(key);
        editor.commit();
    }

    public void clearAllData(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }





}
