package tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el lado del cuadrado: ");
        int lado = scanner.nextInt();


        int superficie = lado * lado;
        int perimetro = 4 * lado;


        System.out.println("Superficie del cuadrado: " + superficie);
        System.out.println("Perímetro del cuadrado: " + perimetro);


        scanner.close();
    }





}
