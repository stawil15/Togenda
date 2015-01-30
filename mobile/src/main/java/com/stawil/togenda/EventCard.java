package com.stawil.togenda;

import android.graphics.Color;

/**
 * Created by Saeed Tawil on 11/11/2014.
 */
public class EventCard extends GenericCard{

    public EventCard(String title, String description){
        this.title = title;
        this.description = description;
    }
    public EventCard(String title, String description, long startTime, long endTime, int c){
        this.title = title;
        this.description = description;
        this.starttime = startTime;
        this.endtime = endTime;
        this.color = c;
    }
}