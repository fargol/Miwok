package com.example.android.miwok;

/**
 * Created by farno on 11/16/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
