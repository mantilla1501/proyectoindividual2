package org.example.utilidades;

public enum Mensajes {
    NOMBRE_SOLO_LETRAS("El nombre de usuario solo puede tener letras o espacios"),

    NOMBRES_MUY_CORTO("señor usuario revise la cantidad de caracteres es muy pequeña"),

    CORREO_INVALIDO("señor usuario el correo q ha ingresado no es valido :"),

    LA_ZONA_NO_ES_VALIDA("la zonaingresada no es valida :"),

    EL_FORMATO_NO_ES_VALIDO("El formato no es el correcto :"),

    LA_FECHA_DE_INICIO("La fecha final  debe ser mayoy a la de inicio :"),

   LA_MEMBRESIA_VALOR("Señor usuario verifique su membresia :"),

    EL_NUMERO_DE_CEDULA_("Señor usuario su numero de cedula solo puede tener numeros :"),

    LA_LONGITUD_("Señor usuario esta exediendo mas de los caracteres permitidos : "),

    EL_NUMERO_DE_PERSONAS("Señor usuario la cantidad de personas es incorrecta : "),

    SEÑOR_USUARIO("Señor usuario verifique su reserva : ");






    private  String mensajes;

    Mensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getMensajes() {
        return mensajes;
    }
}
