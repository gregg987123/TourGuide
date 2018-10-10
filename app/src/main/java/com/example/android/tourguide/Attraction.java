package com.example.android.tourguide;

/* {@link Attraction} represents an attraction a user can visit. It contains the name of the
attraction and the address, and in some instances an image.
. */
public class Attraction {

    // Resource ID for the string of the attraction name
    private int mAttractionNameId;

    // Resource ID for the string of the attraction address
    private int mAttractionAddressId;

    /* Integer image resource ID for the attraction*/
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
     * Returns whether or not there is an image for this attraction
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
