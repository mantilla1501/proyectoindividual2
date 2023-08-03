package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class AfiliadoValidacion {

    public AfiliadoValidacion() {
    }


    protected Util util = new Util();


    public Boolean validarMembresia (Integer membresia) throws Exception
    {
        if (membresia > 20000 || membresia < 150000)
        {
            throw new Exception(Mensajes.LA_MEMBRESIA_VALOR.getMensajes());
        }
        else
        {
            return true;
        }
    }

    public Boolean validarCedula(String cedula) throws Exception
    {
        String expresionRegular = "^[0-9]{10}$";

        if (!util.buscarConcidencia(expresionRegular,cedula))
        {
            throw new Exception(Mensajes.EL_NUMERO_DE_CEDULA_.getMensajes());
        }
        else
        {
            return true;
        }
    }


}
