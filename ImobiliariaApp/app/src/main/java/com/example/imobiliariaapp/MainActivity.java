 package com.example.imobiliariaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

 public class MainActivity extends AppCompatActivity {
     public final static String EXTRA_MESSAGE_VALOR = "com.example.imobiliariaapp.VALUE";
     public final static String EXTRA_MESSAGE = "com.example.imobiliariaapp.MESSAGE";
     public final static String EXTRA_MESSAGE_ACESS = "com.example.imobiliariaapp.ACESSO" ;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
     }

     public void btnE(View view) {
         EditText etxtDIN = findViewById(R.id.etxtDIN);
         Switch sw1 = findViewById(R.id.sw1);
         Switch sw2 = findViewById(R.id.sw2);
         Switch sw3 = findViewById(R.id.sw3);
         RadioButton rd1 = findViewById(R.id.rd1);
         RadioButton rd2 = findViewById(R.id.rd2);
         Intent intent = new Intent(this, Main2Activity.class);
         String txtDIN =  etxtDIN.getText().toString();
         String opcselec="";
         if (sw1.isChecked())
         {
             opcselec+="Osasco ";
         }
         if(sw2.isChecked())
         {
             opcselec+="São Paulo ";
         }
        if (sw3.isChecked())
        {
            opcselec+="Guarulhos ";
        }
        String acess="";
        if (rd1.isChecked())
        {
            acess+="SIM";
        }
        if(rd2.isChecked())
        {
            acess+="NÃO";
        }
        intent.putExtra(EXTRA_MESSAGE_VALOR,txtDIN);
        intent.putExtra(EXTRA_MESSAGE,opcselec);
        intent.putExtra(EXTRA_MESSAGE_ACESS,acess);
        startActivity(intent);
     }
 }