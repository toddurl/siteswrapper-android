/**
 * 
 */
package com.urlisit.esiteswrapper.tasks;

import java.io.IOException;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.urlisit.esiteswrapper.gcm.CloudEndpointUtils;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.Siteendpoint;
import com.urlisit.siteswrapper.cloud.model.siteendpoint.model.Site;

import android.content.Context;
import android.os.AsyncTask;

/**
 * @author url
 *
 */
public class SiteRemove extends AsyncTask<Context, Integer, Long> {
  protected Long doInBackground(Context... contexts) {
    Siteendpoint.Builder siteEndpointBuilder = new Siteendpoint.Builder(AndroidHttp.newCompatibleTransport(), new JacksonFactory(), new HttpRequestInitializer() { public void initialize(HttpRequest httpRequest) { } });
    Siteendpoint endpoint = CloudEndpointUtils.updateBuilder(siteEndpointBuilder).build();
    try {
      endpoint.removeSite("com.urlisit.urlesites.model.Site").execute();
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    /*
    try {
      Site site = new Site();
      site.setTag("com.urlisit.urlesites.model.Site");
      site.setName("Test Site");
      endpoint.insertSite(site).execute();
    } catch (IOException e) {
      e.printStackTrace();
    }
    */
    return (long) 0;
  }
}