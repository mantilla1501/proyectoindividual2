package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion
{
    public LocalValidacion() {
    }

    protected Util util = new Util();

    public  Boolean validarNombres  (String nombres) throws Exception
    {


      if (nombres.length()>30)

      {
         throw new Exception(Mensajes.LA_LONGITUD_.getMensajes());
      }

       else
        {
            return true;
        }
    }



    public  Boolean validarNit (String nit)  throws Exception
    {
       if (nit.length()!=10)

       {
           throw  new Exception ("El Nit no es correcto : ");
       }

       else
       {
           return  true;
       }
    }


}









