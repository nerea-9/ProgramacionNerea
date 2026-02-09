package Tema5;
import java.util.InputMismatchException;
import  java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        try{
            System.out.println("Introduce un numero entero: ");
            int num = sc.nextInt();
            System.out.println("Valor introducido: " + num);
        }
        catch(InputMismatchException e) {
            System.err.println("Error: Valor introducido incorrecto, no se pueden letras");
        }
    }
}
