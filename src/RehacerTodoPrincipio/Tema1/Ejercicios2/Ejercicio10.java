package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String arg[]){

      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce un numero: ");
      int n1 =  sc.nextInt();

      System.out.println("Introduce otro numero: ");
      int n2 =  sc.nextInt();

      int suma =  n1 + n2;
      int resta = n1 - n2;
      int producto = n1 * n2;

      System.out.println("La suma es: " + suma);
      System.out.println("La resta es: " + resta);
      System.out.println("La multiplicacion es: " + producto);

        if (n2 != 0) {
            double division = n1 / n2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
