package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoAfiliadoValidacionTest {

    public NoAfiliadoValidacion noAfiliadoValidacion;


    @BeforeEach

    public  void setNoAfiliadoValidacion()
    {
        this.noAfiliadoValidacion=new NoAfiliadoValidacion();
    }

    @Test

    public  void numeroReservaNoAfiliadoValido()
    {
        Integer numeroReservaValido = 1;
        Assertions.assertDoesNotThrow(()-> noAfiliadoValidacion.NumeroReservas(numeroReservaValido));
    }

    @Test

    public void numeroReservaNoAfiliadoInvalido()
    {
        Integer numeroReservaInvalido = -1;
        Exception exception=Assertions.assertThrows(Exception.class,()->this.noAfiliadoValidacion.NumeroReservas(numeroReservaInvalido));
        Assertions.assertEquals(Mensajes.SEÑOR_USUARIO.getMensajes(),exception.getMessage());
    }

    @Test

    public void validarPersonaCorrecto()
    {
        Integer validarPersonaCorrecto= 4;
        Assertions.assertDoesNotThrow(()->noAfiliadoValidacion.NumeroPersonas(validarPersonaCorrecto));

    }

    @Test

    public void ValidarPersonaIncorrecto()
    {
        Integer validarPersonaIncorrecta= 7;
        Exception exception=Assertions.assertThrows(Exception.class,()->this.noAfiliadoValidacion.NumeroPersonas(validarPersonaIncorrecta));
        Assertions.assertEquals(Mensajes.EL_NUMERO_DE_PERSONAS.getMensajes(),exception.getMessage());
    }


}