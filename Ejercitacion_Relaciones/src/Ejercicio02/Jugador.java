/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Ejercicio02;

/**
 *
 * @author Fernando
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        
        if (revolver.mojar()) {
            return true;
        } else {
            revolver.siguienteChorro();
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

}
