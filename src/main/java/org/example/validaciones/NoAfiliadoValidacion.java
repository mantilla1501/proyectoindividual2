package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class NoAfiliadoValidacion {


    public NoAfiliadoValidacion() {
    }

    protected Util util = new Util();

    public Boolean NumeroReservas (Integer numeroreservas) throws Exception
    {
        if (numeroreservas < 0)
        {
            throw new Exception(Mensajes.SEÑOR_USUARIO.getMensajes());
        }

        else
        {
            return true;
        }

    }

    public Boolean NumeroPersonas (Integer numeropersonas)  throws Exception
    {
        if (numeropersonas >= 4)
        {
            throw new Exception(Mensajes.EL_NUMERO_DE_PERSONAS.getMensajes());
        }

        else
        {
            return true;
        }
    }
}
