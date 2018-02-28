package com.example.android.german.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.german.Fragments.ColorsFragment;
import com.example.android.german.Fragments.NounsFragment;
import com.example.android.german.Fragments.NumberFragment;
import com.example.android.german.Fragments.AllWordsFragment;
import com.example.android.german.R;

/**
 * Created by Abhishek Saxena on 12/10/2017.
 */

public class CategoryPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;


    public CategoryPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // private String tabTitles[] = new String[] {"Numbers","Family", "Colors","Phrases"};
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new AllWordsFragment();
        else if (position == 1)
            return new NounsFragment();
        if (position == 2)
            return new NumberFragment();
        else
            return new ColorsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0)
            return mContext.getString(R.string.category_all_words);
        else if (position == 1)
            return mContext.getString(R.string.category_nouns);
         else if (position == 2)
            return mContext.getString(R.string.category_numbers);
         else
             return mContext.getString(R.string.category_colors);

    }
}
