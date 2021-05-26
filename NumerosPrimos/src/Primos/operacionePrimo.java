/*
 * Esta clase indica que procesos debemos realizar 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primos;

/**
 * version 2.1 26.8.2020
 *
 * @author Anderson Camacho
 */
public class operacionePrimo{
    //Metodos de la clase
    //hace un loop para la operacion modulo que permita analizar si cumple como numero primo.

    private boolean esPrimo(int numero) {
        int contador = 0;
        boolean respuesta;
        for (int i = 1; i <= numero; i++) {

            /*consulta matematica del residuo, si es cero 
            se suma al contador, en caso contrario no se suma*/
            if ((numero % i) == 0) {
                contador++;
            }
        }
        //indicamos si es falso o verdadero de acuerdo a el resultdo final del contador
        //si es mayor a 2 entonces no es primo, de lo contrario es primo
        if (contador > 2) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        
        return respuesta;

    }

    //devuelve el mensjae para almacenar de forma global
    private String respuestaPrimo(boolean respuestaBool) {
        String respuesta = "";
        if (respuestaBool) {
            respuesta = "es primo";
        } else {
            respuesta = "no es primo";
        }
        return respuesta;
    }
    
    //operacion general
    public String operarPregunta(int numero){
        return respuestaPrimo(esPrimo(numero));
    }
    
    

}
