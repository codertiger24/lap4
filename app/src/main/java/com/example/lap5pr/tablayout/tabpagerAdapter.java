package com.example.lap5pr.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lap5pr.fragment.ContactFragment;
import com.example.lap5pr.fragment.HomeFragment;

public class tabpagerAdapter extends FragmentStateAdapter {
    public static final String[] titles = new String[]{"TABLAYOUT THỨ 1","TABLAYOUT THỨ 2"};
    public tabpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:return new HomeFragment();
            case 1: return new ContactFragment();
        }
        return new HomeFragment() ;
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
