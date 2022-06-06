package com.tel335.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView nombre;
    private TextView profesion;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate()",Toast.LENGTH_LONG).show();  //muestra un mensaje al inicio

        nombre = findViewById(R.id.nombre);
        profesion = findViewById(R.id.profesion);
        boton = findViewById(R.id.button);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart()",Toast.LENGTH_SHORT).show();

        nombre.setText(R.string.nombre_usuario);
        profesion.setText(R.string.profesion_usuario);
        boton.setOnClickListener(view -> {
            Toast.makeText(this, "Click",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SecondActivity.class);
            Bundle parameters = new Bundle();
            parameters.putInt("number",123);
            parameters.putChar("char", 'c');
            parameters.putString("str", "hola");
            parameters.putParcelable("persona", new Persona("Valentina"));
            intent.putExtras(parameters);

            startActivity(intent);
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy()",Toast.LENGTH_SHORT).show();
    }
}