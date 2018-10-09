package com.example.android.tourguide;

/* {@link Attraction} represents a vocab word that the use wants to learn. It contains the default
translation (such as English) and a Miwok translation for that word. */
public class Attraction {

    /* Default translation for the word - m-variables are private */
    private String mAttractionName;

    /* Miwok translation for the word */
    private String mAttractionAddress;

    private int mAttractionNameId;

    private int mAttractionAddressId;

    /* Integer image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /* Indicates whether the Attraction has an associated image to display*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Attraction object - this is a Constructor - should be the same name as the class.
     * @param attractionNameId is the name of the attraction
     * @param attractionAddressId is the physical address of the attraction
     */
    public Attraction(int attractionNameId, int attractionAddressId) {
        mAttractionNameId = attractionNameId;
        mAttractionAddressId = attractionAddressId;
    }

    /**
     * Create a new Attraction object - this is a Constructor - should be the same name as the class.
     * @param attractionNameId is the name of the attraction
     * @param attractionAddressId is the physical address of the attraction
     * @param imageResourceId is the drawable resource ID is the image associated with the word
     */
    public Attraction(int attractionNameId, int attractionAddressId, int
            imageResourceId) {
        mAttractionNameId = attractionNameId;
        mAttractionAddressId = attractionAddressId;
        mImageResourceId = imageResourceId;
    }

    /* Get the integer image resource ID of the attraction */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /* Get the integer string resource ID of the attraction name*/
    public int getAttractionNameId() {
        return mAttractionNameId;
    }

    /* Get the integer string resource ID of the attraction address*/
    public int getAttractionAddressId() {
        return mAttractionAddressId;
    }
}
