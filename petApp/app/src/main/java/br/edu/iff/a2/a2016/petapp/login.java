package br.edu.iff.a2.a2016.petapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button CAD, enviar;

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        CAD = (Button) findViewById(R.id.cadastrar);


        CAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(login.this, cadastroPessoa.class);
                startActivity(tela);
                finish();

            }


        });

    }
}
