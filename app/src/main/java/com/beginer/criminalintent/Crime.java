package com.beginer.criminalintent;

import java.util.UUID;

public class Crime {


    private UUID mId;
    private String mTitile;
    private Date mDAte;

    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Datep;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitile() {
        return mTitile;
    }

    public Date getDAte() {
        return mDAte;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setTitile(String titile) {
        mTitile = titile;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
    public void setDAte(Date DAte) {
        mDAte = DAte;
    }


}
