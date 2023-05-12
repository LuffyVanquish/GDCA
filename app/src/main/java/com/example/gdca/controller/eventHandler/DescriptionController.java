package com.example.gdca.controller.eventHandler;

import android.app.Activity;
import android.view.View;
import com.example.gdca.R;
import com.example.gdca.controller.ChangeView;
import com.example.gdca.controller.PageName;

public class DescriptionController extends Controller implements View.OnClickListener {
    /**
     * Constructeur à utiliser pour le changement de page
     * @param activity
     * @param to_go_page
     * @param page_precedente
     */
    public DescriptionController(Activity activity, PageName to_go_page, PageName page_precedente)
    {
        super(activity, to_go_page, page_precedente);
    }

    /**
     * Constructeur à utiliser pour les actions des boutons lambda
     */
    public DescriptionController()
    {
        super(null,null,null);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b_retour:
                new ChangeView(currentActivity, to_go_page, page_precedente);
                break;
        }
    }
}