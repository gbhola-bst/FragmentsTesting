package com.example.bluestack_test;

import java.lang.reflect.Field;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class pagerFragment extends Fragment {
	View view;
	myfragmentAdapter fragadapter;
	ViewPager pager;
	public static final String TAG = "pagerFragment";
	
	public static  pagerFragment NewInstance()
	{
		pagerFragment frag = new pagerFragment();
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		return inflater.inflate(R.layout.pagerfragment_layout, null);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		
		pager = (ViewPager) view.findViewById(R.id.pager);
        fragadapter = new myfragmentAdapter(getChildFragmentManager());
        pager.setAdapter(fragadapter);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		if(savedInstanceState==null)
			Log.d(TAG, "instance state is null");
		else
			Log.d(TAG, "saved instance state is not null");
		
		super.onCreate(savedInstanceState);
		
		Log.d(TAG, "in onCreate()");
	}
	
	
	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "in onPause()");
		
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "in onResume()");
	}
	
	@Override
	public void onDetach() {
	    super.onDetach();

	    try {
	        Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
	        childFragmentManager.setAccessible(true);
	        childFragmentManager.set(this, null);

	    } catch (NoSuchFieldException e) {
	        throw new RuntimeException(e);
	    } catch (IllegalAccessException e) {
	        throw new RuntimeException(e);
	    }
	}
	

}
