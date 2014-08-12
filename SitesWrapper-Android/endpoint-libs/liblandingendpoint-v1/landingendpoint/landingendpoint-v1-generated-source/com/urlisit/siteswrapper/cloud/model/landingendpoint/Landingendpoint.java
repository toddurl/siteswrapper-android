/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-12 at 21:23:24 UTC 
 * Modify at your own risk.
 */

package com.urlisit.siteswrapper.cloud.model.landingendpoint;

/**
 * Service definition for Landingendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LandingendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Landingendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the landingendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://towingenterpriseexecutive.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "landingendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Landingendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Landingendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getLanding".
   *
   * This request holds the parameters needed by the landingendpoint server.  After setting any
   * optional parameters, call the {@link GetLanding#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetLanding getLanding(java.lang.String id) throws java.io.IOException {
    GetLanding result = new GetLanding(id);
    initialize(result);
    return result;
  }

  public class GetLanding extends LandingendpointRequest<com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing> {

    private static final String REST_PATH = "landing/{id}";

    /**
     * Create a request for the method "getLanding".
     *
     * This request holds the parameters needed by the the landingendpoint server.  After setting any
     * optional parameters, call the {@link GetLanding#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetLanding#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetLanding(java.lang.String id) {
      super(Landingendpoint.this, "GET", REST_PATH, null, com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetLanding setAlt(java.lang.String alt) {
      return (GetLanding) super.setAlt(alt);
    }

    @Override
    public GetLanding setFields(java.lang.String fields) {
      return (GetLanding) super.setFields(fields);
    }

    @Override
    public GetLanding setKey(java.lang.String key) {
      return (GetLanding) super.setKey(key);
    }

    @Override
    public GetLanding setOauthToken(java.lang.String oauthToken) {
      return (GetLanding) super.setOauthToken(oauthToken);
    }

    @Override
    public GetLanding setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetLanding) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetLanding setQuotaUser(java.lang.String quotaUser) {
      return (GetLanding) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetLanding setUserIp(java.lang.String userIp) {
      return (GetLanding) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetLanding setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetLanding set(String parameterName, Object value) {
      return (GetLanding) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertLanding".
   *
   * This request holds the parameters needed by the landingendpoint server.  After setting any
   * optional parameters, call the {@link InsertLanding#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing}
   * @return the request
   */
  public InsertLanding insertLanding(com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing content) throws java.io.IOException {
    InsertLanding result = new InsertLanding(content);
    initialize(result);
    return result;
  }

  public class InsertLanding extends LandingendpointRequest<com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing> {

    private static final String REST_PATH = "landing";

    /**
     * Create a request for the method "insertLanding".
     *
     * This request holds the parameters needed by the the landingendpoint server.  After setting any
     * optional parameters, call the {@link InsertLanding#execute()} method to invoke the remote
     * operation. <p> {@link InsertLanding#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing}
     * @since 1.13
     */
    protected InsertLanding(com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing content) {
      super(Landingendpoint.this, "POST", REST_PATH, content, com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing.class);
    }

    @Override
    public InsertLanding setAlt(java.lang.String alt) {
      return (InsertLanding) super.setAlt(alt);
    }

    @Override
    public InsertLanding setFields(java.lang.String fields) {
      return (InsertLanding) super.setFields(fields);
    }

    @Override
    public InsertLanding setKey(java.lang.String key) {
      return (InsertLanding) super.setKey(key);
    }

    @Override
    public InsertLanding setOauthToken(java.lang.String oauthToken) {
      return (InsertLanding) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertLanding setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertLanding) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertLanding setQuotaUser(java.lang.String quotaUser) {
      return (InsertLanding) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertLanding setUserIp(java.lang.String userIp) {
      return (InsertLanding) super.setUserIp(userIp);
    }

    @Override
    public InsertLanding set(String parameterName, Object value) {
      return (InsertLanding) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listLanding".
   *
   * This request holds the parameters needed by the landingendpoint server.  After setting any
   * optional parameters, call the {@link ListLanding#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListLanding listLanding() throws java.io.IOException {
    ListLanding result = new ListLanding();
    initialize(result);
    return result;
  }

  public class ListLanding extends LandingendpointRequest<com.urlisit.siteswrapper.cloud.model.landingendpoint.model.CollectionResponseLanding> {

    private static final String REST_PATH = "landing";

    /**
     * Create a request for the method "listLanding".
     *
     * This request holds the parameters needed by the the landingendpoint server.  After setting any
     * optional parameters, call the {@link ListLanding#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListLanding#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListLanding() {
      super(Landingendpoint.this, "GET", REST_PATH, null, com.urlisit.siteswrapper.cloud.model.landingendpoint.model.CollectionResponseLanding.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListLanding setAlt(java.lang.String alt) {
      return (ListLanding) super.setAlt(alt);
    }

    @Override
    public ListLanding setFields(java.lang.String fields) {
      return (ListLanding) super.setFields(fields);
    }

    @Override
    public ListLanding setKey(java.lang.String key) {
      return (ListLanding) super.setKey(key);
    }

    @Override
    public ListLanding setOauthToken(java.lang.String oauthToken) {
      return (ListLanding) super.setOauthToken(oauthToken);
    }

    @Override
    public ListLanding setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListLanding) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListLanding setQuotaUser(java.lang.String quotaUser) {
      return (ListLanding) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListLanding setUserIp(java.lang.String userIp) {
      return (ListLanding) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListLanding setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListLanding setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListLanding set(String parameterName, Object value) {
      return (ListLanding) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeLanding".
   *
   * This request holds the parameters needed by the landingendpoint server.  After setting any
   * optional parameters, call the {@link RemoveLanding#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveLanding removeLanding(java.lang.String id) throws java.io.IOException {
    RemoveLanding result = new RemoveLanding(id);
    initialize(result);
    return result;
  }

  public class RemoveLanding extends LandingendpointRequest<Void> {

    private static final String REST_PATH = "landing/{id}";

    /**
     * Create a request for the method "removeLanding".
     *
     * This request holds the parameters needed by the the landingendpoint server.  After setting any
     * optional parameters, call the {@link RemoveLanding#execute()} method to invoke the remote
     * operation. <p> {@link RemoveLanding#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveLanding(java.lang.String id) {
      super(Landingendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveLanding setAlt(java.lang.String alt) {
      return (RemoveLanding) super.setAlt(alt);
    }

    @Override
    public RemoveLanding setFields(java.lang.String fields) {
      return (RemoveLanding) super.setFields(fields);
    }

    @Override
    public RemoveLanding setKey(java.lang.String key) {
      return (RemoveLanding) super.setKey(key);
    }

    @Override
    public RemoveLanding setOauthToken(java.lang.String oauthToken) {
      return (RemoveLanding) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveLanding setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveLanding) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveLanding setQuotaUser(java.lang.String quotaUser) {
      return (RemoveLanding) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveLanding setUserIp(java.lang.String userIp) {
      return (RemoveLanding) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveLanding setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveLanding set(String parameterName, Object value) {
      return (RemoveLanding) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateLanding".
   *
   * This request holds the parameters needed by the landingendpoint server.  After setting any
   * optional parameters, call the {@link UpdateLanding#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing}
   * @return the request
   */
  public UpdateLanding updateLanding(com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing content) throws java.io.IOException {
    UpdateLanding result = new UpdateLanding(content);
    initialize(result);
    return result;
  }

  public class UpdateLanding extends LandingendpointRequest<com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing> {

    private static final String REST_PATH = "landing";

    /**
     * Create a request for the method "updateLanding".
     *
     * This request holds the parameters needed by the the landingendpoint server.  After setting any
     * optional parameters, call the {@link UpdateLanding#execute()} method to invoke the remote
     * operation. <p> {@link UpdateLanding#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing}
     * @since 1.13
     */
    protected UpdateLanding(com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing content) {
      super(Landingendpoint.this, "PUT", REST_PATH, content, com.urlisit.siteswrapper.cloud.model.landingendpoint.model.Landing.class);
    }

    @Override
    public UpdateLanding setAlt(java.lang.String alt) {
      return (UpdateLanding) super.setAlt(alt);
    }

    @Override
    public UpdateLanding setFields(java.lang.String fields) {
      return (UpdateLanding) super.setFields(fields);
    }

    @Override
    public UpdateLanding setKey(java.lang.String key) {
      return (UpdateLanding) super.setKey(key);
    }

    @Override
    public UpdateLanding setOauthToken(java.lang.String oauthToken) {
      return (UpdateLanding) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateLanding setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateLanding) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateLanding setQuotaUser(java.lang.String quotaUser) {
      return (UpdateLanding) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateLanding setUserIp(java.lang.String userIp) {
      return (UpdateLanding) super.setUserIp(userIp);
    }

    @Override
    public UpdateLanding set(String parameterName, Object value) {
      return (UpdateLanding) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Landingendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Landingendpoint}. */
    @Override
    public Landingendpoint build() {
      return new Landingendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link LandingendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLandingendpointRequestInitializer(
        LandingendpointRequestInitializer landingendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(landingendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}