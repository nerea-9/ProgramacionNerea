package RehacerTodoPrincipio.Tema1.Ejercicios2;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int n1 = sc.nextInt();

        System.out.println("Introduce otro numero:");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("El primer numero es mayor");
        } else if (n2 > n1) {
            System.out.println("El segundo numero es mayor");
        }if(n1 == n2) {
            System.out.println("Son iguales");
        }
    }
}

