/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class RuletaRusaDeAgua {
    
    public static void main(String[] args) {
        
        Scanner entradaNumerica = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.print("Ingrese cantidad de jugadores del 1 al 6: ");
        int cantidadDeJugadores= entradaNumerica.nextInt();
        if(cantidadDeJugadores<1 || cantidadDeJugadores>6){
            cantidadDeJugadores=6;
        }
        for (int i = 1; i <= cantidadDeJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        
        Juego juego1 = new Juego();
        juego1.llenarJuego(jugadores, revolver);
       // juego1.mostrarJugadores();
        juego1.ronda();
    }
    
}
