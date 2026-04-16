package Tema7.EjerciciosB;

import java.io.*;

public class EjercicioB7 {

    public static void main(String[] args) {

        String archivo = "lazarillo.txt";  // Cambia el nombre si quieres

        int lineas = 0;
        int palabrasTotales = 0;
        int caracteres = 0;

        // Arrays para contar palabras
        String[] palabras = new String[50000];
        int[] contador = new int[50000];
        int totalDistintas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                lineas++;
                caracteres += linea.length();

                String[] trozos = linea.split(" ");

                for (int i = 0; i < trozos.length; i++) {

                    String p = trozos[i].toLowerCase().trim();

                    if (p.length() > 0) {

                        palabrasTotales++;

                        int pos = -1;

                        for (int j = 0; j < totalDistintas; j++) {
                            if (palabras[j].equals(p)) {
                                pos = j;
                                break;
                            }
                        }

                        if (pos != -1) {
                            contador[pos]++;
                        } else {
                            palabras[totalDistintas] = p;
                            contador[totalDistintas] = 1;
                            totalDistintas++;
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("ERROR: No se pudo leer el archivo.");
            return;
        }

        // ORDENAR POR FRECUENCIA (burbuja)
        for (int i = 0; i < totalDistintas - 1; i++) {
            for (int j = 0; j < totalDistintas - 1 - i; j++) {
                if (contador[j] < contador[j + 1]) {

                    int aux = contador[j];
                    contador[j] = contador[j + 1];
                    contador[j + 1] = aux;

                    String auxP = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = auxP;
                }
            }
        }

        // RESULTADOS
        System.out.println("Número de líneas: " + lineas);
        System.out.println("Número de palabras: " + palabrasTotales);
        System.out.println("Número de caracteres: " + caracteres);

        System.out.println("\nLas 10 palabras más comunes:");

        for (int i = 0; i < 10 && i < totalDistintas; i++) {
            System.out.println(palabras[i] + " → " + contador[i]);
        }
    }
}
