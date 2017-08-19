package com.example.android.miwok;

/**
 * Created by mycomputer on 2017/8/15.
 */

public class Word{


    private String mEnglish;
    private String mMiwok;
    private int NO_IMAGE_PROVIDED = -1;
    private int mImageResiurceId = NO_IMAGE_PROVIDED;


    public Word(String English,String Miwok){
        mEnglish = English;
        mMiwok = Miwok;

    }
    public Word(String English,String Miwok,int ImageResiurceId){
        mEnglish = English;
        mMiwok = Miwok;
        mImageResiurceId = ImageResiurceId;
    }

    public String getmEnglish(){
        return mEnglish;
    }
    public String getmMiwok(){return mMiwok;}
    public  int getId(){return mImageResiurceId;}

    public boolean hasImage(){
        return mImageResiurceId!=NO_IMAGE_PROVIDED;
    }

}
