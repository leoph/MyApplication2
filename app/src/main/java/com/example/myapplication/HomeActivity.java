package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ListView lista;
    List<String> androidVersionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("valorEmail");

        //1 conectar nuestro listView (lista) al componente visual
        // a traves del id.

        lista = findViewById(R.id.listView);

        //2 cargar la lista de elemantos.
        androidVersionList = new ArrayList<>();
        androidVersionList.add("Pie");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("Mashmallow");
        androidVersionList.add("Lollipop");
        androidVersionList.add("KitKat");
        androidVersionList.add("...");


        // 3 Adaptador.

        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                androidVersionList
        );

        // 4 conexión listView - adapter

        lista.setAdapter(adaptadorVersionesAndroid);


    }

}
