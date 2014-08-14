package com.urlisit.siteswrapper.android.activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.urlisit.siteswrapper.android.R;
import com.urlisit.siteswrapper.android.tasks.SiteRemove;
import com.urlisit.siteswrapper.android.tasks.SiteUpdate;
import com.urlisit.siteswrapper.android.views.SiteView;
import com.urlisit.siteswrapper.android.views.ViewPagerAdapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ESitesWrapper extends FragmentActivity {
  
  /**
   * The {@link ViewPager} that will host the section contents.
   */
  ViewPager viewPager;
  
  /**
   * The {@link android.support.v4.view.PagerAdapter} that will provide fragments for each of the sections. We use
   * a {@link android.support.v4.app.FragmentPagerAdapter} derivative, which will keep every loaded fragment in memory.
   * If this becomes too memory intensive, it may be best to switch to a {@link android.support.v4.app.FragmentStatePagerAdapter}.
   */
  ViewPagerAdapter viewPagerAdapter;
  
  private Menu optionsMenu;
  private View refreshIndeterminateProgressView = null;
  
  /**
   * A collection of fragments
   */
  public List<Fragment> pageViews = new ArrayList<Fragment>();
  private SharedPreferences pref;

  String[] pageTitles;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
    viewPager = (ViewPager) findViewById(R.id.pager);
    viewPager.setAdapter(viewPagerAdapter);

  }
  
  @Override
  public void onAttachFragment (Fragment fragment) {
    pageViews.add(fragment);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    //optionsMenu = menu;
    getMenuInflater().inflate(R.menu.main, optionsMenu = menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    Toast statusMessage;
    switch (item.getItemId()) {
      case R.id.action_update:
        SiteUpdate siteUpdate = new SiteUpdate(this, pageViews.get(SiteView.VIEW_NUMBER).getArguments());
        siteUpdate.execute(getApplicationContext());
        setActionUpdateState(true);
        getWindow().getDecorView().postDelayed(new Runnable() {
          @Override
          public void run() {
            setActionUpdateState(false);
          }
        }, 1000);
        break;
      case R.id.action_settings:
        statusMessage = Toast.makeText(this, ((SiteView) pageViews.get(0)).getId(), Toast.LENGTH_LONG);
        statusMessage.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        statusMessage.show();
        break;
        /*
    case R.id.site_update:
      SiteUpdate siteUpdate = new SiteUpdate(this, pageViews.get(SiteView.VIEW_NUMBER).getArguments());
      //siteUpdate.setState(this, pageViews.get(SiteView.VIEW_NUMBER).getArguments());
      siteUpdate.execute(getApplicationContext());
      //new SiteUpdate().execute(getApplicationContext());
      //pref = getSharedPreferences(getString(R.string.site), MODE_PRIVATE);
      //Toast.makeText(getApplicationContext(), getString(R.string.site_name_tag) + "=" + pref.getString(getString(R.string.site_name_tag), "default_value"), Toast.LENGTH_LONG).show();
      //Log.w("ESitesWrapper", getString(R.string.site_name_tag) + "=" + pref.getString(getString(R.string.site_name_tag), "default_value"));
      //Log.w("ESitesWrapper", "onOptionsItemSelected()=site_update");
      break;
      */
    case R.id.site_remove:
      new SiteRemove().execute(getApplicationContext());
      Log.w("ESitesWrapper", "onOptionsItemSelected()=site_remove");
      break;
    case R.id.site_name_value:
      pref = getSharedPreferences(getString(R.string.site), MODE_PRIVATE);
      Toast.makeText(getApplicationContext(), pref.getString(getString(R.string.site_name_tag), "default_value"), Toast.LENGTH_LONG).show();
      break;
    case R.id.site_description_value:
      pref = getSharedPreferences(getString(R.string.site), MODE_PRIVATE);
      Toast.makeText(getApplicationContext(), pref.getString(getString(R.string.site_description_tag), "default_value"), Toast.LENGTH_LONG).show();
      break;
    case R.id.site_look_and_feel_value:
      pref = getSharedPreferences(getString(R.string.site), MODE_PRIVATE);
      Toast.makeText(getApplicationContext(), pref.getString(getString(R.string.site_look_and_feel_tag), "default_value"), Toast.LENGTH_LONG).show();
      break;
    }
    return false;
  }
  
  public Fragment getPageView(int pageNumber) {
    return pageViews.get(pageNumber);
  }

  public void setActionUpdateState(boolean updating) {
    if (updating) {
      if (refreshIndeterminateProgressView == null) {
        LayoutInflater inflater = (LayoutInflater) getActionBar().getThemedContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        refreshIndeterminateProgressView = inflater.inflate(R.layout.actionbar_indeterminate_progress, null);
      }
      optionsMenu.findItem(R.id.action_update).setActionView(refreshIndeterminateProgressView);
    } else {
      optionsMenu.findItem(R.id.action_update).setActionView(null);
    }
  }
  
}
