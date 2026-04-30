package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota del 0 al 10: ");
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Introduce tu nota del 0 al 10: ");
            nota = sc.nextDouble();

        }if(nota < 3){
            System.out.println("Muy deficiente");
        }else if(nota < 5){
            System.out.println("Insuficiente");
        }else if(nota < 6){
            System.out.println("Bien");
        }else if(nota < 9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
    }
}
