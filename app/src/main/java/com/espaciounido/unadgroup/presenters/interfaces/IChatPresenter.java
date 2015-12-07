package com.espaciounido.unadgroup.presenters.interfaces;

import com.espaciounido.unadgroup.views.interfaces.IChatView;

/**
 * Created by Contenidos on 24/11/2015.
 */
public interface IChatPresenter {
    public void onCreate(IChatView iChatView);
    public void showList();
    public void onItemClicked(int position);
}
