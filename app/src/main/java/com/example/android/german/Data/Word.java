package com.example.android.german.Data;

import java.io.Serializable;

/**
 * Created by Abhishek Saxena on 12/15/2017.
 */

public class Word implements Serializable {

    private String mGermanTranslation;
    private String mEnglishTranslation;
    private int mGender;
    private String mGermanPlural;
    private String mCategory;
    private int mNumber;


    final private int GENDER_NULL = 0;
    final private int GENDER_MALE = 1;
    final private int GENDER_FEMALE = 2;
    final private int GENDER_NEUTRAL = 3;


    public Word(String germanTranslation, String englishTranslation, String germanPlural, String category, String number) {
        mGermanTranslation = germanTranslation;
        mEnglishTranslation = englishTranslation;
        mGermanPlural = germanPlural;
        mCategory = category;
        mNumber = Integer.valueOf(number);
        for (int i = 0; i < category.length(); i++) {
            if (mCategory.contains("1a"))
                mGender = GENDER_MALE;
            else if (mCategory.contains("1b"))
                mGender = GENDER_FEMALE;
            else if (mCategory.contains("1c"))
                mGender = GENDER_NEUTRAL;
            else
                mGender = GENDER_NULL;
        }
    }

    public String getmGermanTranslation() {
        return updateGender(mGender) + mGermanTranslation;
    }

    public String getmGermanTranslationWithoutArticle(){
        return mGermanTranslation.toLowerCase();
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getmGermanPlural() {
        return mGermanPlural;
    }

    private String updateGender(int gender) {
        switch (gender) {
            case GENDER_NEUTRAL:
                return "das ";
            case GENDER_MALE:
                return "der ";
            case GENDER_FEMALE:
                return "die ";
            default:
                return "";
        }
    }

    public String getmCategory() {
        return mCategory;
    }

    @Override
    public String toString() {
        return "Word(" +
                "mEnglishTranslation: " + mEnglishTranslation + '\'' +
                "mGermanTranslation: " + mGermanTranslation + '\'' +
                "mGermanPlural: " + mGermanPlural +
                "}";
    }
    public int getmNumber(){
        return mNumber;
    }
}