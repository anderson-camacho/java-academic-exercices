package Main;

/**
 * este metodo genera nombres con apellidos. El proceso es aleatorio. Cada vez
 * que se corra el programa mostrara nombres diferentes.
 * 
 * @param cantidad Cantidad de nombres que se quieren generar.
 * @return un arreglo de String con los nombres y apellidos generados. El
 *         formato de salida es: Nombre Apellido
 * 
 * @author Anderson Camacho
 * 
 *         Este metoddo se modifico para que su fuincionalidad fuera de un unico
 *         uso.
 * 
 * 
 *         tomado de:
 *         {@link https://yoandroide.xyz/generar-nombres-aleatorios-en-java/}
 * 
 */

public interface RandomValues {

	public String randomNameGenerator();

	public String randomNumberIDGenerator();

	public char randomLetter();
}

//notes or examples for diferents methods.

//Interface Random topics
//	public String randomNameGenerator() {
//		String nombresAleatorios;
//
//		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
//				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
//				"Caritina", "Carlota", "Baltazar" };
//		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
//				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
//				"Grigalva" };
//
//		nombresAleatorios = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
//				+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
//
//		return nombresAleatorios;
//	}
//
//	public String randomNumberIDGenerator() {
//		String numeroAleatorioID = "";
//		int tamañoID = (int) Math.floor(Math.random() * 12 + 8);
//
//		String[] nombres = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
//
//		for (int i = 0; i < tamañoID; i++) {
//			numeroAleatorioID = numeroAleatorioID + ""
//					+ nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
//		}
//
//		return numeroAleatorioID;
//	}
//public char randomLetter() {
//	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	char letter = abc.charAt(random.nextInt(abc.length()));
//	return letter;
//}