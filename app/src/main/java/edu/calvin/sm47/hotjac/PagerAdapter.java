package edu.calvin.sm47.hotjac;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sm47 on 3/28/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_ITEMS = 3;
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
    switch(position) {
        case 0: return new InstructionFragment();
        case 1: return new StatusFragment();
        case 2: return new BatteryFragment();
        default: return new StatusFragment();
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
