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
 * on 2014-08-12 at 03:30:32 UTC 
 * Modify at your own risk.
 */

package com.urlisit.siteswrapper.cloud.model.siteendpoint.model;

/**
 * Model definition for Style.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the siteendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Style extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object encodedKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lookAndFeel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainMenuFontFamily;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainMenuFontSize;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainMenuHoverFontColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainMenuSelectedFontColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainMenuSelectionFontColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryAccentColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryAccentColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tertiaryAccentColor;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public Style setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getEncodedKey() {
    return encodedKey;
  }

  /**
   * @param encodedKey encodedKey or {@code null} for none
   */
  public Style setEncodedKey(java.lang.Object encodedKey) {
    this.encodedKey = encodedKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLookAndFeel() {
    return lookAndFeel;
  }

  /**
   * @param lookAndFeel lookAndFeel or {@code null} for none
   */
  public Style setLookAndFeel(java.lang.String lookAndFeel) {
    this.lookAndFeel = lookAndFeel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainMenuFontFamily() {
    return mainMenuFontFamily;
  }

  /**
   * @param mainMenuFontFamily mainMenuFontFamily or {@code null} for none
   */
  public Style setMainMenuFontFamily(java.lang.String mainMenuFontFamily) {
    this.mainMenuFontFamily = mainMenuFontFamily;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainMenuFontSize() {
    return mainMenuFontSize;
  }

  /**
   * @param mainMenuFontSize mainMenuFontSize or {@code null} for none
   */
  public Style setMainMenuFontSize(java.lang.String mainMenuFontSize) {
    this.mainMenuFontSize = mainMenuFontSize;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainMenuHoverFontColor() {
    return mainMenuHoverFontColor;
  }

  /**
   * @param mainMenuHoverFontColor mainMenuHoverFontColor or {@code null} for none
   */
  public Style setMainMenuHoverFontColor(java.lang.String mainMenuHoverFontColor) {
    this.mainMenuHoverFontColor = mainMenuHoverFontColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainMenuSelectedFontColor() {
    return mainMenuSelectedFontColor;
  }

  /**
   * @param mainMenuSelectedFontColor mainMenuSelectedFontColor or {@code null} for none
   */
  public Style setMainMenuSelectedFontColor(java.lang.String mainMenuSelectedFontColor) {
    this.mainMenuSelectedFontColor = mainMenuSelectedFontColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMainMenuSelectionFontColor() {
    return mainMenuSelectionFontColor;
  }

  /**
   * @param mainMenuSelectionFontColor mainMenuSelectionFontColor or {@code null} for none
   */
  public Style setMainMenuSelectionFontColor(java.lang.String mainMenuSelectionFontColor) {
    this.mainMenuSelectionFontColor = mainMenuSelectionFontColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryAccentColor() {
    return primaryAccentColor;
  }

  /**
   * @param primaryAccentColor primaryAccentColor or {@code null} for none
   */
  public Style setPrimaryAccentColor(java.lang.String primaryAccentColor) {
    this.primaryAccentColor = primaryAccentColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryColor() {
    return primaryColor;
  }

  /**
   * @param primaryColor primaryColor or {@code null} for none
   */
  public Style setPrimaryColor(java.lang.String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * @param revision revision or {@code null} for none
   */
  public Style setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryAccentColor() {
    return secondaryAccentColor;
  }

  /**
   * @param secondaryAccentColor secondaryAccentColor or {@code null} for none
   */
  public Style setSecondaryAccentColor(java.lang.String secondaryAccentColor) {
    this.secondaryAccentColor = secondaryAccentColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTertiaryAccentColor() {
    return tertiaryAccentColor;
  }

  /**
   * @param tertiaryAccentColor tertiaryAccentColor or {@code null} for none
   */
  public Style setTertiaryAccentColor(java.lang.String tertiaryAccentColor) {
    this.tertiaryAccentColor = tertiaryAccentColor;
    return this;
  }

  @Override
  public Style set(String fieldName, Object value) {
    return (Style) super.set(fieldName, value);
  }

  @Override
  public Style clone() {
    return (Style) super.clone();
  }

}
