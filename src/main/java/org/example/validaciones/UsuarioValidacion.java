package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion
{
    public UsuarioValidacion()
    {
    }
    protected Util util = new Util();

    // metodos ordinarios para validar datos
    public  Boolean validarNombre (String nombres) throws Exception
    {
        String expresionRegular="[a-zA-Z ]{2,254}";
        if(!util.buscarConcidencia(expresionRegular,nombres))
        {
            throw  new Exception("señor usuario su nombre solo puede tener letras");
        }else if(nombres.length()<10)
        {
            throw new Exception(Mensajes.NOMBRES_MUY_CORTO.getMensajes());
        }else
        {
            return  true;
        }
    }
    public  Boolean  validarCorreo(String correoElectronico) throws Exception
    {
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!util.buscarConcidencia(expresionRegular, correoElectronico))
        {
            throw new Exception(Mensajes.CORREO_INVALIDO.getMensajes());
        } else
        {
            return true;
        }
    }
     public  Boolean validarUbicacion(Integer ubicacion) throws Exception
     {
         if (ubicacion.equals(1)||ubicacion.equals(2)|| ubicacion.equals(3)||ubicacion.equals(4))
         {
             return  true;
         }
         else
         {
          return false;
         }
     }

}

