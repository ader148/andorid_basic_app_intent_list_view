package com.aerazo.wow2alvaro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView ListViewEstudiante;
    List<Estudiante> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //poner el icono en el actionBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_index);

        ListViewEstudiante = findViewById(R.id.ListViewEstudiante);

        //creamos un custom adapter
        CustomAdapter adapter = new CustomAdapter(this,GetData());
        ListViewEstudiante.setAdapter(adapter);

        ListViewEstudiante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Estudiante c= lst.get(i);
                //Toast.makeText(getBaseContext(), c.nombre,Toast.LENGTH_SHORT).show();

                //realizamos el intent a la otra pantalla
                //le pasamos los datos del estudiante por el intent
                Intent intent = new Intent(getBaseContext(),DescripcionEstudiante.class);
                intent.putExtra("NombreEst",c.nombre);
                intent.putExtra("DescEst",c.desc);
                intent.putExtra("EmailEst",c.email);
                intent.putExtra("TelEst",c.telefono);
                intent.putExtra("ImgEst",c.imagen);
                startActivity(intent);

            }
        });

    }

    private List<Estudiante> GetData() {
        //generamos los datos de el listado de estudiante
        lst = new ArrayList<>();
        lst.add(new Estudiante(1,R.drawable.user_h,"Alvaro","Estudiante","ader148@hotmail.com","3174554377" ));
        lst.add(new Estudiante(1,R.drawable.user_h,"Daniel","Topografo","ader148top@hotmail.com","3127653054" ));
        lst.add(new Estudiante(1,R.drawable.user_m,"Ana","Estudiante","ana@gmail.com","3178640847" ));
        lst.add(new Estudiante(1,R.drawable.user_m,"Evelyn","Estudiante","evelu96@hotmail.com","3168642345" ));
        return lst;

    }
}