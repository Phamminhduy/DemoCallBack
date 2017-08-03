package com.example.phamm.demobottomtabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity implements TabHost.OnTabChangeListener,ViewPager.OnPageChangeListener,Tab1.Callback{
    ViewPager viewPager;
    TabHost mTabHost;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);
        initialiseTabHost();
        viewPager.setAdapter(mSectionsPagerAdapter);
        viewPager.setOnPageChangeListener(MainActivity.this);

    }



    private void initialiseTabHost() {
        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        // TODO Put here your Tabs
        MainActivity.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("Tab 1").setIndicator("Tab 1"));
        MainActivity.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("Tab 2 ").setIndicator("Tab 2"));
        MainActivity.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("Tab 3").setIndicator("Tab 3"));
        MainActivity.AddTab(this, this.mTabHost, this.mTabHost.newTabSpec("Tab 4").setIndicator("Tab 4"));
        mTabHost.setOnTabChangedListener(this);
    }

    private static void AddTab(MainActivity activity, TabHost tabHost, TabHost.TabSpec tabSpec) {
        tabSpec.setContent(new TabFactory(activity));
        tabHost.addTab(tabSpec);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        int pos  = this.viewPager.getCurrentItem();
        this.mTabHost.setCurrentTab(pos);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String s) {
        int position  = this.mTabHost.getCurrentTab();
        this.viewPager.setCurrentItem(position);
    }

    @Override
    public void onClick(int position) {
        finish();
    }
}
class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: Fragment t1 =new Tab1();
                return t1;
            case 1: Fragment t2 = new Tab2();
                return t2;
            case 2 : Fragment t3 = new Tab3();
                return t3;
            case 3 : Fragment t4 =new Tab4();
                return t4;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

}


