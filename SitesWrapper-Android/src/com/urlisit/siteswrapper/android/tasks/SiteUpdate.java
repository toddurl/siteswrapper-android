package com.urlisit.siteswrapper.android.tasks;

import java.io.IOException;
import java.util.Locale;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.urlisit.siteswrapper.android.R;
import com.urlisit.siteswrapper.android.gcm.CloudEndpointUtils;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.Siteendpoint;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.model.Site;

public class SiteUpdate extends AsyncTask<Context, Integer, Long> {
  
  private Site site;
  private Site result;
  private FragmentActivity activity;
  private Bundle bundle;
  private SharedPreferences file;
  private boolean successful = true;
  
  public SiteUpdate(FragmentActivity activity, Bundle bundle) {
    this.activity = activity;
    this.bundle = bundle;
    this.file = activity.getSharedPreferences(activity.getString(R.string.site), Context.MODE_PRIVATE);
  }
  
  @Override
  protected void onPreExecute() {
    site = new Site();
    site.setTag(activity.getString(R.string.site));
    site.setName(bundle.getString(activity.getString(R.string.site_name_tag)));
    site.setDescription(bundle.getString(activity.getString(R.string.site_description_tag)));
    site.setLookAndFeel(bundle.getString(activity.getString(R.string.site_look_and_feel_tag)));
    site.setDefaultPage(bundle.getString(activity.getString(R.string.site_default_page_tag)));
    site.setApplicationId(bundle.getString(activity.getString(R.string.site_application_id_tag)));
  }
  
  @Override
  protected Long doInBackground(Context... contexts) {
    Siteendpoint.Builder siteendpointBuilder = new Siteendpoint.Builder(AndroidHttp.newCompatibleTransport(), new JacksonFactory(), new HttpRequestInitializer() { public void initialize(HttpRequest httpRequest) { } });
    siteendpointBuilder.setApplicationName("urlesites");
    Siteendpoint endpoint = CloudEndpointUtils.updateBuilder(siteendpointBuilder).build();
    try {
      result = endpoint.updateSite(site).execute();
    } catch (GoogleJsonResponseException e) {
      try {
        result = endpoint.insertSite(site).execute();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return (long) 0;
  }
  
  @Override
  protected void onPostExecute(Long res) {
    Log.w("SiteUpdate", "onPostExecute()");
    SharedPreferences.Editor editor = file.edit();
    editor.putString(activity.getString(R.string.site_name_tag), result.getName())
          .putString(activity.getString(R.string.site_description_tag), result.getDescription())
          .putString(activity.getString(R.string.site_look_and_feel_tag), result.getLookAndFeel());
    if (successful) {
      editor.commit();
    } else {
      Log.w("SiteUpdate", "Update failed - Check your network connections and try again");
      new AlertDialog.Builder(activity.getCurrentFocus().getContext(), AlertDialog.THEME_HOLO_DARK)
      .setMessage("Update Failed - Check your network connection and try again.")
      .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
          dialog.dismiss();
        }
      }).show();
    }
  }
  
  public void setState(FragmentActivity activity, Bundle siteBundle) {
    site = new Site();
    site.setTag(activity.getString(R.string.site));
    site.setName(siteBundle.getString(activity.getString(R.string.site_name_tag)));
    site.setDescription(siteBundle.getString(activity.getString(R.string.site_description_tag)));
    site.setLookAndFeel(siteBundle.getString(activity.getString(R.string.site_look_and_feel_tag)));
    site.setDefaultPage(siteBundle.getString(activity.getString(R.string.site_default_page_tag)));
    site.setApplicationId(siteBundle.getString(activity.getString(R.string.site_application_id_tag)));
  }

}