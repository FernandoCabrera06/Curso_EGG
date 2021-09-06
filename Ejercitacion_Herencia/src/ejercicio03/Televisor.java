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
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean tdt, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public double precioFinal() {
        double precioFinalTelevisor = super.precioFinal();
      
        
        if (this.resolucion > 40) {
            precioFinalTelevisor += ((precioFinalTelevisor / 10) * 3);
        }
        if (this.tdt) {
            precioFinalTelevisor += 500;
        }

        return precioFinalTelevisor;
    }
    //método que devuelve el precio base del electro.
    public double precioElectro() {
        return super.precioFinal();
    }
}
