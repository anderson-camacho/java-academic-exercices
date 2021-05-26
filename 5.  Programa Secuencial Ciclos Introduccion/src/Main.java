import java.util.Random;
import java.util.Scanner;

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
		Scanner teclado = new Scanner(System.in);
		Random numeroAleatorio = new Random();

		// se usa el while donde se pregunta primero y se hace despues
		System.out.println("While");
		int numero = 0;
		while (numero != 10) {
			numero = numeroAleatorio.nextInt(100);
			System.out.println("El numero es " + numero);

		}
		System.out.println();

		numero = 0;
		System.out.println("\nWhile");

		// Do while hace primero y luego hpregunta
		do {
			numero = numeroAleatorio.nextInt(100);
			System.out.println("El numero es " + numero);
		} while (numero < 20);

		// para serntencias mas especificas de procesos ciclicos
		numero = 10;
		System.out.println("\n\nWhile");
		for (int i = 0; i < numero; i++) {
			System.out.println("el valor de i es " + i);
		}
	}

}
