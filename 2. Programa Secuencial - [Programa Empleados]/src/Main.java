import java.util.Scanner;

/**
 * <h1>Programacion Secuencial<h1>
 * 
 * Este ejercicio mostrara como se realiza un operacion simple en la
 * programacion.
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
		// Lineas de codigo que permitiran identificar los procesos.

		// Creacion de variable que recibe la informacion del teclado.
		Scanner teclado = new Scanner(System.in);

		// Creacion de las variables y constantes
		// funcionales que se suasran en el ejercicio.

		// Declaracion de Constantes
		final float PORCENTAJE_RETENCIONES = 0.16F;
		final int VALOR_HORA_EXTRA = 10000;
		final int VALOR_HORA_COMUN = 6000;

		// Declaracion de variables
		String nombreEmpleado;
		int horasTrabajadas;
		int horasExtras;
		float sueldoBruto;
		float sueldoTotalNeto;

		// Operaciones a realizar
		System.out.println("Programa de calculo de pago empleado\n");
		System.out.println("Se deben ingresar los valores solicitados por el programa\n\n");
		System.out.print("Ingrese el nombre del empleado: ");
		nombreEmpleado = teclado.next();
		System.out.print("\nIngrese las horas realizados para este mes: ");
		horasTrabajadas = teclado.nextInt();
		System.out.print("\nIngrese las horas Extras realizadas este mes: ");
		horasExtras = teclado.nextInt();

		// operacion inicial de multiplicacion y suma para gestionar los valores brutos
		// de sueldo se usa un "(float)" con el fin de cambiar el tipo de resultado que
		// esta en entero para pasarlo a flotante y poder almacear el resultado en una
		// variable correcta.
		sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));

		// Operacion final para genera el valor del sueldo que ganara el empleado
		sueldoTotalNeto = sueldoBruto - (sueldoBruto * PORCENTAJE_RETENCIONES);

		System.out.println("\n\nEl sueldo que " + nombreEmpleado + " ha ganado este mes $" + sueldoTotalNeto);

	}// fin del metodo main

}// fin de la clase
