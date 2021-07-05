package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    //FOR CHECKING IMAGE IS VISIBLE OR NOT
    private static final int NO_IMAGE_PROVIDED = -1;

    //FOR DEFAULT TRANSLATION OF THE WORD
    private String mDefaultTranslation;

    //FOR MIWOK TRANSLATION OF THE WORD
    private String mMiwokTranslation;

    //FOR ID OF THE IMAGE
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Audio Resource id for word
    private int mAudioResourceId;


    //Constructor for phrases
    public Word(String defaultTranslation,String miwokTranslation , int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Constructor for colors , numbers and family members
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return  mDefaultTranslation;
    }


    /**
     * Get the miwok translation of the word.
     */
    public  String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Get the imageResourceID of the image.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word
     */
    public  boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the audioResourceID of the words
     */
    public  int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
