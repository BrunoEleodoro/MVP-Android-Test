package com.brunoeleodoro.org.mvptest.MvpNovaTela;

import android.content.Context;

/**
 * Created by bruno on 23/12/17.
 */

public interface MVPNovaTela {

    interface Model
    {
        public void retriveData();
    }
    interface Presenter
    {
        public void retriveData();
        public void showToast(String msg);
        public Context getContext();
        public void setView(MVPNovaTela.View view );
    }
    interface View
    {
        public void showToast(String msg);
    }
}
