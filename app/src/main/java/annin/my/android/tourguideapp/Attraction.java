/**
 *  Created by Anastasia Annin on 11/2/2016.
 *  A Udacity Basics Nanodegree Project
 *  Copyright 2020 Anastasia Annin
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package annin.my.android.tourguideapp;

public class Attraction
{
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

    public Attraction(String NameId, String DescriptionId, String AddressId, String EmailId, int ImageResourceId)
    {
        mNameId = NameId;
        mDescriptionId = DescriptionId;
        mAddressId = AddressId;
        mEmailId = EmailId;
        mImageResourceId = ImageResourceId;
    }

    public Attraction(String NameId, String DescriptionId, String AddressId, String EmailId)
    {
        mNameId = NameId;
        mDescriptionId = DescriptionId;
        mAddressId = AddressId;
        mEmailId = EmailId;
    }

    /**
     * Get the name of the attraction
     */
    public String getNameId()
    {
        return mNameId;
    }

    /**
     * Get the description of the attraction
     */
    public String getDescriptionId()
    {
        return mDescriptionId;
    }

    /**
     * Get the address of the attraction
     */
    public String getAddressId()
    {
        return mAddressId;
    }

    /**
     * Get the email of the attraction
     */
    public String getEmailId()
    {
        return mEmailId;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

