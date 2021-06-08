import java.util.Iterator;
import java.util.Random;

/**
 * <h1>Programacion Secuencial
 * <h1>
 * 
 * Este ejercicio mostrara como se realiza un operacion simple en la
 * programacion con condicionales IF and SWITCH
 * 
 * El ejercicio busca sacara la cuenta de el pago que tendria que pagarse al
 * empleado, esto de acuerdo a el valor de sus horas extras, horas comunes y
 * porcentajes de rentenciones.
 * 
 * @author Anderson Camacho {@link https://github.com/anderson-camacho}
 * 
 * @version 1.0
 * @since 1.0
 * @see https://github.com/anderson-camacho?tab=repositories
 * @implSpec jdk 11.0,2
 * 
 */
//una clase que debe contener todo lo que este relacionado con el programa
public class Main {
	// un metodo main que tendra que contener el inicio del sistema.
	public static void main(String[] args) {

		// Realizaremos estrucutras de datos estasticas sque tendran una concecuencia en
		// su tamaño, llamaremos vectores y matrices.

		System.out.println("Estructuras de Datos");

		Random numeroAleatorio = new Random();

		int vector[] = new int[10];

		System.out.println("\n\nVector");

		for (int i = 0; i < vector.length; i++) {
			vector[i] = numeroAleatorio.nextInt();
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.println("posicion " + (i + 1) + " tiene un numero " + vector[i]);
		}

		System.out.println("Matriz");
		int matriz[][] = new int[10][10];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroAleatorio.nextInt();
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("El valor en la posicion (" + i + " , " + j + ") es de: " + matriz[i][j]);
			}

		}

	}

}
