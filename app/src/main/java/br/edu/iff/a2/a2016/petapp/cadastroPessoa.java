package br.edu.iff.a2.a2016.petapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastroPessoa extends AppCompatActivity {

    private Button PROX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);


        PROX = (Button) findViewById(R.id.proximo);


        PROX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(cadastroPessoa.this, cadastroPet.class);
                startActivity(tela);
                finish();

            }


        });
    }
}
