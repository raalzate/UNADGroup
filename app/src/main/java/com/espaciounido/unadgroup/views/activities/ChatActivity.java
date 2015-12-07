package com.espaciounido.unadgroup.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.espaciounido.unadgroup.R;
import com.espaciounido.unadgroup.presenters.ChatActivityPresenter;
import com.espaciounido.unadgroup.views.activities.events.ClickMessageEvent;
import com.espaciounido.unadgroup.views.interfaces.IChatView;
import com.google.inject.Inject;

import roboguice.activity.RoboActionBarActivity;

import roboguice.event.Observes;
import roboguice.inject.ContentView;
import roboguice.inject.ContextSingleton;


@ContextSingleton
@ContentView(R.layout.activity_chat)
class ChatActivity extends RoboActionBarActivity implements IChatView {

    @Inject ChatActivityPresenter chatActivityPresenter;

    @Override  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        chatActivityPresenter.onCreate(this);
    }

    // handle  event
    protected void handleClickMessage( @Observes ClickMessageEvent event ) {
        Toast.makeText(this, event.getText(), Toast.LENGTH_LONG).show();
    }

    @Override public void onClickButton(View view) {

    }
}
