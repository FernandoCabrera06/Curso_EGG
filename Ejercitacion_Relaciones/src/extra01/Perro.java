/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

/**
 *
 * @author Fernando
 */
public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private double tamanio;
    private boolean esAdoptado;

    public Perro() {
        esAdoptado = false;

    }

    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        esAdoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEsAdoptado() {
        return esAdoptado;
    }

    public void setEsAdoptado(boolean esAdoptado) {
        this.esAdoptado = esAdoptado;
    }

}
