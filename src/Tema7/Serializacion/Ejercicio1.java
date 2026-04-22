package Tema7.Serializacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cual es tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();


        String formato = "Nombre: " + nombre + "\nEdad: " + edad;

        try {
            FileWriter archivo = new FileWriter("src/Documentos/usuario.txt");

            for(int i = 0; i < formato.length(); i++) {
                archivo.write(formato.charAt(i));

            }

            archivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
