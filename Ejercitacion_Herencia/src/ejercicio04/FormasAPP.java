/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author Fernando
 */
public class FormasAPP {

    public static void main(String[] args) {

                           //radio, diametro
        Circulo circulo = new Circulo(4, 6);
                                       //base, altura
        Rectangulo rectangulo = new Rectangulo(3, 5);

        circulo.calcularArea();
        circulo.calcularPerimetro();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }

}
