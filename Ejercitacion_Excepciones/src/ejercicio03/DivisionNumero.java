/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class DivisionNumero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.print("Ingrese numero 1: ");
            int num1 = Integer.parseInt(entrada.next());

            System.out.print("Ingrese numero 2: ");
           // int num2 = Integer.parseInt(entrada.next());
           
            int num2 = entrada.nextInt(); //ingreso así para poner tipos no esperados

            dividirNumeros(num1, num2);
            
            
        } catch (InputMismatchException a) {

            System.out.println("Ingrese numeros enteros");
        } catch (NumberFormatException a) {

            System.out.println("No se puede convertir a entero!");
        } catch (ArithmeticException a) {

            System.out.println("No puede dividir por Cero!");
        }
    }

    private static void dividirNumeros(int num1, int num2) {

        System.out.println("El resultado de la división es: " + (double) (num1 / num2));
    }
}
