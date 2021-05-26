/*
 * Clase con el fin de tener las herrameitnas de consulta necesarias para 
 * Consultar si los numeros son primos.
 */
package Primos;

import java.util.Random;
import java.util.Scanner;

/**
 * version 2.1 26.8.2020
 *
 * @author Anderson Camacho
 */
public class operaciones {

    private Scanner teclado;
    private Random aleatorio;
    private int numero;

    public operaciones() {
        this.teclado = new Scanner(System.in);
        this.aleatorio = new Random();
        this.numero = 0;
    }

    public void calcularPrimo() {///consulta un numero primo indicado
        do {
            System.out.print("Ingrese el valor a consultar mayor a 1: ");
            numero = teclado.nextInt();
        } while (numero < 1);
        //se crea el objeto de tipo clase primo y se usa el constructor 
        //que permite enviar el valor que ingrese el usuario
        primo numeroConsultar = new primo(numero);
        System.out.println("el numero " + numeroConsultar.getMensaje());
    }

    public void calcularPrimoAleatorios() {//consulta una cantidad de numeros aleatorios indicados por el usuario

        System.out.print("Ingrese el cuantos numeros aleatorios aparecerian: ");
        primo Numeros[] = new primo[this.teclado.nextInt()];

        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = new primo(this.aleatorio.nextInt(500));
            System.out.println("El numero aleatorio almacenado enla posicion "
                    + (i + 1) + " del vector Numeros que es " + Numeros[i].getNumero()
                    + " " + Numeros[i].getMensaje());

        }

    }

}
