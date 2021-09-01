/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Ejercicio01;

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
        
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaNumerica = new Scanner(System.in);
        
        ArrayList<Persona> listaPersonas = new ArrayList();
        String nombre;
        String apellido;
        int edad;
        int documento;
        int numeroPerro;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("-------Cargar datos de Persona------");
            
            System.out.print("Ingrese nombre: ");
            nombre = (entradaString.nextLine());
            
            System.out.print("Ingrese apellido: ");
            apellido = (entradaString.nextLine());
            
            System.out.print("Ingrese edad: ");
            edad = (entradaNumerica.nextInt());
            
            System.out.print("Ingrese documento: ");
            documento = (entradaNumerica.nextInt());
            
            System.out.println("Elija el numero de perro que quiere adoptar: ");
            mostrasOpcionesPerros(listaPerros);
            numeroPerro = entradaNumerica.nextInt();
            
            listaPersonas.add(new Persona(nombre, apellido, edad, documento, listaPerros.get(numeroPerro - 1)));
        }
        
       
        mostrasPersonas(listaPersonas);
        
    }
    
    public static void mostrasOpcionesPerros(ArrayList<Perro> listaPerros) {
        
        int contador = 1;
        for (Perro perro : listaPerros) {
            
            System.out.println("[" + contador + "]  "+ perro.getNombre() + " Raza: " + perro.getRaza());
            
            contador++;
        }
    }
    
    public static void mostrasPersonas(ArrayList<Persona> listaPersonas) {
        
        for (Persona persona : listaPersonas) {
            
            System.out.println(persona.toString());
        }
    }
}
