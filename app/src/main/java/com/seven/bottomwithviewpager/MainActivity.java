package com.seven.bottomwithviewpager;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    private NoSwipeViewPager viewPager;
    private AHBottomNavigation bottomNavigationView;
    private Myadapter myadapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
        bottomNavigationView=   findViewById(R.id.bottom_navigation);
        viewPager=   findViewById(R.id.viewpager);
        viewPager.setPagingEnabled(false);
        myadapter=new Myadapter(getSupportFragmentManager());
    
        AHBottomNavigationItem item1=new AHBottomNavigationItem("Home",R.drawable.ic_launcher_background);
        AHBottomNavigationItem item2=new AHBottomNavigationItem("Search",R.drawable.ic_launcher_background);
        AHBottomNavigationItem item3=new AHBottomNavigationItem("Bookmark",R.drawable.ic_launcher_background);
        
        bottomNavigationView.addItem(item1);
        bottomNavigationView.addItem(item2);
        bottomNavigationView.addItem(item3);
        
        myadapter.addFragment(new FrgOne());
        myadapter.addFragment(new FrgTwo());
        myadapter.addFragment(new FrgThree());
        viewPager.setAdapter(myadapter);
        
        bottomNavigationView.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
    
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (!wasSelected){
                    viewPager.setCurrentItem(position);
                }
                return true;
            }
        });
        
        
        
    }
}
