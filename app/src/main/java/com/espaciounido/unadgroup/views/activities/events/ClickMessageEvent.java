package com.espaciounido.unadgroup.views.activities.events;

/**
 * Created by Contenidos on 27/11/2015.
 */
public class ClickMessageEvent {

    private int position;
    private String text;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
