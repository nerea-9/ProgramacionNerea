package Tema7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioB3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del archivo de entrada: ");
        String archivoEntrada = sc.nextLine();

        System.out.print("Nombre del archivo de salida: ");
        String archivoSalida = sc.nextLine();

        String[] lineas = new String[300];
        int contador = 0;

        // Archivo A
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                lineas[contador] = linea;
                contador++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar Alfabeticamente
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (lineas[j].compareToIgnoreCase(lineas[j + 1]) > 0) {

                    String aux = lineas[j];
                    lineas[j] = lineas[j + 1];
                    lineas[j + 1] = aux;
                }
            }
        }

        // Archivo B
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            for (int i = 0; i < contador; i++) {
                bw.write(lineas[i]);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Archivo ordenado correctamente.");
    }
}

