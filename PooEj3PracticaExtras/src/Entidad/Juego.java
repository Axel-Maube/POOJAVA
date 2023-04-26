/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un 
juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después 
de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

public class Juego {

    private int num1;
    private int num2;
    private int intentos;

    public Juego(int num1, int num2, int intentos) {
        this.num1 = num1;
        this.num2 = num2;
        this.intentos = intentos;
    }

    public Juego() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setNum1(int num1) {
        this.num1 = num1;

    }

    public void setNum2(int num2) {

        this.num2 = num2;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int juegoGanado1 = 0;
        int juegoGanado2 = 0;

        String respuesta;
        do {
            System.out.println("Jugador 1: Ingrese el Numero a adivinar");
            this.num1 = leer.nextInt();
            intentos = 0;
            do {

                System.out.println("Jugador 2: Ingrese el Numero que debe adivinar");
                this.num2 = leer.nextInt();
                if (num1 == num2) {
                    System.out.println("Adivino el numero");
                    intentos++;
                    break;
                } else if (num1 < num2) {
                    System.out.println("El numero ingresado es mas alto que el numero a adivinar");
                    intentos++;
                } else {
                    System.out.println("El numero ingresado es mas bajo que el numero a adivinar");
                    intentos++;
                }

            } while (intentos < 5);

            if (num1 == num2 && intentos < 5) {
                System.out.println("El jugador ha adivinado el numero en " + intentos + " intentos.");
                juegoGanado1++;
            } else {
                System.out.println("El jugador no ha adivinado");
                juegoGanado2++;
            }
            System.out.println("¿Quiere seguir jugando? S/N");
            respuesta = leer2.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println("El jugador 1 gano " + juegoGanado2 + " veces");
        System.out.println("El jugador 2 gano " + juegoGanado1 + " veces");
    }

}
