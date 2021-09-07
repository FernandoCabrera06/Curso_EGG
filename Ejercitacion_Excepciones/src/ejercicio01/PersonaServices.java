/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class PersonaServices {

    private static double contPesoIdeal = 0, contDebajoPesoIdeal = 0, contSobrepeso = 0, contMayor = 0, contMenor = 0;

    public static double getContPesoIdeal() {
        return contPesoIdeal;
    }

    public static double getContDebajoPesoIdeal() {
        return contDebajoPesoIdeal;
    }

    public static double getContSobrepeso() {
        return contSobrepeso;
    }

    public static double getContMayor() {
        return contMayor;
    }

    public static double getContMenor() {
        return contMenor;
    }

 

    public Persona crearPersona() {

        Scanner entradaString = new Scanner(System.in);
        Scanner entradaNumerica = new Scanner(System.in);

        System.out.print("Introduzca nombre: ");
        String nombre = entradaString.nextLine();

        System.out.print("Introduzca edad: ");
        int edad = entradaNumerica.nextInt();

        System.out.print("Introduzca sexo (F, M u O): ");
        char sexo = entradaString.nextLine().toUpperCase().charAt(0);
        while (!(sexo == 'F' || sexo == 'M' || sexo == 'O')) {
            System.out.println("Error letra invalida!");
            System.out.print("Introduzca sexo (F, M u O): ");
            sexo = entradaString.nextLine().toUpperCase().charAt(0);
        }

        System.out.print("Introduzca peso en kilos: ");
        double peso = entradaNumerica.nextDouble();

        System.out.print("Introduzca altura en metros: ");
        double altura = entradaNumerica.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public void interpretarIMC(int imc, double peso) {
        switch (imc) {
            case -1:
                System.out.println("Esta en su peso ideal con: " + peso + " kilos");
                contPesoIdeal++;
                break;
            case 0:
                System.out.println("Esta por debajo del peso ideal con: " + peso + " kilos");
                contDebajoPesoIdeal++;
                break;
            case 1:
                System.out.println("Tiene sobrepeso con: " + peso + " kilos");
                contSobrepeso++;
                break;
            default:
                break;
        }
    }

    public void interpretarEdad(boolean mayorMenor, int edad) {

        if (mayorMenor) {

            System.out.println("Esta persona es MAYOR de edad con " + edad + " años.");
            contMayor++;
        } else {
            System.out.println("Esta persona es menor de edad con " + edad + " años.");
            contMenor++;
        }
    }
}
