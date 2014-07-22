package com.example.bluestack_test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class pagerFragment extends Fragment {
	View view;
	myfragmentAdapter fragadapter;
	ViewPager pager;
	
	public static  pagerFragment NewInstance()
	{
		pagerFragment frag = new pagerFragment();
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.pagerfragment_layout, null);
		pager = (ViewPager) view.findViewById(R.id.pager);
		
        fragadapter = new myfragmentAdapter(getActivity().getSupportFragmentManager());
        
        pager.setAdapter(fragadapter);
		
		return view;
	}
	

}
