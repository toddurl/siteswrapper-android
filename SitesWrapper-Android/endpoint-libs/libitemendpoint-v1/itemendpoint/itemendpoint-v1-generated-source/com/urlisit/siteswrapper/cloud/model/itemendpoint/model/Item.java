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
 * on 2014-08-13 at 02:43:10 UTC 
 * Modify at your own risk.
 */

package com.urlisit.siteswrapper.cloud.model.itemendpoint.model;

/**
 * Model definition for Item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the itemendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Item extends com.google.api.client.json.GenericJson {

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
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastmod;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationEight;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationFive;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationFour;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationNine;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationOne;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationSeven;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationSix;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationTen;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationThree;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificationTwo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueEight;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueFive;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueFour;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueNine;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueOne;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueSeven;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueSix;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueTen;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueThree;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueTwo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public Item setDescription(java.lang.String description) {
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
  public Item setEncodedKey(java.lang.Object encodedKey) {
    this.encodedKey = encodedKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * @param imageUrl imageUrl or {@code null} for none
   */
  public Item setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastmod() {
    return lastmod;
  }

  /**
   * @param lastmod lastmod or {@code null} for none
   */
  public Item setLastmod(java.lang.String lastmod) {
    this.lastmod = lastmod;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkName() {
    return linkName;
  }

  /**
   * @param linkName linkName or {@code null} for none
   */
  public Item setLinkName(java.lang.String linkName) {
    this.linkName = linkName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkUrl() {
    return linkUrl;
  }

  /**
   * @param linkUrl linkUrl or {@code null} for none
   */
  public Item setLinkUrl(java.lang.String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Item setName(java.lang.String name) {
    this.name = name;
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
  public Item setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationEight() {
    return specificationEight;
  }

  /**
   * @param specificationEight specificationEight or {@code null} for none
   */
  public Item setSpecificationEight(java.lang.String specificationEight) {
    this.specificationEight = specificationEight;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationFive() {
    return specificationFive;
  }

  /**
   * @param specificationFive specificationFive or {@code null} for none
   */
  public Item setSpecificationFive(java.lang.String specificationFive) {
    this.specificationFive = specificationFive;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationFour() {
    return specificationFour;
  }

  /**
   * @param specificationFour specificationFour or {@code null} for none
   */
  public Item setSpecificationFour(java.lang.String specificationFour) {
    this.specificationFour = specificationFour;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationNine() {
    return specificationNine;
  }

  /**
   * @param specificationNine specificationNine or {@code null} for none
   */
  public Item setSpecificationNine(java.lang.String specificationNine) {
    this.specificationNine = specificationNine;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationOne() {
    return specificationOne;
  }

  /**
   * @param specificationOne specificationOne or {@code null} for none
   */
  public Item setSpecificationOne(java.lang.String specificationOne) {
    this.specificationOne = specificationOne;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationSeven() {
    return specificationSeven;
  }

  /**
   * @param specificationSeven specificationSeven or {@code null} for none
   */
  public Item setSpecificationSeven(java.lang.String specificationSeven) {
    this.specificationSeven = specificationSeven;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationSix() {
    return specificationSix;
  }

  /**
   * @param specificationSix specificationSix or {@code null} for none
   */
  public Item setSpecificationSix(java.lang.String specificationSix) {
    this.specificationSix = specificationSix;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationTen() {
    return specificationTen;
  }

  /**
   * @param specificationTen specificationTen or {@code null} for none
   */
  public Item setSpecificationTen(java.lang.String specificationTen) {
    this.specificationTen = specificationTen;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationThree() {
    return specificationThree;
  }

  /**
   * @param specificationThree specificationThree or {@code null} for none
   */
  public Item setSpecificationThree(java.lang.String specificationThree) {
    this.specificationThree = specificationThree;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificationTwo() {
    return specificationTwo;
  }

  /**
   * @param specificationTwo specificationTwo or {@code null} for none
   */
  public Item setSpecificationTwo(java.lang.String specificationTwo) {
    this.specificationTwo = specificationTwo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueEight() {
    return valueEight;
  }

  /**
   * @param valueEight valueEight or {@code null} for none
   */
  public Item setValueEight(java.lang.String valueEight) {
    this.valueEight = valueEight;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueFive() {
    return valueFive;
  }

  /**
   * @param valueFive valueFive or {@code null} for none
   */
  public Item setValueFive(java.lang.String valueFive) {
    this.valueFive = valueFive;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueFour() {
    return valueFour;
  }

  /**
   * @param valueFour valueFour or {@code null} for none
   */
  public Item setValueFour(java.lang.String valueFour) {
    this.valueFour = valueFour;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueNine() {
    return valueNine;
  }

  /**
   * @param valueNine valueNine or {@code null} for none
   */
  public Item setValueNine(java.lang.String valueNine) {
    this.valueNine = valueNine;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueOne() {
    return valueOne;
  }

  /**
   * @param valueOne valueOne or {@code null} for none
   */
  public Item setValueOne(java.lang.String valueOne) {
    this.valueOne = valueOne;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueSeven() {
    return valueSeven;
  }

  /**
   * @param valueSeven valueSeven or {@code null} for none
   */
  public Item setValueSeven(java.lang.String valueSeven) {
    this.valueSeven = valueSeven;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueSix() {
    return valueSix;
  }

  /**
   * @param valueSix valueSix or {@code null} for none
   */
  public Item setValueSix(java.lang.String valueSix) {
    this.valueSix = valueSix;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueTen() {
    return valueTen;
  }

  /**
   * @param valueTen valueTen or {@code null} for none
   */
  public Item setValueTen(java.lang.String valueTen) {
    this.valueTen = valueTen;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueThree() {
    return valueThree;
  }

  /**
   * @param valueThree valueThree or {@code null} for none
   */
  public Item setValueThree(java.lang.String valueThree) {
    this.valueThree = valueThree;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValueTwo() {
    return valueTwo;
  }

  /**
   * @param valueTwo valueTwo or {@code null} for none
   */
  public Item setValueTwo(java.lang.String valueTwo) {
    this.valueTwo = valueTwo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoUrl() {
    return videoUrl;
  }

  /**
   * @param videoUrl videoUrl or {@code null} for none
   */
  public Item setVideoUrl(java.lang.String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  @Override
  public Item set(String fieldName, Object value) {
    return (Item) super.set(fieldName, value);
  }

  @Override
  public Item clone() {
    return (Item) super.clone();
  }

}
