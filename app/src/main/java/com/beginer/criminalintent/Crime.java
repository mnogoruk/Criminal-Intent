package com.beginer.criminalintent;

import java.util.UUID;
import java.util.Date;

public class Crime {


    private UUID mId;
    private String mTitle;
    private Date mDate;

    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setTitle(String titile) {
        mTitle = titile;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
    public void setDAte(Date DAte) {
        mDate = DAte;
    }


}
