/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};

        // Creamos una variable suma para aumentar los valores del arrego 
        // establecido anteriormente.
        int suma = 0;

        // Creamos una variable "media" para calcular la media aritmetica
        // de los valores a continuacion.
        double media;

        // Un contador para los valores mayores y menores a la media
        int contadormayor = 0;
        int contadormenor = 0;

        // Utilizamos un ciclo "for" para sumar los valores del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        // Para calcular la media aritmetica se aplica la siguiente operacion.
        media = suma / arreglo.length;

        // A travez del ciclo "for" se comprueba si los valores estan
        // por arriba o por debajo de la media aritmetica.
        for (int i = 0; i < arreglo.length; i++) {
            // aumento en contador "+"
            if (arreglo[i] > media) {
                contadormayor++;
                // aumento en contador "-"
            } else {
                if (arreglo[i] < media) {
                    contadormenor++;
                }
            }
        }
        // Finalmente presentamos los valores obtenidos
        System.out.printf("Los valores arriba de la media aritmetica "
                + "son: %d\nLos valores por debajo de la media aritmetica "
                + "son: %d\n", contadormayor, contadormenor);
    }

}
