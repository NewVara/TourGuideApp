package com.example.android.tourguideapp;

public class Site {

    /** Default translation for the word */
    private String mDescription;

    /** Miwok translation for the word */
    private String mContact;

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**

    /**
     * Create a new Word object.
     *
     * @param  description the word in a language that the user is already familiar with
     *                           (such as English)
     * @param contact is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Site(String description, String contact, int imageResourceId) {
        mDescription = description;
        mContact = contact;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getContact() {
        return mContact;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
