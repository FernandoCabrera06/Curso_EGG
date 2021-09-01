/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico; //A,B,C,D,E y F
    protected double peso;

    //constructores
    public Electrodomestico() {
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.comprobarColor(color);
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.comprobarColor(color);
    }

    //métodos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {

        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return "color";
        } else {
            return "blanco";
        }
    }
    
   public void crearElectrodomestico() {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        this.precio=1000; //precio de base, 1000
        
        System.out.println("Ingrese color: ");
        this.color = entrada.next();

        System.out.println("Indique consumo energetico A ó F: ");
        this.consumoEnergetico = entrada.next().charAt(0);

        System.out.println("Ingrese peso: ");
        this.peso = entrada.nextDouble();
        
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);

    }
   
    public void precioFinal(char consumoEnergetico, double peso) {
        double precioFinal = 0;
        
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
            case 'B':
                precioFinal += 800;
            case 'C':
                precioFinal += 600;
            case 'D':
                precioFinal += 500;
            case 'E':
                precioFinal += 300;
            case 'F':
                precioFinal += 100;
        }
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        }
        if (peso > 80) {
            precioFinal += 1000;
        }
        
        this.precio=precioFinal;
        System.out.println("Precio Final es: "+this.precio);
    }
}
