/**
 * 
 */
package com.urlisit.siteswrapper.android.views;

import com.urlisit.siteswrapper.android.R;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * @author url
 *
 */
public class ViewFactory extends Fragment {
  
  /*
   * color, increment, MIN and MAX are used to provide a color gradient useful as a fragment background color
   */
  private static int color = 0xff494949;
  private static int increment = 14;
  private static final int MIN = 0x00;
  private static final int MAX = 0xFF;
  
  /**
   * 
   */
  public ViewFactory() { }
  
  public static Fragment newInstance(int pageNumber, FragmentActivity activity) {
    Fragment pageView = null;
    Bundle pageBundle = null;
    SharedPreferences pageFile = null;
    switch (pageNumber) {
      case SitePageView.PAGE_NUMBER:
        pageView = new SitePageView();
        pageBundle = new Bundle();
        pageFile = activity.getSharedPreferences(activity.getString(R.string.site), Context.MODE_PRIVATE);
        pageBundle.putInt(SitePageView.PAGE_COLOR, nextColor());
        pageBundle.putString(activity.getString(R.string.site_name_tag), pageFile.getString(activity.getString(R.string.site_name_tag), null));
        pageBundle.putString(activity.getString(R.string.site_description_tag), pageFile.getString(activity.getString(R.string.site_description_tag), null));
        pageView.setArguments(pageBundle);
        break;
      default:
        pageView = new SitePageView();
        pageBundle = new Bundle();
        pageFile = activity.getSharedPreferences(activity.getString(R.string.site), Context.MODE_PRIVATE);
        pageBundle.putInt(SitePageView.PAGE_COLOR, nextColor());
        pageBundle.putString(activity.getString(R.string.site_name_tag), pageFile.getString(activity.getString(R.string.site_name_tag), null));
        pageBundle.putString(activity.getString(R.string.site_description_tag), pageFile.getString(activity.getString(R.string.site_description_tag), null));
        pageView.setArguments(pageBundle);
        break;
    }
    return pageView;
  }
  
  private static int nextColor() {
    int red = (Color.red(color) + increment <= MAX) ? Color.red(color) + increment : MIN;
    int green = (Color.green(color) + increment <= MAX) ? Color.green(color) + increment : MIN;
    int blue = (Color.blue(color) + increment <= MAX) ? Color.blue(color) + increment : MIN;
    return color = Color.rgb(red, green, blue);
  }
  
}
