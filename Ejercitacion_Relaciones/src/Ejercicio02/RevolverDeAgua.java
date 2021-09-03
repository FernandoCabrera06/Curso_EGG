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
public class RevolverDeAgua {

    private int posicionActual; //posición del tambor que se dispara, puede que esté el agua o no
    private int posicionAgua; //la posición del tambor donde se encuentra el agua

    public RevolverDeAgua() {
    }

    public void llenarRevolver() {

        /*genero numeros aleatorios del 1 al 6
        aplicando Math.floor(Math.random() * (MAX - MIN + 1)) + MIN;*/
        posicionActual = ((int) Math.floor(Math.random() * 6 + 1));
        posicionAgua = ((int) Math.floor(Math.random() * 6 + 1));
    }

    public boolean mojar() {

        return (posicionActual == posicionAgua);
    }

    public void siguienteChorro() {

        if (posicionActual < 6) {
            posicionActual++;
        } else {
            posicionActual = 1;

        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
