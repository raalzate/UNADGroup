package com.espaciounido.unadgroup.roboguice.modules;


import com.espaciounido.unadgroup.views.interfaces.IChatView;
import com.google.inject.AbstractModule;
/**
 * Created by Contenidos on 24/11/2015.
 */
public class AppModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(IChatView.class).to(ChatActivity.class);
    }
}
