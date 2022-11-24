package com.cdp.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informacion extends AppCompatActivity {

    Button btn_usar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        btn_usar=(Button)findViewById(R.id.btn_usar);

        btn_usar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Informacion.this,NuevoActivity.class);
                startActivity(i);
            }
        });


    }
}