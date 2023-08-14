package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {

    public LocalValidacion localValidacion;

    @BeforeEach
    public  void setLocalValidacion ()
    {
        this.localValidacion=new LocalValidacion();
    }

    @Test

    public void nitValido ()
    {
        String nitValido="compañiasa";
        Assertions.assertDoesNotThrow(()->localValidacion.validarNit(nitValido));
    }


    @Test

    public void nitInvalido()
    {
        String nitInvalido ="yafue";
        Exception exception =Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNit(nitInvalido));
        Assertions.assertEquals(Mensajes.LA_LONGITUD_.getMensajes(),exception.getMessage());
    }

    @Test
    public void NombreCorrecto()
    {
        String nombreCorrecto ="fsduwidiklkplkkjjuhuuytredsawuo";
        Assertions.assertDoesNotThrow(()->localValidacion.validarNombres(nombreCorrecto));

    }

    @Test
    public void NombreIncorrecto()
    {
        String nombreIncorrecto="dtrghhjoijoiooi";
        Exception exception=Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNombres(nombreIncorrecto));
        Assertions.assertEquals(Mensajes.NOMBRES_MUY_CORTO.getMensajes(),exception.getMessage());
    }

}