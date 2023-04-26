/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos 
del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del 
rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir 
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidad;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base");
        this.base = leer.nextInt();
        System.out.println("Ingrese altura");
        this.altura = leer.nextInt();
    }

    public int calcularSup() {
        // int superficie=base*altura;
        //return superficie;
        return this.base * this.altura;
    }

    public int calcularPerimetro() {
        //int perimetro=(base+altura)*2;
        //return perimetro;
        return (this.base * this.altura) * 2;
    }

    public void dibujarRectangulo() {
        //linea sup
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*for (int i = 0; i < base; i++) {
                System.out.print("* ");

            }
            System.out.println(" ");
            //centro vacio
            for (int i = 0; i < altura ; i++) {
                System.out.print("*");
                for (int j = 0; j < altura; j++) {
                    System.out.print(" ");

                }
                        
                System.out.println("*");
            }
            //linea inf
            for (int i = 0; i < base; i++) {
                System.out.print("* ");

            }
     */

}
