package com.brunoeleodoro.org.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.brunoeleodoro.org.mvptest.MvpNovaTela.MVPNovaTela;
import com.brunoeleodoro.org.mvptest.MvpNovaTela.PresenterTelaNova;

public class NovaTela extends AppCompatActivity implements MVPNovaTela.View{
    private MVPNovaTela.Presenter presenter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tela);

        presenter = new PresenterTelaNova();
        presenter.setView(this);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.retriveData();
            }
        });
    }
    @Override
    public void showToast(String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
