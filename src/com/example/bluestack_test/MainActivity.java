package com.example.bluestack_test;

import java.util.Stack;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.os.Build;
import android.provider.ContactsContract.CommonDataKinds.Relation;

public class MainActivity extends FragmentActivity{
	Stack<Fragment> S;
	Fragment crrntfrag;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S = new Stack<Fragment>();
        
    }
    
    
    public void addpagerfragment(View v)
    {
    	pagerFragment frag = pagerFragment.NewInstance();
    	crrntfrag = frag;
    	
    	FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    	ft.replace(R.id.container, frag);
    	ft.commit();
    	
    }
   
    
    public void addNewFragmenttoStackandShow(Fragment frag)
    {
    	S.push(crrntfrag);
    	showFragment(frag);
    	
    }
    
    public void showFragment(Fragment frag)
    {
    	
    	FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    	ft.replace(R.id.container, frag);
    	ft.commit();
    }
    
    
    @Override
    public void onBackPressed() {
    	// TODO Auto-generated method stub
    	if(!S.empty())
    	{
    	Fragment topfrag = S.pop();
    	showFragment(topfrag);	
    	return;
    	}
    		
    		
    	super.onBackPressed();
    	
    	
    	
    	
    	
    }
    
}
