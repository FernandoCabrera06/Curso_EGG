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

    public Televisor(double resolucion, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = false;
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

    public void crearTelevisor() {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        super.crearElectrodomestico();

        System.out.println("Ingrese resolución: ");

        this.setResolucion(entrada.nextDouble());

        System.out.println("Posee tdt? [S] para confirmar, otra letra para negar: ");

        String respuestaTDT = entrada.next();
        if (respuestaTDT.equalsIgnoreCase("S")) {
            this.setTdt(true);
        }
    }
    @Override
    public double precioFinal(){
    double precioFinalTelevisor = super.precioFinal();
    
    if(this.resolucion > 40){
    precioFinalTelevisor += ((precioFinalTelevisor/10)*3);
    }
     if(this.tdt){
    precioFinalTelevisor += 500;
    }
    
    return precioFinalTelevisor;
    }

}
