package Tema7.EjerciciosB;

import java.io.*;
import java.util.Scanner;

public class EjercicioB6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de cualquier longitud (Ej: 1234): ");
        String buscar = sc.nextLine();

        boolean encontrado = false;

        String FileName = "src/Documentos/pi-million.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {

            String linea;
            String pi = "";

            // 1. Leer todo el archivo en un String
            while ((linea = br.readLine()) != null) {
                pi = pi + linea;
            }

            // 2. BÚSQUEDA MANUAL (sin indexOf)
            for (int i = 0; i <= pi.length() - buscar.length(); i++) {

                boolean coincide = true;

                for (int j = 0; j < buscar.length(); j++) {
                    if (pi.charAt(i + j) != buscar.charAt(j)) {
                        coincide = false;
                        break;
                    }
                }

                if (coincide) {
                    encontrado = true;
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (encontrado) {
            System.out.println("El número aparece en los primeros 1.000.000 decimales de PI.");
        } else {
            System.out.println("El número NO aparece en los primeros 1.000.000 decimales de PI.");
        }
    }
}


