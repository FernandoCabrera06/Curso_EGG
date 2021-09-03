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
public class Main {

    public static void main(String[] args) {

        Animal perro = new Perro("Stich", "Carne", 15, "Doberman");
        perro.Alimentarse();

        Animal perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
        
        
    }

}
