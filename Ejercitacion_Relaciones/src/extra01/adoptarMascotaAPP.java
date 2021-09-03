/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package extra01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class adoptarMascotaAPP {

    public static void main(String[] args) {

        ArrayList<Perro> listaPerros = new ArrayList();
        listaPerros.add(new Perro("Firulais", "beagle", 4, 45));
        listaPerros.add(new Perro("Colmillo Blanco", "siberiano", 2, 52));

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> listaPersonas = new ArrayList();
        String nombre;
        String apellido;
        int edad;
        int documento;
        int numeroPerro;
        int cantidadPersonas;
        System.out.println("Ingresa cantidad de personas a cargar: ");
        cantidadPersonas=entrada.nextInt();
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("-------Cargar datos de Persona------");

            System.out.print("Ingrese nombre: ");
            nombre = (entrada.next());

            System.out.print("Ingrese apellido: ");
            apellido = (entrada.next());

            System.out.print("Ingrese edad: ");
            edad = (entrada.nextInt());

            System.out.print("Ingrese documento: ");
            documento = (entrada.nextInt());

            System.out.println("Elija el numero de perro que quiere adoptar: ");
            mostrasOpcionesPerros(listaPerros);
            numeroPerro = entrada.nextInt();
            Perro perroParaAdoptar = listaPerros.get(numeroPerro - 1);
            
            listaPersonas.add(new Persona(nombre, apellido, edad, documento));

            listaPersonas.get((listaPersonas.size() - 1)).adoptarPerro(perroParaAdoptar);

        }

        System.out.println("--------PERSONAS CARGADAS---------");
        mostrasPersonas(listaPersonas);

    }

    public static void mostrasOpcionesPerros(ArrayList<Perro> listaPerros) {

        int contador = 1;
        for (Perro perro : listaPerros) {

            System.out.println("[" + contador + "]  " + perro.getNombre() + " Raza: " + perro.getRaza());

            contador++;
        }
    }

    public static void mostrasPersonas(ArrayList<Persona> listaPersonas) {

        for (Persona persona : listaPersonas) {

            System.out.println(persona.toString());
        }
    }
}
