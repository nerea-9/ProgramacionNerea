package Tema5;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args){

        int vector[] = new int [5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vector.length; i++){
            try{
                System.out.println("Introduce un número: ");
                vector[i] = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.err.println("Error: Valor introducido incorrecto");
                sc.nextLine();
                i--;
            }
        }
    }
}
