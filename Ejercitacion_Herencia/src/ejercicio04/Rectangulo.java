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
public class Rectangulo implements CalculosFormas {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
       @Override
    public void calcularArea() {
        double areaRectangulo;
        areaRectangulo = base * altura;
        System.out.println("Area rectangulo: " + areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroRectangulo;
        perimetroRectangulo = (base + altura) * 2;
        System.out.println("Perimetro rectangulo: " + perimetroRectangulo);
    }
    
}
