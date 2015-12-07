package com.espaciounido.unadgroup.presenters;

import com.espaciounido.unadgroup.presenters.interfaces.IChatPresenter;
import com.espaciounido.unadgroup.views.activities.events.ClickMessageEvent;
import com.espaciounido.unadgroup.views.interfaces.IChatView;
import com.google.inject.Inject;

import roboguice.event.EventManager;


/**
 * Created by Contenidos on 24/11/2015.
 */


public class ChatActivityPresenter implements IChatPresenter{

    @Inject protected EventManager eventManager;
    @Inject protected ClickMessageEvent clickMessageEvent;

    IChatView view;


    @Override public void onCreate(IChatView iChatView) {
        view = iChatView;
    }

    @Override public void showList() {

    }

    @Override public void onItemClicked(int position) {
        clickMessageEvent.setPosition(position);
        clickMessageEvent.setText("Hola - clickMessageEvent");
        eventManager.fire(clickMessageEvent);
    }
}
