package com.seven.bottomwithviewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;

public class Myadapter extends SmartFragmentStatePagerAdapter {
	
	private final List<Fragment> list = new ArrayList<>();
	
	public void addFragment(Fragment fragment) {
		list.add(fragment);
	}
	
	public Myadapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int position) {
		
		return list.get(position);
	}
	
	@Override
	public int getCount() {
		return list.size();
	}
}
