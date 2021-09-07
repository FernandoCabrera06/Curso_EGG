/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Extra_Ej10_adivinarMultiplicacionAleatoria {

    public static void main(String[] args) {
        int multiplicacionAleatoria;
        
        multiplicacionAleatoria=generarMultiplicacionAleatoria();
        adivinarMultiplicacion(multiplicacionAleatoria);
    }

    
    
    private static int generarMultiplicacionAleatoria() {
        int multiplicacion;

//genera multiplicacion aleatoria de numeros de 0 a 10, osea minimo 0*0 y maximo 10*10.
      multiplicacion = (int) Math.floor(Math.random() * (0 - 11) + 11) * (int) Math.floor(Math.random() * (0 - 11) + 11);
       

        return multiplicacion;
    }
    
    private static void adivinarMultiplicacion(int multiplicacion){
        Scanner entradaInt = new Scanner(System.in);
        int numIngresado;
        System.out.println("--------Adivinar multiplicación aleatoria-------");
        System.out.println("");
        System.out.print("Ingrese un numero de 0-100: ");
        numIngresado= entradaInt.nextInt();
        while(numIngresado!=multiplicacion){
         if(numIngresado!=multiplicacion){
             System.out.print("Error, Intente nuevamente: ");
        numIngresado= entradaInt.nextInt();  
         }
         
         if(numIngresado==multiplicacion){
             System.out.println("");
          System.out.println("Adivinaste!");
         }
        }
        System.out.println("");
    }
}
