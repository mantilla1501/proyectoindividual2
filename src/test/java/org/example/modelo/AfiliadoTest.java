package org.example.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoTest
{
private Afiliado afiliado;

@BeforeEach

    public void setUp(){this.afiliado=new Afiliado();}

     @Test
    public void setMembresiaCorrecta ()
     {
       Integer membresiaCorrecta=50000;
       this.afiliado.setValorMembresia(membresiaCorrecta);
         Assertions.assertEquals(membresiaCorrecta,afiliado.getValorMembresia());

     }

     @Test
    public void setMembresiaIncorrecta()
     {
        Integer membresiaIncorrecta=700000;
        this.afiliado.setValorMembresia(membresiaIncorrecta);
        Assertions.assertNotEquals(membresiaIncorrecta,afiliado.getValorMembresia());

     }



}