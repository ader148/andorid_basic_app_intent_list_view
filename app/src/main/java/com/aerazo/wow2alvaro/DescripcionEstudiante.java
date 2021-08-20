package com.aerazo.wow2alvaro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionEstudiante extends AppCompatActivity {

    ImageView ImageViewEstudiante;
    TextView TextViewNombre;
    TextView TextViewDes;
    TextView TextViewEmail;
    TextView TextViewTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_estudiante);

        ImageViewEstudiante = findViewById(R.id.imageViewUser);
        TextViewNombre = findViewById(R.id.textViewNombreEst);
        TextViewDes = findViewById(R.id.textViewdescEst);
        TextViewEmail = findViewById(R.id.textViewEmail);
        TextViewTel =  findViewById(R.id.textViewTelefono);

        //recibimos las variables del intent y las setamos a los campos
        String nombre = getIntent().getStringExtra("NombreEst");
        String descripcion = getIntent().getStringExtra("DescEst");
        String email = getIntent().getStringExtra("EmailEst");
        String telefono = getIntent().getStringExtra("TelEst");
        //String imgid = getIntent().getStringExtra("ImgEst");

        int imgid= getIntent().getIntExtra("ImgEst",0);





        TextViewNombre.setText(nombre);
        TextViewDes.setText(descripcion);
        TextViewEmail.setText(email);
        TextViewTel.setText(telefono);
        ImageViewEstudiante.setImageResource(imgid);

    }
}