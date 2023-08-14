package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfertavalidacionesTest {

    private Ofertavalidaciones ofertavalidaciones;

    @BeforeEach
    public void setOfertavalidaciones ()
    {
        this.ofertavalidaciones = new Ofertavalidaciones();
    }


   @Test
    public  void validarTituloCorrecto()
   {
       String validarTituloCorrecto ="erytodterusdfgjklasb";
       Assertions.assertDoesNotThrow(()->this.ofertavalidaciones.validarTitulo(validarTituloCorrecto));
   }






}