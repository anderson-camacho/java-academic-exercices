/*
 * Procesar los objetos y hacer consultas de los objetos
 */
package Primos;

import java.util.Random;
import java.util.Scanner;

/**
 * version 2.1 26.8.2020
 *
 * @author Anderson Camacho
 */
public class main {

    public static void main(String[] args) {
        //Creacion de el objeto tipo operaciones
        operaciones operacion1 = new operaciones();
        boolean continua = true;//bandera para finalizar el loop de el meno final
        int opcion = 0;//bandera del switch 
        Scanner teclado = new Scanner(System.in);
        do {//Inicio del loop primario para finalizar el programa.
            System.out.print("_____________________________________________________\n"
                    + "Hola, Bienvenido al programa para analisar numeros primos.\n"
                    + "Ahora necesitare que ingrese la opcion ejecutar el programa.\n\n"
                    + "Opcion 1: Operar aleatoriamente.\n"
                    + "Opcion 2: Preguntar por un numero.\n"
                    + "Opcion 3: Salir.\n\n"
                    + "ingresea el numero de la opcion:");
            opcion = teclado.nextInt();

            do {//inicio del loop para revisar si el valor ingresado no cumple con las opciones indicadas del programa.
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    switch (opcion) {//shitch de las opciones a cumplir
                        case 1:
                            operacion1.calcularPrimoAleatorios();//el metodo opera aleatoriamente
                            continua = true;
                            break;
                        case 2:
                            operacion1.calcularPrimo();//el metodo opera de forma unica consultando un numero
                            continua = true;
                            break;
                        case 3:
                            continua = false;
                            break;
                    }
                    break;
                } else {
                    System.out.print("#################################################\n"
                            + "Ingresaste la opcion incorrecta\n\n"
                            + "\n\nHola, Bienvenido al programa para analisar numeros primos.\n"
                            + "Ahora necesitare que ingrese la opcion ejecutar el programa.\n\n"
                            + "Opcion 1: Operar aleatoriamente.\n"
                            + "Opcion 2: Preguntar por un numero.\n"
                            + "Opcion 3: Salir.\n\n"
                            + "ingresea el numero de la opcion:");
                    opcion = teclado.nextInt();
                    
                }

            } while (opcion != 1 || opcion != 2 || opcion != 3);
               

        } while (continua != false);

    }
}
