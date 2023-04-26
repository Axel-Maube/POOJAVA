/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, 
se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooej2practica;

import Entidad.Circunferencia;

public class PooEj2Practica {

    public static void main(String[] args) {
       Circunferencia radio1 = new Circunferencia();
        radio1.setRadio(8);
        System.out.println("Para el radio: " +radio1.getRadio() );
        System.out.println("El area es: " + radio1.area());
        System.out.println("La circunferencia es: " + radio1.perimetro());
       
       
    }
    
}

