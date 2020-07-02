
package com.sparta.ee;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class GOTPOJO {

    @SerializedName("aliases")
    private List<String> mAliases;
    @SerializedName("allegiances")
    private List<String> mAllegiances;
    @SerializedName("books")
    private List<String> mBooks;
    @SerializedName("born")
    private String mBorn;
    @SerializedName("culture")
    private String mCulture;
    @SerializedName("died")
    private String mDied;
    @SerializedName("father")
    private String mFather;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("mother")
    private String mMother;
    @SerializedName("name")
    private String mName;
    @SerializedName("playedBy")
    private List<String> mPlayedBy;
    @SerializedName("povBooks")
    private List<String> mPovBooks;
    @SerializedName("spouse")
    private String mSpouse;
    @SerializedName("titles")
    private List<String> mTitles;
    @SerializedName("tvSeries")
    private List<String> mTvSeries;
    @SerializedName("url")
    private String mUrl;

    public List<String> getAliases() {
        return mAliases;
    }

    public void setAliases(List<String> aliases) {
        mAliases = aliases;
    }

    public List<String> getAllegiances() {
        return mAllegiances;
    }

    public void setAllegiances(List<String> allegiances) {
        mAllegiances = allegiances;
    }

    public List<String> getBooks() {
        return mBooks;
    }

    public void setBooks(List<String> books) {
        mBooks = books;
    }

    public String getBorn() {
        return mBorn;
    }

    public void setBorn(String born) {
        mBorn = born;
    }

    public String getCulture() {
        return mCulture;
    }

    public void setCulture(String culture) {
        mCulture = culture;
    }

    public String getDied() {
        return mDied;
    }

    public void setDied(String died) {
        mDied = died;
    }

    public String getFather() {
        return mFather;
    }

    public void setFather(String father) {
        mFather = father;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getMother() {
        return mMother;
    }

    public void setMother(String mother) {
        mMother = mother;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<String> getPlayedBy() {
        return mPlayedBy;
    }

    public void setPlayedBy(List<String> playedBy) {
        mPlayedBy = playedBy;
    }

    public List<String> getPovBooks() {
        return mPovBooks;
    }

    public void setPovBooks(List<String> povBooks) {
        mPovBooks = povBooks;
    }

    public String getSpouse() {
        return mSpouse;
    }

    public void setSpouse(String spouse) {
        mSpouse = spouse;
    }

    public List<String> getTitles() {
        return mTitles;
    }

    public void setTitles(List<String> titles) {
        mTitles = titles;
    }

    public List<String> getTvSeries() {
        return mTvSeries;
    }

    public void setTvSeries(List<String> tvSeries) {
        mTvSeries = tvSeries;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
