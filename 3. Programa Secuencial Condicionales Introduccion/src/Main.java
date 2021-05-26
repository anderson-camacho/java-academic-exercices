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

		// veremos codigo de funcionalidad que permitira ver los condicionales

		// Variables que permite ingresar los datos
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa un numero: ");
		int numero = teclado.nextInt();

		// If Else
		if (numero < 10) {
			System.out.println("El valor ingresado es menor a 10");
		} else {
			System.out.println("El valor ingresado de es igual o mayor a 10");
		}

		System.out.println("ingresa un numero: ");
		numero = teclado.nextInt();

		// Switch
		switch (numero) {
		case 1:
			System.out.println("Ingresaste el numero 1");
			break;
		case 2:
			System.out.println("Ingresaste el numero 2");
			break;
		case 3:
			System.out.println("Ingresaste el numero 3");
			break;
		case 4:
			System.out.println("Ingresaste el numero 4");
			break;

		default:
			System.out.println("Ingresaste diferente a 1, 2, 3, y 4");
			break;
		}

	}

}
