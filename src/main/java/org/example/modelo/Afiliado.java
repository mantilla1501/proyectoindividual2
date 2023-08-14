package org.example.modelo;

import org.example.utilidades.MetodosPago;
import org.example.validaciones.AfiliadoValidacion;

public class Afiliado {

    private Integer ValorMembresia;

    private MetodosPago metodosPago;

    private String documentoReferido;

    private String cedula;

    private final  Double IVA=0.19;



  private AfiliadoValidacion validacion =new AfiliadoValidacion();

    public Afiliado() {
    }

    public Afiliado(Integer valorMembresia, MetodosPago metodosPago, String documentoReferido, AfiliadoValidacion validacion) {
        ValorMembresia = valorMembresia;
        this.metodosPago = metodosPago;
        this.documentoReferido = documentoReferido;
        this.validacion = validacion;
    }

    public Integer getValorMembresia() {
        return ValorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        try
        {
        this.validacion.validarMembresia(valorMembresia);
        this.ValorMembresia=valorMembresia;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        try
        {
            this.validacion.validarCedula(cedula);
            this.cedula=cedula;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public MetodosPago getMetodosPago() {
        return metodosPago;
    }

    public void setMetodosPago(MetodosPago metodosPago) {
        this.metodosPago = metodosPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }

    public Double getIVA() {
        return IVA;
    }

    public AfiliadoValidacion getValidacion() {
        return validacion;
    }

    public void setValidacion(AfiliadoValidacion validacion) {
        this.validacion = validacion;
    }




}
