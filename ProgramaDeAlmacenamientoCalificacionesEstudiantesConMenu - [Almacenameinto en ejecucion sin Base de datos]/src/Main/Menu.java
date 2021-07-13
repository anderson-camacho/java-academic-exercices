package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.jdi.Value;

import java.lang.ProcessBuilder;

public class Menu implements Validations {

	Scanner teclado;
	private Student[] studentList;

	public Menu() {
		this.teclado = new Scanner(System.in);
		mensajeInicio();
		mensajeAdvertencia();
		autoFill();
		menu();
		mensajeFinal();
	}

	// Menus
	public void menu() {
		String opcion;
		var opcionInt = 0;
		var bandera = false;

		System.out.println("MENU");
		System.out.println("Para usar este programa, deberas ingresar solo las \n"
				+ "opciones que se indican en el menu que se muestra.");
		System.out.println(
				"Opciones:\n 1) Mostrar datos de estudiantes.\n 2) Ver Director de grupo.\n 3) Otros pasos.\n 0) Finalizacion del programa.\n\n");
		do {

			do {

				if (!bandera) {
					System.out.print("Selecciona una opcion: ");
					opcion = this.teclado.nextLine();
					bandera = true;
				} else {
					System.out.println("\nIngresaste una opocion incorrecta.");
					System.out.print("Selecciona una opcion correcta: ");
					opcion = this.teclado.nextLine();
				}
			} while (!esSoloNumeros(opcion));
			opcionInt = Integer.parseInt(opcion);

		} while (opcionInt < 0 || opcionInt > 3);

	}

	// class methods

	private void autoFill() {
		String ns = "";
		int nsInt = 0;
		mensajePreparacion();
		System.out.print("Cuantos estudiantes componene el grupo (ingrese el valor en caracteres numericos): ");
		do {
			ns = teclado.nextLine();
		} while (!esSoloNumeros(ns));
		nsInt = Integer.parseInt(ns);
		this.studentList = new Student[nsInt];
		for (int i = 0; i < nsInt; i++) {
			System.out.println("Estudiante numero: " + i + 1);
			studentList[i] = new Student();
		}

	}

	// Interface Validations
	@Override
	public boolean esSoloLetras(String cadena) {
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

	@Override
	public boolean esSoloNumeros(String numero) {

		// Recorremos cada caracter de la cadena y comprobamos si son letras.
		// Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
		// Si está fuera del rango 65 - 90, es que NO son letras.
		// Para ser más exactos al tratarse del idioma español, tambien comprobamos
		// el valor 165 equivalente a la y elk espacio 32

		for (int i = 0; i < numero.length(); i++) {
			char caracter = numero.toUpperCase().charAt(i);
			int valorASCII = (int) caracter;
			if (valorASCII < 48 || valorASCII > 57)
				return false; // Se ha encontrado un caracter que no es letra
		}

		// Terminado el bucle sin que se haya retornado false, es que todos los
		// caracteres son letras
		return true;
	}

	// mensajes de uso instantaneo.
	public void mensajeInicio() {
		System.out.println("Bienvenido al sistema de Gestion de notas del estudiante.\n\n");
	}

	public void mensajeAdvertencia() {
		System.out.println("Este programa se ha diseñado con le objetivo de realizar el \n"
				+ "almacenamiento y calculo de las notas de los estudaintes \n"
				+ "durante el año electivo, permitiendoles tener una vision \n"
				+ "clara de las notas y los promedios obtenidos por ellos y asi \n"
				+ "poder tomar desiciones especiales.\n\n\n");
	}

	public void mensajeFinal() {
		System.out.println("En este punto damos por finalizado el funcionamiento del programa.");
	}

	public void mensajePreparacion() {
		System.out.println(
				"Para efectos practicos del siguiente program, debemmos crear los datos de forma artificial, sin embargo podras tambien modificarlo para solo anexar datos cuando usted quiera.");

	}

}
