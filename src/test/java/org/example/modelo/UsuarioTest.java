package org.example.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest
{
 private  Usuario usuario;



   @Test
    public  void setUsuarioCorrectoNombres()
   {
     String nombreValido="pepita ruiz "; //preparer
     this.usuario.setNombres(nombreValido); // ejecutar
       Assertions.assertEquals(nombreValido,usuario.getNombres());
   }

   @Test
    public  void setUsuarioIncorrectoNombre()
   {
     String nombreIncorrecto="hshhmelihh mantilla";
     this.usuario.setNombres(nombreIncorrecto);
     Assertions.assertNotEquals(nombreIncorrecto,usuario.getNombres());



   }
}