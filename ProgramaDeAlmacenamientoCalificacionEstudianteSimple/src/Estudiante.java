
public class Estudiante {

	// Declaraciones

	private String nombreEstudiante;
	private double notaPeriodo1;
	private double notaPeriodo2;
	private double notaPeriodo3;

	// Constructores

	public Estudiante() {
		this.nombreEstudiante = " ";
		this.notaPeriodo1 = 0.0;
		this.notaPeriodo2 = 0.0;
		this.notaPeriodo3 = 0.0;
	}

	public Estudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
		this.notaPeriodo1 = 0.0;
		this.notaPeriodo2 = 0.0;
		this.notaPeriodo3 = 0.0;
	}

	public Estudiante(String nombreEstudiante, double notaPeriodo, int periodo) {
		this.nombreEstudiante = nombreEstudiante;
		asignarNotaContructor(notaPeriodo, periodo);
	}

	public Estudiante(String nombreEstudiante, double notaPeriodo1, double notaPeriodo2, double notaPeriodo3) {
		this.nombreEstudiante = nombreEstudiante;
		this.notaPeriodo1 = notaPeriodo1;
		this.notaPeriodo2 = notaPeriodo2;
		this.notaPeriodo3 = notaPeriodo3;
	}

	// Getters and Setters

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public double getNotaPeriodo1() {
		return notaPeriodo1;
	}

	public void setNotaPeriodo1(double notaPeriodo1) {
		this.notaPeriodo1 = notaPeriodo1;
	}

	public double getNotaPeriodo2() {
		return notaPeriodo2;
	}

	public void setNotaPeriodo2(double notaPeriodo2) {
		this.notaPeriodo2 = notaPeriodo2;
	}

	public double getNotaPeriodo3() {
		return notaPeriodo3;
	}

	public void setNotaPeriodo3(double notaPeriodo3) {
		this.notaPeriodo3 = notaPeriodo3;
	}

	// Metodos Generales

	public void asignarNotaContructor(double notaPeriodo, int periodo) {
		switch (periodo) {
		case 1:
			this.notaPeriodo1 = notaPeriodo;
			this.notaPeriodo2 = 0.0;
			this.notaPeriodo3 = 0.0;
			break;
		case 2:
			this.notaPeriodo1 = 0.0;
			this.notaPeriodo2 = notaPeriodo;
			this.notaPeriodo3 = 0.0;
			break;
		case 3:
			this.notaPeriodo1 = 0.0;
			this.notaPeriodo2 = 0.0;
			this.notaPeriodo3 = notaPeriodo;
			break;
		}
	}

}
