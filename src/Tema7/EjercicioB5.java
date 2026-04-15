package Tema7;

import java.io.*;

public class EjercicioB5 {

    public static void main(String[] args) {

        // 1. Crear carpeta Diccionario
        File carpeta = new File("Diccionario");
        carpeta.mkdir();

        // 2. Crear los 26 archivos A.txt ... Z.txt
        File[] archivos = new File[26];
        BufferedWriter[] escritores = new BufferedWriter[26];

        try {
            for (int i = 0; i < 26; i++) {
                char letra = (char) ('A' + i);
                archivos[i] = new File(carpeta, letra + ".txt");
                escritores[i] = new BufferedWriter(new FileWriter(archivos[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Leer diccionario.txt
        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {

            String palabra;

            while ((palabra = br.readLine()) != null) {

                if (palabra.length() > 0) {

                    char inicial = Character.toUpperCase(palabra.charAt(0));

                    if (inicial >= 'A' && inicial <= 'Z') {

                        int indice = inicial - 'A';

                        escritores[indice].write(palabra);
                        escritores[indice].newLine();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Cerrar todos los escritores
        try {
            for (int i = 0; i < 26; i++) {
                if (escritores[i] != null) {
                    escritores[i].close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Diccionario generado correctamente.");
    }
}
