package Tema5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    try{
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        int resultado = num1 / num2;
        System.out.println("El resultado es: " + resultado);
    }

    catch(InputMismatchException e){
        System.err.println("Error: Valor introducido incorrecto");
    }

    catch(ArithmeticException e){
        System.err.println("Error: No se puede dividir entre cero");
    }
    }
}
