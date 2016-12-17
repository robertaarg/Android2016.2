package br.edu.iff.a2.a2016.petapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastroPet extends AppCompatActivity {

    private Button PROX2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pet);

        PROX2 = (Button) findViewById(R.id.pro2);


        PROX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(cadastroPet.this, servicos.class);
                startActivity(tela);
                finish();

            }


        });
    }
}
