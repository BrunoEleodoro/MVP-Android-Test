package com.brunoeleodoro.org.mvptest.MvpNovaTela;

import android.content.Context;

/**
 * Created by bruno on 23/12/17.
 */

public class PresenterTelaNova implements MVPNovaTela.Presenter {
    private MVPNovaTela.Model model;
    private MVPNovaTela.View view;

    public PresenterTelaNova()
    {
        model = new ModelTelaNova();
    }

    @Override
    public void setView(MVPNovaTela.View view) {
        this.view = view;
    }

    @Override
    public void retriveData() {
        model.retriveData();
    }

    @Override
    public void showToast(String msg) {
        view.showToast(msg);
    }

    @Override
    public Context getContext() {
        return (Context) view;
    }

}
