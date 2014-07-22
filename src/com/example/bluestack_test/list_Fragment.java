package com.example.bluestack_test;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_Fragment extends Fragment implements OnItemClickListener{
	
	List<String> contents;
	private View view;
	ListView listview;
	ArrayAdapter<String> adapter;
	
	static Fragment NewInstance(int fragno)
	{
		list_Fragment frag = new list_Fragment();
		Bundle bundle = new Bundle();
		bundle.putInt("fragno", fragno);
		frag.setArguments(bundle);
		return frag;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		contents = new ArrayList<String>();

		int fragno = getArguments().getInt("fragno");
		for(int i=0; i<20;i++)
			contents.add("Item no "+i+" of fragment: "+fragno);
		
		adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, contents);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_main, null);
		listview = (ListView)view.findViewById(R.id.listView1);
		listview.setOnItemClickListener(this);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		listview.setAdapter(adapter);
		adapter.notifyDataSetChanged();
		
		
		
		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		resultFragment frag = resultFragment.NewInstance("clicked on item"+position);
		((MainActivity)getActivity()).addNewFragmenttoStackandShow(frag);
		
		
	}
	
	

}
