/*
 * Clase con contructor de la clase de tipo primo
 */
package Primos;
/**
 * version 2.1 26.8.2020
 *
 * @author Anderson Camacho
 */
public class primo extends operacionePrimo{

    //propiedades de la clase
    private int numero;
    private String mensaje;

    //Constructores
    public primo() {
    }

    public primo(int numero) {
        this.numero = numero;
        this.mensaje = operarPregunta(this.numero);
    }

    public primo(String mensaje) {
        this.mensaje = mensaje;
    }

    public primo(int numero, String mensaje) {
        this.numero = numero;
        this.mensaje = mensaje;
    }

    //Getter and Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
