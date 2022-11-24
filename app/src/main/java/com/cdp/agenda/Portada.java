package com.cdp.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Portada extends AppCompatActivity {

    Button btn_sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);
        btn_sig=(Button)findViewById(R.id.btn_sig);

        //btn_sig.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //  Intent btn_sig = new Intent(Portada.this, Informaciones.class);
        //startActivity(btn_sig);
        // }
        // });


        btn_sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Portada.this, Informacion.class);
                startActivity(i);
            }
        });

    }
}