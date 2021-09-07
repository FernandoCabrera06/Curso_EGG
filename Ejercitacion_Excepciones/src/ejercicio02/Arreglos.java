/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Fernando
 */
public class Arreglos {

    public static void main(String[] args) {

        int[] arregloDeEnteros = {20, 35, 65, 82, 79};

        try {
            //pongo al ciclo fuera de rango para que entre en la excepción
            for (int i = 0; i < 6; i++) {
                System.out.print("[" + arregloDeEnteros[i] + "] ");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("\nEstá queriendo recorrer mas posiciones de las que tiene el arreglo!");
        }

        System.out.println("");
    }

}
