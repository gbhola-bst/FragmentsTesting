package com.example.bluestack_test;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class myfragmentAdapter extends FragmentPagerAdapter {
	
	List<Fragment> items;

	public myfragmentAdapter(FragmentManager fm) {
		super(fm);
		items = new ArrayList<Fragment>();
		items.add(list_Fragment.NewInstance(1));
		items.add(list_Fragment.NewInstance(2));
		items.add(list_Fragment.NewInstance(3));
		items.add(list_Fragment.NewInstance(4));
		items.add(list_Fragment.NewInstance(5));
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return items.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

}
