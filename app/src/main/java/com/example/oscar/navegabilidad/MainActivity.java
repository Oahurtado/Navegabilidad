package com.example.oscar.navegabilidad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        className=getApplication().getClass().toString();
    }
    //Metodo para ir de MainActivitu a Home activity
    public void irHome(View b){
        //Linnea para mensaje de alerta.Semejante a ShowMessageDialog de java


    }

    String className;


    public void alertDialog(View a) {
        AlertDialog.Builder myBuild = new AlertDialog.Builder(this);
        myBuild.setMessage("Quiere ir a la otra ventana?");
        myBuild.setTitle("Iniciar");
        myBuild.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Hola metodo",Toast.LENGTH_LONG).show();
                Intent ir = new Intent(MainActivity.this,Home.class);
                startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));
            }
        });
        myBuild.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        AlertDialog dialog = myBuild.create();
        dialog.show();
    }

    @Override

    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart"+className,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume"+className,Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy"+className,Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause"+className,Toast.LENGTH_LONG).show();

    }
}
