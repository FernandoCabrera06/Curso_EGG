/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fernando
 */
public class Baraja {

    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> mazoRepartido = new ArrayList();

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void addCarta(Carta carta) {
        mazo.add(carta);
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    //MÉTODOS
    public void barajar() {
        Collections.shuffle(mazo);
    }

    public void siguienteCarta() {
        if (!(mazo.isEmpty())) {
            mazoRepartido.add(mazo.get(0));
            mazo.remove(0);
            System.out.println(mazoRepartido.get(0).toString());
        } else {
            System.out.println("No hay mas cartas para repartir!");
        }
    }

    public int cartasDisponibles() {
        return mazo.size();
    }

    public void darCartas(int cantidad) {

        if (mazo.size() >= cantidad) {
            Carta carta;
            for (int i = 0; i < cantidad; i++) {

                mazoRepartido.add(mazo.get(0));
                mazo.remove(0);
                System.out.println(mazoRepartido.get(i).toString());

            }
        } else {
            System.out.println("El mazo tiene menos cartas de la cantidad solicitada!");
        }
    }

    public void cartasMonton() {

        if (!(mazoRepartido.isEmpty())) {
            for (Carta carta : mazoRepartido) {
                System.out.println(carta.toString());
            }
        } else {
            System.out.println("No se han repartido cartas!");
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }
}
