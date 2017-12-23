package com.brunoeleodoro.org.mvptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.brunoeleodoro.org.mvptest.MvpMainActivity.MVPMainActivity;
import com.brunoeleodoro.org.mvptest.MvpMainActivity.PresenterMainActivity;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements MVPMainActivity.ViewMVP {
    TextView txt_data;
    Button btn_getdados;
    private MVPMainActivity.PresenterMVP presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterMainActivity();
        presenter.setViewMVP(this);

        txt_data = (TextView) findViewById(R.id.txt_dados);
        btn_getdados = (Button) findViewById(R.id.btn_getdados);

        btn_getdados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NovaTela.class);
                startActivity(intent);

                /*
                HashMap<String,String> dados = new HashMap<>();
                dados.put("nome","teste");
                presenter.enviarDados(dados);
                */
            }
        });
    }

    @Override
    public void setDadosTextView(String dados) {
        txt_data.setText(dados);
    }
}
