package com.brunoeleodoro.org.mvptest.MvpMainActivity;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by bruno on 23/12/17.
 */

public interface MVPMainActivity
{
    interface ModelMVP
    {
        public void enviarDados(HashMap<String,String> dados);
    }

    interface PresenterMVP
    {
        public void enviarDados(HashMap<String,String> dados);
        public void setViewMVP(MVPMainActivity.ViewMVP viewMVP);
        public void setDadosTextView(String dados);
        public Context getContext();
    }

    interface ViewMVP
    {
        public void setDadosTextView(String dados);
    }
}
