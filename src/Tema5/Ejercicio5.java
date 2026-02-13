package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5 {

    public void imprimePositivo(int p) throws Exception {
        if (p < 0)
            throw new Exception("Error: Numero negativo no se puede introducir");
        System.out.println(p);
    }

    public void imprimeNegativo(int n) throws Exception {
        if (n >= 0)
            throw new Exception("Error: Numero positivo no se puede introducir");
        System.out.println(n);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Ejercicio5 ej = new Ejercicio5();

        int num = 0;

        while (num >= 0) {

            try {
                System.out.println("Escribe un numero (negativo para salir): ");
                num = sc.nextInt();

                if (num >= 0) {
                    ej.imprimePositivo(num);
                } else {
                    ej.imprimeNegativo(num);
                }

            } catch (InputMismatchException e) {
                System.err.println("Error: Debes introducir un número");
                sc.nextLine();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}