import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("---- Inicio del programa ----\n\n\n");
		Scanner teclado = new Scanner(System.in);
		Random numeroAleatorio = new Random();

		String nombreEstudiante;

		Estudiante[] estudiante = new Estudiante[10];

		for (int i = 0; i < estudiante.length; i++) {
			System.out.print("Ingresa el nombre del estudiante: ");
			nombreEstudiante = teclado.next();
			estudiante[i] = new Estudiante(nombreEstudiante, numeroAleatorio.nextDouble(), numeroAleatorio.nextDouble(),
					numeroAleatorio.nextDouble());
		}

		for (int i = 0; i < estudiante.length; i++) {
			System.out.println("El estudiante " + estudiante[i].getNombreEstudiante()
					+ " tiene en el periodo uno la siguiente nota: " + estudiante[i].getNotaPeriodo1());
		}

		System.out.println("\n\n\n---- Final  del programa ----");
	}

}
