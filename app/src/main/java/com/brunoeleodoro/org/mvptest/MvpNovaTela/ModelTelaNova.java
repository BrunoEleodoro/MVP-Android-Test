package com.brunoeleodoro.org.mvptest.MvpNovaTela;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by bruno on 23/12/17.
 */

public class ModelTelaNova implements MVPNovaTela.Model{
    private MVPNovaTela.Presenter presenter;
    public ModelTelaNova()
    {
        presenter = new PresenterTelaNova();
    }

    @Override
    public void retriveData() {
        RequestQueue queue = Volley.newRequestQueue(presenter.getContext());

        StringRequest request = new StringRequest(Request.Method.GET, "http://192.168.0.101/localweb/data.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                presenter.showToast(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        queue.add(request);

    }
}
