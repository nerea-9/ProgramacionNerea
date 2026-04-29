package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Intoduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
