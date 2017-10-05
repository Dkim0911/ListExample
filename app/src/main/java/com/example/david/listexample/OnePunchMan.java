package com.example.david.listexample;

/**
 * Created by gosht on 9/27/2017.
 */

public class OnePunchMan {
    //par of the model layer because it knows nothing about android
    private String name;
    private String desc;
    private int ranking;
    private int imgResourceId;


    public OnePunchMan(String name, String desc, int imgResourceId, int ranking) {
        this.name = name;
        this.desc = desc;
        this.imgResourceId = imgResourceId;
        this.ranking = ranking;
    }
    public String toString(){
        return name;
    }

    public String getName()

    {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImgResourceId(){
        return imgResourceId;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}


