/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author Fernando
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

//Constantes
    private final int PESO_IDEAL = -1;
    private final int MENOR_PESO_IDEAL = 0;
    private final int SOBREPESO = 1;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {

        if ((peso / (altura * altura)) < 20) {
            return MENOR_PESO_IDEAL;
        }
        if (((peso / (altura * altura)) >= 20) && ((peso / (altura * altura)) <= 25)) {

            return PESO_IDEAL;
        }

        // si no ejecuta algún return anterior llega a este como ultima opción
        return SOBREPESO;
    }

    public boolean esMayorDeEdad() {

       return (edad >= 18);

        
    }

}
