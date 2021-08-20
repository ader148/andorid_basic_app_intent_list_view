package com.aerazo.wow2alvaro;

public class Estudiante {
    public int id;
    public int imagen;
    public String nombre;
    public String desc;
    public String email;
    public String telefono;

    public Estudiante(int id, int imagen, String nombre, String desc, String email, String telefono) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.desc = desc;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
