package Tema5;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args){

        double vector[] = new double [5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vector.length; i++){
            try{
                System.out.println("Introduce un número: ");
                vector[i] = sc.nextDouble();
            }
            catch(InputMismatchException e){
                System.err.println("Error: Debes introducir un número");
                sc.nextLine();
                i--;
            }
        }
    }
}
