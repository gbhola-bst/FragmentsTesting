package com.example.bluestack_test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class resultFragment extends Fragment {
	View view;
	
	public static resultFragment NewInstance(String data)
	{
		resultFragment frag = new resultFragment();
		Bundle bundle=new Bundle();
		bundle.putString("data", data);
		frag.setArguments(bundle);
		return frag;
		
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.result_activity_layout, null);
		
		((TextView)view.findViewById(R.id.textView1)).setText( getArguments().getString("data")  );
		return view;
	}

}
