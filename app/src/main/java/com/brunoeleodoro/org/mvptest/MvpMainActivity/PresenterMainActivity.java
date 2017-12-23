package com.brunoeleodoro.org.mvptest.MvpMainActivity;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by bruno on 23/12/17.
 */

public class PresenterMainActivity implements MVPMainActivity.PresenterMVP {
    private MVPMainActivity.ModelMVP model;
    private MVPMainActivity.ViewMVP viewMVP;

    public PresenterMainActivity()
    {
        model = new ModelMainActivity(this);
    }
    @Override
    public void setViewMVP(MVPMainActivity.ViewMVP viewMVP)
    {
        this.viewMVP = viewMVP;
    }

    @Override
    public void enviarDados(HashMap<String, String> dados) {
        model.enviarDados(dados);
    }



    @Override
    public void setDadosTextView(String dados) {
        viewMVP.setDadosTextView(dados);
    }

    @Override
    public Context getContext() {
        return (Context) viewMVP;
    }

}
