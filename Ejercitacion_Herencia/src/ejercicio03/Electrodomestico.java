/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;


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
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);
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

    private void comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {

        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }


    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
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
        if (peso >= 80) {
            precioFinal += 1000;
        }
     
        return precioFinal;
    }
        //método que devuelve el precio base del electro.
    public double precioElectro() {
        return precioFinal();
    }
}
