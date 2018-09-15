package com.example.android.miwok;


/**
 * Created by termi on 3/5/2018.
 */

public class Word {

    private String mMiwokTranslation, mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourceId;




    //Initializing a final variable
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int mSoundResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mSoundResourceId = mSoundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mImageResourceId, int mSoundResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mSoundResourceId = mSoundResourceId;
    }

    public Word() {

    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmSoundResourceId(){
        return mSoundResourceId;
    }

    public int getImageResource(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}