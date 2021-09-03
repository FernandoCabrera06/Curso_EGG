/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Juego {

    ArrayList<Jugador> jugadores;
    RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
        }
    }

    public void ronda() {

        for (Jugador jugador : jugadores) {
            System.out.println("------------------------------------");
            if (jugador.disparo(revolver)) {
                System.out.println("El " + jugador.getNombre() + " PERDIÓ!");
                System.out.println("Fin del juego");
                break;
            } else {

                System.out.println("El " + jugador.getNombre() + " se salva!");
            }
        }
    }
}
