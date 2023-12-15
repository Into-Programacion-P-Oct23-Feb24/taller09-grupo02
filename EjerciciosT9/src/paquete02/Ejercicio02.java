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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10, 21,
            -1, 100, 200, 2, 21, 22, 27};
        String[] rangos = {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos = new int[4]; // {0, 0, 0, 0, 0}
        int respuesta;
        
        // A esta le añadimos una variable de tipo entero, para aumentar los 
        // valores que no son correspondidos.
        int fuera_de_rango = 0;

        for (int i = 0; i < respuestas.length; i++) {
            respuesta = respuestas[i]; // -1
            if ((respuesta >= 1) && (respuesta <= 5)) {
                valoresRangos[0] = valoresRangos[0] + 1;
            } else {
                if ((respuesta >= 6) && (respuesta <= 10)) {
                    valoresRangos[1] = valoresRangos[1] + 1;
                } else {
                    if ((respuesta >= 11) && (respuesta <= 15)) {
                        valoresRangos[2] = valoresRangos[2] + 1;
                    } else {
                        if ((respuesta >= 16) && (respuesta <= 20)) {
                            valoresRangos[3] = valoresRangos[3] + 1;
                        } else {
                            // AL else final van los valores que no ingresaron 
                            // dentro de los rangos y aumentamos lo que es la variable.
                          
                            fuera_de_rango++;
                        }

                    }
                }

            }
        }

        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }
        // Presentamos a continuacion los valores fuera de rango.
        System.out.printf("Valores fuera de rango: %d\n",
                fuera_de_rango);

    }

}
