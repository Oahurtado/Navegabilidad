package com.example.oscar.navegabilidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void irMain(View a){
        //Linnea para mensaje de alerta.Semejante a ShowMessageDialog de java
        Toast.makeText(this,"Hola Main",Toast.LENGTH_LONG).show();
        Intent vol = new Intent(Home.this,MainActivity.class);
        startActivity(vol);
        //startActivity(vol.addFlags(vol.FLAG_ACTIVITY_CLEAR_TOP | vol.FLAG_ACTIVITY_CLEAR_TASK));

    }
}
