package Main;

import java.util.Random;

public class Student implements RandomValues {

	private String studentNumber;
	private String name;
	private String codeLevelCourse;
	private String nameGroupDirector;

	private Random random;

	public Student() {
		System.out.println("\n Se inicia una automatizacion de llneado de datos para el sistema.");
		this.random = new Random();
		this.name = randomNameGenerator();
		this.studentNumber = randomNumberIDGenerator();
		this.codeLevelCourse = String.valueOf(randomLetter()) + String.valueOf(Math.floor(Math.random() * 9));
		this.nameGroupDirector = randomNameGenerator();
		metodoPruebaImpresion();
		System.out.println("\n Se finaliza una automatizacion de llneado de datos para el sistema.");

	}

	public void metodoPruebaImpresion() {
		System.out.println("almacenamiento de estudiantea automatico");
		System.out.println("Estudiante: " + this.name + " numero de estudiante: " + this.studentNumber);
	}

	// Getter and setters

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCodeLevelCourse() {
		return codeLevelCourse;
	}

	public void setCodeLevelCourse(String codeLevelCourse) {
		this.codeLevelCourse = codeLevelCourse;
	}

	public String getNameGroupDirector() {
		return nameGroupDirector;
	}

	public void setNameGroupDirector(String nameGroupDirector) {
		this.nameGroupDirector = nameGroupDirector;
	}

	// Methods

	// Interface Random topics
	public char randomLetter() {
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char letter = abc.charAt(random.nextInt(abc.length()));
		return letter;
	}

	public String randomNameGenerator() {
		String nombresAleatorios;

		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar" };
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };

		nombresAleatorios = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
				+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];

		return nombresAleatorios;
	}

	public String randomNumberIDGenerator() {
		String numeroAleatorioID = "";
		int tamañoID = (int) Math.floor(Math.random() * 12 + 8);

		String[] nombres = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		for (int i = 0; i < tamañoID; i++) {
			numeroAleatorioID = numeroAleatorioID + ""
					+ nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
		}

		return numeroAleatorioID;
	}

}
