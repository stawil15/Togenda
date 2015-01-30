package com.stawil.togenda;

/**
 * Created by saeed on 1/20/15.
 */
public class GenericCard {
    protected String title;
    protected String description;
    protected long starttime;
    protected long endtime;
    protected int color;
    protected String type = "generic";

    public String getType(){
        return type;
    }

    public GenericCard(){

    }
}


