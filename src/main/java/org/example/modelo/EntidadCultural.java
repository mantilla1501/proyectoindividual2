package org.example.modelo;

public class EntidadCultural  extends Local {


    public String descripcion;

    public Double anualidad;



    public EntidadCultural() {
    }

    public EntidadCultural(String descripcion, Double anualidad) {
        this.descripcion = descripcion;
        this.anualidad = anualidad;
    }

    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String descripcion1, Double anualidad) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.descripcion = descripcion1;
        this.anualidad = anualidad;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getAnualidad() {
        return anualidad;
    }

    public void setAnualidad(Double anualidad) {
        this.anualidad = anualidad;
    }
}
