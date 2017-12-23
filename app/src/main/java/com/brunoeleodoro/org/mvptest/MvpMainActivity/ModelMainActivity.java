package com.brunoeleodoro.org.mvptest.MvpMainActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;

/**
 * Created by bruno on 23/12/17.
 */

public class ModelMainActivity implements MVPMainActivity.ModelMVP {


    private MVPMainActivity.PresenterMVP presenter;

    public ModelMainActivity(MVPMainActivity.PresenterMVP presenter)
    {
        this.presenter = presenter;
    }
    @Override
    public void enviarDados(final HashMap<String,String> dados)
    {
        RequestQueue queue = Volley.newRequestQueue(presenter.getContext());
        StringRequest request = new StringRequest(Request.Method.POST, "http://192.168.0.101/localweb/teste.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                presenter.setDadosTextView(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        })
        {
            @Override
            protected HashMap<String,String> getParams()
            {
                return dados;
            }
        };

        queue.add(request);
    }

}
