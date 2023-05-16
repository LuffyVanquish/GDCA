package com.example.gdca.view;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.eventHandler.AideController;

public class Aide extends View {
    private final OnClickListener eventHandler;
    private Button retour;
    public Aide(ChangeView controller, Activity activity) {
        super(activity);
        eventHandler = new AideController(controller, activity);

        activity.setContentView(R.layout.aide);

        retour = (Button) activity.findViewById(R.id.b_retour);
        retour.setOnClickListener(eventHandler);
    }
}
