package com.urlisit.siteswrapper.android.tasks;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.urlisit.siteswrapper.android.R;
import com.urlisit.siteswrapper.android.gcm.CloudEndpointUtils;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.Siteendpoint;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.model.Site;

public class SiteInsert extends AsyncTask<Context, Integer, Long> {
  
  private Site site;
  
  protected Long doInBackground(Context... contexts) {
    @SuppressWarnings("unused")
    Site result;
    Siteendpoint.Builder siteEndpointBuilder = new Siteendpoint.Builder(AndroidHttp.newCompatibleTransport(), new JacksonFactory(), new HttpRequestInitializer() { public void initialize(HttpRequest httpRequest) { } });
    Siteendpoint endpoint = CloudEndpointUtils.updateBuilder(siteEndpointBuilder).build();
    try {
      result = endpoint.insertSite(site).execute();
    } catch (GoogleJsonResponseException e) {
      try {
        result = endpoint.updateSite(site).execute();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return (long) 0;
  }

  public void setState(FragmentActivity activity, Bundle siteBundle) {
    site = new Site();
    site.setTag(activity.getString(R.string.site));
    site.setName(siteBundle.getString(activity.getString(R.string.site_name_tag)));
    site.setDescription(siteBundle.getString(activity.getString(R.string.site_description_tag)));
    site.setLookAndFeel(siteBundle.getString(activity.getString(R.string.site_look_and_feel_tag)));
  }
}
