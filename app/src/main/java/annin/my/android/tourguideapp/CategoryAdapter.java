package annin.my.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Maino96-10022 on 11/5/2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter
{
    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new HotelsFragment();
        } else if (position == 1)
        {
            return new MuseumsFragment();
        } else if (position == 2)
        {
            return new RestaurantsFragment();
        } else
            {
            return new TechFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount()
    {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 1)
        {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2)
        {
            return mContext.getString(R.string.category_restaurants);
        } else
            {
            return mContext.getString(R.string.category_tech);
        }
} }

