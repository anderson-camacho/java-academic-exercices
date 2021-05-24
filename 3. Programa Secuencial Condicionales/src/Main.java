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
		// Lineas de codigo que permitiran identificar los procesos.

		// Creacion de variable que recibe la informacion del teclado.
		Scanner teclado = new Scanner(System.in);

		// Creacion de las variables y constantes
		// funcionales que se suasran en el ejercicio.

		// Declaracion de Constantes
		final float PROCENTAJE_RETENCIONES = 0.16F;
		final int VALOR_HORA_EXTRA = 10000;
		final int VALOR_HORA_COMUN = 6000;

		// Declaracion de variables
		String nombreEmpleado;
		int horasTrabajadas;
		int horasExtras;
		float sueldoBruto;
		float sueldoTotalNeto;

		int area;

		// Operaciones a realizar
		System.out.println("Programa de calculo de pago empleado\n");
		System.out.println("Se deben ingresar los valores solicitados por el programa\n\n");
		System.out.print("Ingrese el nombre del empleado: ");
		nombreEmpleado = teclado.next();
		System.out.print("\nIngrese las horas realizados para este mes: ");
		horasTrabajadas = teclado.nextInt();
		System.out.print("\nIngrese las horas Extras realizadas este mes: ");
		horasExtras = teclado.nextInt();

		// operacion inical de multiplicacion y suma para gestionar los valores brutos
		// de sueldo se usa un "(float)" con el fin de cambiar el tipo de resultado que
		// esta en entero para pasarlo a flotante y poder almacear el resultado en una
		// variable correcta.
		

		// El Empleado tambien tendra una bonificaicon depeniendo del area de su cargo:
		// Servicio Varios, Operaciones, Ventas y Contabilidad. cada uno de las areas
		// tendra una bonificacion de 40, 20, 10 en porcentaje respectivamaente en ese
		// orden, ademas de que cualqueir otra area no recibe bonificacion.
		// es importante decir tambien que solo se recibe bonoificacion si el salario bruto es 
		// menor a 1200000 para servicios varios, 2000000 para operaciones y contabilidad por debajo de 4500000

		System.out.print("\nEl area a la que pertenece cada empleado es muy importante, ya que "
				+ "\npermite que tenga una bonifiacion general sobre el valor del sueldo.");
		System.out.print("\nCodigos de Area: " + "\n1. Servicios Varios." + "\n2. Operaciones." + "\n3. Ventas."
				+ "\n4. otras areas.");
		System.out.print("\nIngrese el area a la que pertence: ");
		area = teclado.nextInt();
		
		

		switch (area) {
		case 1:
			sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));
			if (sueldoBruto < 1200000) {
				sueldoBruto =(float) sueldoBruto + (sueldoBruto * 0.4f);
			}
			break;
		case 2:
			sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));
			if (sueldoBruto < 2000000) {
				sueldoBruto =(float) sueldoBruto + (sueldoBruto * 0.2f);
			}
			break;
		case 3:
			sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));
			if (sueldoBruto < 4500000) {
				sueldoBruto =(float) sueldoBruto + (sueldoBruto * 0.1f);
			}
			break;
		default:
			sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));
			break;
		}

		// se debe verificar que si el salario de horas comunes es inferior a 900000, no
		// se le haran ninguna deduccion.

		if ((horasTrabajadas * VALOR_HORA_COMUN) < 900000) {
			// Operacion final para genera el valor del sueldo que ganara el empleado
			sueldoTotalNeto = sueldoBruto;
		} else {
			// Operacion final para genera el valor del sueldo que ganara el empleado
			sueldoTotalNeto = sueldoBruto + (sueldoBruto * PROCENTAJE_RETENCIONES);
		}

		// Operacion fianl para genera el valor del sueldo que ganara el empleado

		System.out.println("\n\nEl sueldo que " + nombreEmpleado + " ha ganado este mes es de $" + sueldoTotalNeto + " Esto con deducciones que fueron $" + sueldoBruto * PROCENTAJE_RETENCIONES);

	}// fin del metodo main

}// fin de la clase
