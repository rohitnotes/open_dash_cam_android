package com.example.myfirstapp;

import android.app.Service;
import android.view.View;
import android.view.WindowManager;


public class SettingsWidget extends Widget {
    SettingsWidget(Service service, WindowManager windowManager) {
        super(service, windowManager);

        // Set image for the widget
        widgetDrawableResource = R.drawable.settings_widget;

        // @TODO: Open settings view
        widget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
