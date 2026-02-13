package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String [] args){
        int N = (int)(Math.random() * 100) + 1;
        int[] vector = new int[N];

        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 100) + 1;
        }

        Scanner sc = new Scanner(System.in);

        int position = 0;

        while(position >= 0){

            try{
                System.out.println("Que posicion del vector quieres mostrar(negativo para salir): ");
                position = sc.nextInt();

                if(position >= 0){
                    System.out.println("Valor en la posición " + position + ": " + vector[position]); }
            }
            catch(InputMismatchException e){
                System.err.println("Error: Debes introducir un número");
                sc.nextLine();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Error: Esa posición no existe");
            }
        }
    }
}
