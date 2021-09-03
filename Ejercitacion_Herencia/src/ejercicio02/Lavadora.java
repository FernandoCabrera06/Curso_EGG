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
public class Lavadora extends Electrodomestico {

    private int carga;

    //constructores
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //get y set
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //métodos
    public void crearLavadora() {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        super.crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");

        this.setCarga(entrada.nextInt());
    }

    
    @Override
    public double precioFinal(){
    double precioFinalLavadora = super.precioFinal();
    
    if(this.carga > 30){
    precioFinalLavadora += 500;
    }
    return precioFinalLavadora;
    }
}
