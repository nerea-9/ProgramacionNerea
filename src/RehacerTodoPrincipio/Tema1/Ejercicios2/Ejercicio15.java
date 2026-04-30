package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int n1 = sc.nextInt();

        System.out.println("Introduce otro numero:");
        int n2 = sc.nextInt();

        System.out.println("Introduce otro numero:");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El primer numero es mayor");
        } else if(n2 > n1 && n2 > n3){
            System.out.println("El segundo numero es mayor");
        }else {
            System.out.println("El tercer numero es mayor");
        }
    }
}
