/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Fernando
 */
public class Cine {

    private Pelicula pelicula;
    private double precioEntrada;

    //48 asientos debe tener, 8 filas en ArrayList y en cada una HashMaps de 6.
    private ArrayList<LinkedHashMap<String, String>> sala1 = new ArrayList();

    public Cine() {
        llenarConAsientos();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    private void llenarConAsientos() {

        for (int i = 8; i > 0; i--) {
            LinkedHashMap<String, String> mapa = new LinkedHashMap();

            mapa.put(((i) + "A"), " ");
            mapa.put(((i) + "B"), " ");
            mapa.put(((i) + "C"), " ");
            mapa.put(((i) + "D"), " ");
            mapa.put(((i) + "E"), " ");
            mapa.put(((i) + "F"), " ");

            sala1.add(mapa);
        }
    }

    public void mostrarSala() {

        for (LinkedHashMap<String, String> mapa : sala1) {

            for (Map.Entry<String, String> entry : mapa.entrySet()) {

                System.out.print(entry.getKey() + entry.getValue());
                if (!entry.getKey().contains("F")) {
                    System.out.print("|");
                }
            }
            System.out.println("");

        }

    }

    public void ubicarEspectadores(ArrayList<Espectador> listaEspectadores) {
        System.out.println("edad pelicula " + this.getPelicula().getEdadMinima());
        System.out.println("precio pelicula " + this.getPrecioEntrada());

        //Guardo las keys de los asientos de la sala
        ArrayList<String> listaKeys = new ArrayList();
        for (LinkedHashMap<String, String> filaMapa : sala1) {
            for (Map.Entry asiento : filaMapa.entrySet()) {
                listaKeys.add(asiento.getKey().toString());
            }
        }

        for (Espectador espectador : listaEspectadores) {
            if ((espectador.getDineroDisponible() >= this.getPrecioEntrada()) && espectador.getEdad() >= this.getPelicula().getEdadMinima()) {
                System.out.println(espectador);
                ubicarEnSala(listaKeys);
            }

        }

    }

    public void ubicarEnSala(ArrayList<String> listaKeys) {
        boolean esCargado = true;
        while (esCargado) {
            String key = listaKeys.get((int) Math.floor(Math.random() * (48)));
            for (LinkedHashMap<String, String> fila : sala1) {
                for (Map.Entry<String, String> asiento : fila.entrySet()) {

                    if ((asiento.getKey().equals(key))) {
                        if ((asiento.getValue().equals(" "))) {

                            asiento.setValue("X");
                            esCargado = false;
                            break;
                        }
                    }
                }
            }
        }
    }

}
