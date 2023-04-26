/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad 
y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene
menos de 30 años.
 */
package Entidad;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void calcular_aumento() {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        do {

            System.out.println("Ingrese el nombre del Empleado");
            this.nombre = leer.nextLine();
            System.out.println("Ingrese la edad de: " + nombre);
            this.edad = leer.nextInt();
            System.out.println("Ingrese el salario de: " + nombre);
            this.salario = leer.nextDouble();
            leer.nextLine();

            if (edad >= 30) {
                System.out.println("Para " + nombre + " el aumento es del 10%");
                salario = salario * 1.10;
                System.out.println("Su nuevo salario es de: " + salario);
            } else {
                System.out.println("Para " + nombre + " el aumento es del 5%");
                salario = salario * 1.05;
                System.out.println("Su nuevo salario es de: " + salario);
            }
            System.out.println("Desea calcular el aumento de otro empleado S/N");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Saliendo del programa");
        System.out.println("---------------------------------");
        System.out.println("ADIOS");
        System.out.println("Lo esperamos pronto");

    }

}
