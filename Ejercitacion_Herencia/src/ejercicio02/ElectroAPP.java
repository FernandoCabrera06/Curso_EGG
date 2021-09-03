/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Fernando
 */
public class ElectroAPP {

    public static void main(String[] args) {

        Lavadora lavadora = new Lavadora();

        System.out.println("-----------LAVADORA-----------");
        lavadora.crearLavadora();

        System.out.println("Carga: " + lavadora.getCarga());
        System.out.println("Color: " + lavadora.getColor());
        System.out.println("Peso: " + lavadora.getPeso());
        System.out.println("Precio final--> $" + lavadora.precioFinal());

        Televisor televisor = new Televisor();

        System.out.println("-----------TELEVISOR-----------");
        televisor.crearTelevisor();

        System.out.println("Pulgadas: " + televisor.getResolucion());
        System.out.println("Color: " + televisor.getColor());
        System.out.println("TDT: " + televisor.isTdt());
        System.out.println("Peso: " + televisor.getPeso());
        System.out.println("Precio final--> $" + televisor.precioFinal());

    }

}
