package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //This was used previously for the Tab Titles, but using a different method now
    //private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ThingsToDoFragment();
        } else if (position == 1){
            return new RestaurantFragment();
        } else if (position == 2) {
            return new BreweriesFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_things);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.category_breweries);
        } else {
            return mContext.getString(R.string.category_bars);
        }
    }

    //This worked for me, but course solution was above
    /*@Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }*/

    @Override
    public int getCount() {
        return 4;
    }
}

