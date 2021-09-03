/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class CineAPP {

    public static void main(String[] args) {

        Cine cine1 = new Cine();

        System.out.println("----------SALA-----------");
        cine1.mostrarSala();
        cine1.setPelicula(new Pelicula("El tirador", 89, 18, "James Cameron"));
        cine1.setPrecioEntrada(400);

        ArrayList<Espectador> listaEspectadores = new ArrayList();

        for (int i = 0; i < 12; i++) {
            listaEspectadores.add(new Espectador(("fer" + (i + 1)), (3 + ((i + 1) * 2)), (20 + ((i + 1) * 50))));
            listaEspectadores.add(new Espectador(("fer" + (i + 1)), (3 + ((i + 1) * 2)), (20 + ((i + 1) * 50))));
            listaEspectadores.add(new Espectador(("fer" + (i + 1)), (3 + ((i + 1) * 2)), (20 + ((i + 1) * 50))));
            listaEspectadores.add(new Espectador(("fer" + (i + 1)), (3 + ((i + 1) * 2)), (20 + ((i + 1) * 50))));
        }
        System.out.println("----------ESPECTADORES-----------");

        for (Espectador espectador : listaEspectadores) {
            System.out.println(espectador);
        }

        System.out.println("---------------------ESPECTADORES HABILITADOS------------------------");
        cine1.ubicarEspectadores(listaEspectadores);

        System.out.println("----------SALA CON ESPECTADORES UBICADOS-----------");
        cine1.mostrarSala();
    }

}
