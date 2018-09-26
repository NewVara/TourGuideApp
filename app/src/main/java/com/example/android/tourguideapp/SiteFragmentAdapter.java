package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SiteFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SiteFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new ShopsFragment();
        } else if (position == 2) {
            return new VisitFragment();
        } else {
            return new BreweryFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.site_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.site_shops);
        } else if (position == 2) {
            return mContext.getString(R.string.site_visits);
        } else {
            return mContext.getString(R.string.site_brewery);
        }
    }

    public int getCount() {
        return 4;
    }

}
