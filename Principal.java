package com.liceolapaz.des.acc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Escribir menú
        escribirMenu();
        //Pedir opción
        pedirOpcion();
        //leer opción y guardarla
        int opcion = leerOpcion();
        //
        switch (opcion){
            case 0:
                System.out.println("Usted ha decidido salir, Hasta la próxima.");
                System.exit(0);
                break;
            case 1:
                //Pedir el valor de la base
                pedirBase();
                //Leer y guadar el valor de la base
                double base = leerBase();
                //pedir el valor del exponente
                pedirExponente();
                //Leer el valor y guardarlo
                int exponente= leerExponente();
                //Calcular la potencia
                double resultado = Math.pow(base, exponente);
                //Dar el resultado de la potencia
                System.out.println("El resultado de la potencia es: " + resultado);
                break;
            case 2:
                //Pedir el operando al usuario
                pedirOperando();
                //Leer el operando y guardarlo
                int operando = leerOperando();
                //Calcular la raíz cuadrada del operando
                double resultado1 = Math.sqrt(operando);
                //Dar el resultado de la raíz cuadrada
                System.out.println("El resultado de la raíz cuadrada es: " + resultado1);
                break;
            default:
                System.out.println("Error, no existe esta opción");
        }
    }

    private static int leerOperando() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOperando() {
        System.out.print("Introduzca el valor del operando: ");
    }

    private static int leerExponente() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirExponente() {
        System.out.print("Introduzca el valor del exponente: ");
    }

    private static double leerBase() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirBase() {
        System.out.print("Introduzca el valor de la base: ");
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("POTENCIAS Y RAICES CUADRADAS\n"+
                "1.Potencia\n"+
                "2.Raíz Cuadrada\n"+
                "0.Salir");
    }
}
