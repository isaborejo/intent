package com.example.imobiliariaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String msg=null;
        TextView txtINFO = findViewById(R.id.txtINFO);
        if (extras != null)
        {
            msg=extras.getString(MainActivity.EXTRA_MESSAGE);
            String msg3=getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE_VALOR);
            String msg2= getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE_ACESS);

            String txt = String.format("Regiões Selecionadas: %s/ Valor máximo: %s /Acessibilidade:%s", msg, msg3, msg2);

            txtINFO.setText(txt);
        }

    }
}
