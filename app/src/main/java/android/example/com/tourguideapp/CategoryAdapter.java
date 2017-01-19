package android.example.com.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by chad.yeo on 1/19/2017.
 */
public class CategoryAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new MansionsFragment();
        } else {
            return new BeachesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 1) {
            return mContext.getString(R.string.category_park);
        } else if (position == 2) {
            return mContext.getString(R.string.category_mansion);
        } else {
            return mContext.getString(R.string.category_beach);
        }
    }
}
