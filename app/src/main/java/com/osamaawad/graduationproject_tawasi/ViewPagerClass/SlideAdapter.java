package com.osamaawad.graduationproject_tawasi.ViewPagerClass;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SlideAdapter extends FragmentStatePagerAdapter {

    public SlideAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public SlideAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //Add Fragments
        switch (position){
            case 0:
                return new Offers1();

            case 1:
                return new Offer2();

            case 2:
                return new Offers3();

                default:
                    return new Offers1();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
