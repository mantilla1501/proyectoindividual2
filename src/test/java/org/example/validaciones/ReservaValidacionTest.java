package org.example.validaciones;

import org.example.modelo.Reserva;
import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion reservaValidacion;

    @BeforeEach

    public void setUp()
    {
        this.reservaValidacion=new ReservaValidacion();
    }

    @Test
    public void cantidadPersonaCorrecta()
    {
        Integer cantidadValida= 4 ;
        Assertions.assertDoesNotThrow(()->reservaValidacion.validarCantidadPersona(cantidadValida));
    }

    @Test
    public void cantidadPersonaInvalida()
    {
        Integer cantidaPersonaInvalida = 8 ;
        Exception exception=Assertions.assertThrows(Exception.class, ()-> this.reservaValidacion.validarCantidadPersona(cantidaPersonaInvalida));
        Assertions.assertEquals(Mensajes.EL_NUMERO_DE_PERSONAS.getMensajes(),exception.getMessage());
    }

    @Test
    public  void formatoFechaValida ()
    {
     String formatoFechaValida ="23/09/2023";
     Assertions.assertDoesNotThrow(()->reservaValidacion.validarFormato(formatoFechaValida));
    }

    @Test

    public  void formatoFechaInvalida()
    {
        String formatoFechaInvalida="31/2023/07";
        Exception exception = Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarFormato(formatoFechaInvalida));
        Assertions.assertEquals(Mensajes.EL_FORMATO_NO_ES_VALIDO.getMensajes(),exception.getMessage());
    }




}