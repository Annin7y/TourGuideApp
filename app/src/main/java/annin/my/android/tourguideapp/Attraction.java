package annin.my.android.tourguideapp;

/**
 * Created by Maino96-10022 on 11/2/2016.
 */

public class Attraction {
    /**
     * Attraction name
     */
    private String mNameId;

    /**
     * Attraction description
     */
    private String mDescriptionId;

    /**
     * Attraction address
     */
    private String mAddressId;

    /**
     * Attraction e-mail
     */
    private String mEmailId;

    /**
     * Attraction image
     */
    private int mImageResourceId;

    /**
     * Constant value that represents no image was provided for this attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String NameId, String DescriptionId, String AddressId, String EmailId, int ImageResourceId) {
        mNameId = NameId;
        mDescriptionId = DescriptionId;
        mAddressId = AddressId;
        mEmailId = EmailId;
        mImageResourceId = ImageResourceId;
    }

    public Attraction(String NameId, String DescriptionId, String AddressId, String EmailId) {
        mNameId = NameId;
        mDescriptionId = DescriptionId;
        mAddressId = AddressId;
        mEmailId = EmailId;

    }

    /**
     * Get the name of the attraction
     */
    public String getNameId() {
        return mNameId;
    }

    /**
     * Get the description of the attraction
     */
    public String getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Get the address of the attraction
     */
    public String getAddressId() {
        return mAddressId;
    }

    /**
     * Get the email of the attraction
     */
    public String getEmailId() {
        return mEmailId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

