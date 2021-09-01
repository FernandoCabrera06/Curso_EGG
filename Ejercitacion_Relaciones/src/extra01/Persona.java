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
public class Persona {

    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;

    //relación
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        perro = new Perro();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro.getNombre() + " " + perro.getRaza() + '}';
    }

    public void adoptarPerro(Perro perroParaAdoptar) {
        if (perroParaAdoptar.isEsAdoptado()) {
            System.out.println("El perro " + perroParaAdoptar.getNombre() + " ya esta adoptado.");

        } else {
            System.out.println("Felicidades usted adoptó a " + perroParaAdoptar.getNombre() + ".");
            perroParaAdoptar.setEsAdoptado(true);
            perro = perroParaAdoptar;

        }

    }

}
