package com.example.talksquad;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.talksquad.Fragments.ChatsFragment;
import com.example.talksquad.Fragments.ProfileFragment;
import com.example.talksquad.Fragments.UsersFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm,int behaviour) {
        super(fm, behaviour);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new ChatsFragment();
        }
        else if (position == 1)
        {
            fragment = new UsersFragment();
        }
        else if(position==2){
            fragment=new ProfileFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Chats";
        }
        else if (position == 1)
        {
            title = "Users";
        }
        else if(position==2){
            title="Profile";
        }
        return title;
    }
}
