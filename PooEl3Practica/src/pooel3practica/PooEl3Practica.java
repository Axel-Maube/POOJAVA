
package pooel3practica;

import entidad.Operacion;


public class PooEl3Practica {

   
    public static void main(String[] args) {
        Operacion operaciones = new Operacion ();
        operaciones.crearOperacion();
        
        System.out.println("El resultado de la suma es: " + operaciones.sumar());
        System.out.println("El resultado de la resta es: " + operaciones.restar());
        System.out.println("El resultado de la multiplicacion es: "+ operaciones.multiplicar());
        System.out.println("El resultado de la division es: " + operaciones.dividir());
        
        
        
    }
    
}
