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
public class Circulo implements CalculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
      @Override
    public void calcularArea() {
        double areaCirculo;
        areaCirculo = PI * Math.pow(radio, 2);
        System.out.println("Area circulo: " + areaCirculo);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroCirculo;
        perimetroCirculo = PI * diametro;
        System.out.println("Perimetro circulo: " + perimetroCirculo);
    }
    
}
