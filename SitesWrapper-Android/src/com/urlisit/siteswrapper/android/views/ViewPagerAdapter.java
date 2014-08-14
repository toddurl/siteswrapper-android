/**
 * 
 */
package com.urlisit.siteswrapper.android.views;

import com.urlisit.siteswrapper.android.R;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author url
 *
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
  
  private FragmentActivity activity;

  /**
   * @param fm
   */
  public ViewPagerAdapter(FragmentManager fm, FragmentActivity fa) {
    super(fm);
    activity = fa;
  }

  /**
   * @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
   */
  @Override
  public Fragment getItem(int pageNumber) {
    return ViewFactory.newInstance(pageNumber, activity);
  }

  /**
   * @see android.support.v4.view.FragmentPagerAdapter#getPageTitle(int)
   */
  @Override
  public CharSequence getPageTitle(int pageNumber) {
    return activity.getResources().getStringArray(R.array.page_titles)[pageNumber];
  }
  
  /**
   * @see android.support.v4.view.PagerAdapter#getCount()
   */
  @Override
  public int getCount() {
    return activity.getResources().getStringArray(R.array.page_titles).length;
  }

}