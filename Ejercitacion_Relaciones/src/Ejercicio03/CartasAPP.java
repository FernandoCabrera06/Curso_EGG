/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CartasAPP {

    public static void main(String[] args) {
        Scanner entradaNumerica = new Scanner(System.in);
        Baraja mazo1 = new Baraja();
        llenarBaraja(mazo1);

        System.out.println("--------------------BARAJAR-----------------");
        mazo1.barajar();
        mazo1.cartasMonton();
        System.out.println("----------------------------------------------");

        System.out.println("--------------------SIGUIENTE CARTA-----------------");
        mazo1.siguienteCarta();

        System.out.println("--------------------CARTAS DISPONIBLES-----------------");
        System.out.println("La cantidad de cartas que quedan en el mazo son: " + mazo1.cartasDisponibles());
        System.out.println("--------------------DAR CARTAS-----------------");

        System.out.print("ingrese cantidad a repartir: ");
        mazo1.darCartas(entradaNumerica.nextInt());
        System.out.println("--------------------CARTAS QUE SE REPARTIERON-----------------");
        mazo1.cartasMonton();
        System.out.println("--------------------MOSTRAR BARAJA-----------------");
        mazo1.mostrarBaraja();
    }

    public static void llenarBaraja(Baraja mazo1) {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                mazo1.addCarta(new Carta(i, Palo.ESPADA));
                mazo1.addCarta(new Carta(i, Palo.BASTO));
                mazo1.addCarta(new Carta(i, Palo.COPA));
                mazo1.addCarta(new Carta(i, Palo.ORO));
            }
        }
    }
}
