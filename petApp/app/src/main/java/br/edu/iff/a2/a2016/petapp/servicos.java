package br.edu.iff.a2.a2016.petapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class servicos extends AppCompatActivity {

    private Button BT,BMT,BTR,H,HT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);


        BT = (Button) findViewById(R.id.bt);



        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(servicos.this, Agenda.class);
                startActivity(tela);
                finish();

            }

        });


        BMT = (Button) findViewById(R.id.bmt);


        BMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(servicos.this, Agenda.class);
                startActivity(tela);
                finish();

            }


        });

        BTR = (Button) findViewById(R.id.btr);


        BTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(servicos.this, Agenda.class);
                startActivity(tela);
                finish();

            }


        });


        H = (Button) findViewById(R.id.h);


        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(servicos.this, Agenda.class);
                startActivity(tela);
                finish();

            }


        });

        HT = (Button) findViewById(R.id.ht);


        HT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent tela = new Intent(servicos.this, Agenda.class);
                startActivity(tela);
                finish();

            }


        });

    }
}
