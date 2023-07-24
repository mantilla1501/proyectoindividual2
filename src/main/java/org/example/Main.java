package org.example;

import org.example.modelo.Local;
import org.example.modelo.Oferta;
import org.example.modelo.Reserva;
import org.example.modelo.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Usuario usuario = new Usuario();
        Oferta  oferta = new Oferta();
        Local local =new Local();
        Reserva reserva=new Reserva();
        Integer seleccione;

        System.out.println("menu");
        System.out.println("1.usuario");
        System.out.println("2. local");
        System.out.println("3.oferta");
        System.out.println("4.reserva");
        System.out.print("seleccione opcion : ");
        seleccione=teclado.nextInt();
        teclado.nextLine();

    switch (seleccione)
            {
                    case  1 :    System.out.println("Bienvenido....");
                    System.out.println("1: recogiendo datos del usuario :");
                    System.out.print("digita tus nombres y apellidos : ");
                    usuario.setNombres(teclado.nextLine());
                    System.out.print(" digita tu correo electronico: ");
                    usuario.setCorreo(teclado.nextLine());
                    System.out.println(".......................");
                    System.out.println(usuario);break;

                case 2:
                    System.out.print("ingrese el nit : ");
                    local.setNit(teclado.nextLine());
                    System.out.println("......................");

                    System.out.print("ingrese nombre de la empresa : ");
                    local.setNombre(teclado.nextLine());
                    System.out.println("..................");break;

                case 3 :
                    System.out.print("ingrese titulo : ");
                    oferta.setTitulo(teclado.nextLine());
                    System.out.println(".......................");

                    System.out.print("ingrese fecha de inicio : ");
                    oferta.setFechadeinicio(teclado.nextLine());
                    System.out.println("...................");

                    System.out.print("ingrese fecha final : ");
                    oferta.setFecchafin(teclado.nextLine());
                    System.out.println("...................");break;

                case 4 :
                    System.out.print("ingrese fecha: ");
                    reserva.setFechaReserva(teclado.nextLine());
                    System.out.println("....................");

                    System.out.print("ingrese el numero de personas : ");
                    reserva.setCantidadpersona(teclado.nextInt());
                    System.out.println("................");break;

            }














    }
}