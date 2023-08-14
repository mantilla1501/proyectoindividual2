package org.example.validaciones;

import org.example.modelo.Afiliado;
import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach

    public void setUp(){this.afiliadoValidacion=new AfiliadoValidacion();}

    @Test
    void validarMembresiaCorrecta() {
        Integer membresiaCorrecta = 50000;
        Assertions.assertDoesNotThrow(() -> this.afiliadoValidacion.validarMembresia(membresiaCorrecta));
    }

    @Test
    void validarMembresiaIncorrecto() {
        Integer membresiaIncorrecta = 10000;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.afiliadoValidacion.validarMembresia(membresiaIncorrecta));
        Assertions.assertEquals(Mensajes.LA_MEMBRESIA_VALOR.getMensajes(),exception.getMessage());
    }

    @Test
    void validarCedulaCorrecto() {
        String cedulaCorrecta = "1234567899";
        Assertions.assertDoesNotThrow(() -> this.afiliadoValidacion.validarCedula(cedulaCorrecta));
    }

    @Test
    void validarCedulaIncorrecto() {
        String cedulaIncorrecta = "678";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.afiliadoValidacion.validarCedula(cedulaIncorrecta));
        Assertions.assertEquals(Mensajes.EL_NUMERO_DE_CEDULA_.getMensajes(),exception.getMessage());
    }
}