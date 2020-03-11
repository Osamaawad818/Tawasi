package com.osamaawad.graduationproject_tawasi.ViewPagerClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.osamaawad.graduationproject_tawasi.R;

public class ViewPagerAdapter extends PagerAdapter {

    private static Context context;
    private static LayoutInflater layoutInflater;
    private static Integer[] Images = {R.drawable.room1 , R.drawable.room2 , R.drawable.room3 , R.drawable.room4};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.cusome_layout , null);

        ImageView imageView = v.findViewById(R.id.imageView);
        imageView.setImageResource(Images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(v , 0);

        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;

        vp.removeView(view);
    }
}
