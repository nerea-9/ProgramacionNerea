package RehacerTodoPrincipio.Tema1.Ejercicio3;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        for(int i = 1; i<= numero; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
