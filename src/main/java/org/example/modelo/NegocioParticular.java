package org.example.modelo;

public class NegocioParticular   extends  Local{


    public  Double mensualidad;

    public Integer idRepresentante;

    public  String NombreRepresentante;

    public NegocioParticular() {
    }

    public NegocioParticular(Double mensualidad, Integer idRepresentante, String nombreRepresentante) {
        this.mensualidad = mensualidad;
        this.idRepresentante = idRepresentante;
        NombreRepresentante = nombreRepresentante;
    }

    public NegocioParticular(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, Double mensualidad, Integer idRepresentante, String nombreRepresentante) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.mensualidad = mensualidad;
        this.idRepresentante = idRepresentante;
        NombreRepresentante = nombreRepresentante;
    }

    public Double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Integer getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(Integer idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getNombreRepresentante() {
        return NombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        NombreRepresentante = nombreRepresentante;
    }
}
