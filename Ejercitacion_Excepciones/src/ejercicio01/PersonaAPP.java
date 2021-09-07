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
public class PersonaAPP {

    public static void main(String[] args) {

        PersonaServices objservice = new PersonaServices();
        System.out.println("*********INGRESO DE DATOS**********");

        System.out.println("---------Persona 1-----------");
        Persona persona1 = objservice.crearPersona();

        System.out.println("---------Persona 2-----------");
//        Persona persona2 = objservice.crearPersona();
        Persona persona2 = null;


        
        System.out.println("");
        System.out.println("*********DATOS DE PERSONAS**********");

        System.out.println("---------Persona 1-----------");
        objservice.interpretarIMC(persona1.calcularIMC(), persona1.getPeso());
        objservice.interpretarEdad(persona1.esMayorDeEdad(), persona1.getEdad());
        
        System.out.println("---------Persona 2-----------");
        
        //intento
        try{
        objservice.interpretarIMC(persona2.calcularIMC(), persona2.getPeso());
        objservice.interpretarEdad(persona2.esMayorDeEdad(), persona2.getEdad());
        }
        
        //capturo la excepción
        catch(NullPointerException a){
            System.out.println("No se cargo persona 2");
        }

        
        System.out.println("");
        System.out.println("*********ESTADISTICAS**********");
        
        System.out.println("Personas con peso ideal: "+((objservice.getContPesoIdeal()/4)*100)+"%");
        System.out.println("Personas debajo de su peso ideal: "+((objservice.getContDebajoPesoIdeal()/4)*100)+"%");
        System.out.println("Personas con sobrepeso: "+((objservice.getContSobrepeso()/4)*100)+"%");
        System.out.println("");
        System.out.println("Personas MAYORES de edad: "+((objservice.getContMayor()/4)*100)+"%");
        System.out.println("Personas menores de edad: "+((objservice.getContMenor()/4)*100)+"%");
        
    }

}
