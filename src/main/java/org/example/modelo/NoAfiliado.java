package org.example.modelo;

import org.example.validaciones.NoAfiliadoValidacion;

public class NoAfiliado {

    private Integer numeroReserva;

    private Integer numeroPersonas;


    private NoAfiliadoValidacion validacion = new NoAfiliadoValidacion();

    public NoAfiliado() {
    }

    public NoAfiliado(Integer numeroReserva, Integer numeroPersonas) {
        this.numeroReserva = numeroReserva;
        this.numeroPersonas = numeroPersonas;
    }

    public Integer getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Integer numeroReserva) {
        try
        {
          this.validacion.NumeroReservas(numeroReserva);
          this.numeroReserva=numeroReserva;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        try
        {
          this.validacion.NumeroPersonas(numeroPersonas);
                 this.numeroPersonas=numeroPersonas;
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
