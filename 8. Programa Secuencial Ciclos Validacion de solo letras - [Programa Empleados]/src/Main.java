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
		String nombreEmpleado = " ";
		int horasTrabajadas;
		int horasExtras;
		float sueldoBruto;
		float sueldoTotalNeto;

		int area = 0;
		float bonificacion = 0.0F;
		int bandera = 1;

		while (bandera == 1) {

			// Operaciones a realizar
			System.out.println("Programa de calculo de pago empleado\n");
			System.out.println("Se deben ingresar los valores solicitados por el programa\n\n");

			do {
				System.out.print("Ingrese el nombre del empleado: ");
				nombreEmpleado = teclado.nextLine();
			} while (!esSoloLetras(nombreEmpleado));

			do {
				System.out.print("\nIngrese las horas realizados para este mes: ");
				horasTrabajadas = teclado.nextInt();
			} while (horasTrabajadas <= 0);

			do {
				System.out.print("\nIngrese las horas Extras realizadas este mes: ");
				horasExtras = teclado.nextInt();
			} while (horasExtras <= 0);

			// operacion inical de multiplicacion y suma para gestionar los valores brutos
			// de sueldo se usa un "(float)" con el fin de cambiar el tipo de resultado que
			// esta en entero para pasarlo a flotante y poder almacear el resultado en una
			// variable correcta.

			// El Empleado tambien tendra una bonificacion depeniendo del area de su cargo:
			// Servicio Varios, Operaciones y VEntas. cada uno de las areas
			// tendra una bonificacion de 40, 20, 10 en porcentaje respectivamente en ese
			// orden, ademas de que cualquier otra area no recibe bonificacion.
			// es importante decir tambien que solo se recibe bonificacion si el salario
			// bruto es menor a 1200000 para servicios varios, 2000000 para operaciones y
			// Ventas por debajo de 4500000

			do {
				System.out.print("\nEl area a la que pertenece cada empleado es muy importante, ya que "
						+ "\npermite que tenga una bonifiacion general sobre el valor del sueldo."
						+ "\nCodigos de Area: " + "\n1. Servicios Varios." + "\n2. Operaciones." + "\n3. Ventas."
						+ "\n4. otras areas." + "\nIngrese el numero del area a la que pertence: ");
				area = teclado.nextInt();
			} while (area != 1 && area != 2 && area != 3 && area != 4);

			sueldoBruto = (float) ((horasTrabajadas * VALOR_HORA_COMUN) + (horasExtras * VALOR_HORA_EXTRA));
			switch (area) {
			case 1:
				if (sueldoBruto < 1200000) {
					bonificacion = sueldoBruto * 0.4f;
					sueldoBruto = (float) sueldoBruto + bonificacion;
				}
				break;
			case 2:
				if (sueldoBruto < 2000000) {
					bonificacion = sueldoBruto * 0.2f;
					sueldoBruto = (float) sueldoBruto + bonificacion;
				}
				break;
			case 3:
				if (sueldoBruto < 4500000) {
					bonificacion = sueldoBruto * 0.1f;
					sueldoBruto = (float) sueldoBruto + bonificacion;
				}
				break;
			default:
				break;
			}

			// se debe verificar que si el salario de horas comunes es inferior a 1200000,
			// no
			// se le haran ninguna deduccion.

			if ((horasTrabajadas * VALOR_HORA_COMUN) < 1200000) {
				// Operacion final para genera el valor del sueldo que ganara el empleado
				sueldoTotalNeto = sueldoBruto;
			} else {
				// Operacion final para genera el valor del sueldo que ganara el empleado
				sueldoTotalNeto = sueldoBruto - (sueldoBruto * PROCENTAJE_RETENCIONES);
			}

			// Operacion final para genera el valor del sueldo que ganara el empleado

			System.out.println("\n\nEl sueldo que " + nombreEmpleado + " ha ganado este mes es de $" + sueldoTotalNeto
					+ " Esto con deducciones que fueron $" + (sueldoBruto * PROCENTAJE_RETENCIONES)
					+ " mas la bonificacion que fue de $" + bonificacion);

			do {
				System.out.print("\n\n¿Quiere hacer otro calculo?\n" + "Escriba 1 para seguir o 2 para parar: ");
				bandera = teclado.nextInt();
			} while (bandera != 1 && bandera != 2);

			nombreEmpleado = "";
			horasTrabajadas = 0;
			horasExtras = 0;
			sueldoBruto = 0.0F;
			sueldoTotalNeto = 0.0F;

			area = 0;
			bonificacion = 0.0F;

			teclado.nextLine();
			System.out.print("\033[H\033[2J");
			System.out.flush();

		}

	}// fin del metodo main

	static boolean esSoloLetras(String cadena) {
		// Recorremos cada caracter de la cadena y comprobamos si son letras.
		// Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
		// Si está fuera del rango 65 - 90, es que NO son letras.
		// Para ser más exactos al tratarse del idioma español, tambien comprobamos
		// el valor 165 equivalente a la y elk espacio 32

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int) caracter;
			if (valorASCII != 32 && valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				return false; // Se ha encontrado un caracter que no es letra
		}

		// Terminado el bucle sin que se haya retornado false, es que todos los
		// caracteres son letras
		return true;
	}

}// fin de la clase
