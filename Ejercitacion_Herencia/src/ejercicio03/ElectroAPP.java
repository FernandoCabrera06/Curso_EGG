/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class ElectroAPP {

    public static void main(String[] args) {

        //Carga, precio,color,consumoEnergetico, peso.
        //>30  , 
        Lavadora lavadora1 = new Lavadora(55, 1000, "azul", 'B', 45);//2800
        Lavadora lavadora2 = new Lavadora(25, 1200, "negro", 'D', 28);//2200

        //resolucion,precio,color,consumoEnergetico,peso
        Televisor televisor1 = new Televisor(48, true, 1500, "rojo", 'C', 40);//3880
        Televisor televisor2 = new Televisor(30, false, 800, "gris", 'E', 24);//1600

        List<Electrodomestico> electros = new ArrayList(); //inserto alternando tipos de electro.
        electros.add(lavadora1);
        electros.add(televisor1);
        electros.add(lavadora2);
        electros.add(televisor2);

        double sumaTotalElectros = 0;
        System.out.println("************PRECIOS ELECTRODOMESTICOS************");
        for (Electrodomestico electro : electros) {

            System.out.println("Precio Electrodomestico $" + electro.precioElectro());
            System.out.println("Precio final--> $" + electro.precioFinal());
            System.out.println("--------------------------------------");
            sumaTotalElectros += electro.precioFinal();

        }
        System.out.println("Suma TOTAL--> $" + sumaTotalElectros);

        double sumaTotalLavadoras = 0;

        System.out.println("************PRECIOS SOLO DE LAVADORAS************");
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora) {
                System.out.println("Precio Electrodomestico $" + electro.precioElectro());
                System.out.println("Precio final--> $" + electro.precioFinal());
                System.out.println("--------------------------------------");
                sumaTotalLavadoras += electro.precioFinal();
            }
        }
        System.out.println("Suma TOTAL--> $" + sumaTotalLavadoras);

        double sumaTotalTelevisores = 0;
        System.out.println("************PRECIOS SOLO DE TELEVISORES************");
        for (Electrodomestico electro : electros) {
            if (electro instanceof Televisor) {
                System.out.println("Precio Electrodomestico $" + electro.precioElectro());
                System.out.println("Precio final--> $" + electro.precioFinal());
                System.out.println("--------------------------------------");
                sumaTotalTelevisores += electro.precioFinal();
            }
        }
        System.out.println("Suma TOTAL--> $" + sumaTotalTelevisores);

    }
}
