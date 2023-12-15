/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] argas) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numeroElementos;
        String[] vehiculos;
        String marca = "";
        String mensajeFinal = "";
        
        //Se ingresa por teclado la cantidad a asignarse para iniciar el arreglo
        System.out.println("Ingrese el numero de vehiculos a ingresar");
        numeroElementos = entrada.nextInt();
        //Se asigna la variable para guardar los datos ingresados por teclado
        vehiculos = new String[numeroElementos];
        int contador = 0;
        entrada.nextLine();

        while (contador < numeroElementos) {
            System.out.println("Ingrese la marca de vehiculos");
            marca = entrada.nextLine();
            //Se crea la restriccion de letras que NO SE PUEDEN INGRESAR
            String inicial = marca.substring(0, 1);
            if ("A".equals(inicial) || "C".equals(inicial)
                    || "T".equals(inicial)) {
                System.out.println("Error");
            } else {
                vehiculos[contador] = marca;
                contador = contador + 1;
            }

        }
        //Se presenta en pantalla los datos ingresados en una cadena 
        for (int i = 0; i < vehiculos.length; i++) {
            mensajeFinal = String.format("%s\n%s", mensajeFinal, vehiculos[i]);
        }
        System.out.printf("Los carros ingresados son:%s\n", mensajeFinal);

    }

}
