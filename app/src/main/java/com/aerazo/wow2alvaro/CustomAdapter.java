package com.aerazo.wow2alvaro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Estudiante> lst;

    public CustomAdapter(Context context, List<Estudiante> lst) {
        this.context = context;
        this.lst = lst;
    }


    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView ImageViewEstudiante;
        TextView TextViewNombre;
        TextView TextViewDes;

        Estudiante c= lst.get(i);

        if(view == null)
            view = LayoutInflater.from(context).inflate(R.layout.listview_estudiante,null);

        ImageViewEstudiante = view.findViewById(R.id.imageViewEstudiante);
        TextViewNombre = view.findViewById(R.id.textViewNombre);
        TextViewDes = view.findViewById(R.id.textViewDes);

        ImageViewEstudiante.setImageResource(c.imagen);
        TextViewNombre.setText(c.nombre);
        TextViewDes.setText(c.desc);

        return view;
    }
}
