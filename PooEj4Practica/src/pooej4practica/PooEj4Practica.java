
package pooej4practica;

import entidad.Rectangulo;


public class PooEj4Practica {

   
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        
        rectangulo1.crearRectangulo();
        System.out.println("La superficie del Rectangulo es : " + rectangulo1.calcularSup());
        System.out.println("El perimetro del Rectangulo es : " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();
        System.out.println("");
    }
    
}
