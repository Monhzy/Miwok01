package com.example.android.miwok;

/**
 * Created by mycomputer on 2017/8/15.
 */

public class Word{


    private String mEnglish;
    private String mMiwok;
    private int NO_IMAGE_PROVIDED = -1;
    private int mImageResiurceId = NO_IMAGE_PROVIDED;
    private int mMusicResourceId ;


    public Word(String English,String Miwok,int MusicResourceId){
        mEnglish = English;
        mMiwok = Miwok;
        mMusicResourceId = MusicResourceId;

    }
    public Word(String English,String Miwok,int ImageResiurceId,int MusicResourceId){
        mEnglish = English;
        mMiwok = Miwok;
        mImageResiurceId = ImageResiurceId;
        mMusicResourceId = MusicResourceId;

    }

    public String getmEnglish(){
        return mEnglish;
    }
    public String getmMiwok(){return mMiwok;}
    public  int getId(){return mImageResiurceId;}

    public boolean hasImage(){
        return mImageResiurceId!=NO_IMAGE_PROVIDED;
    }
    public int getMusicResourceId(){return mMusicResourceId;}
}
