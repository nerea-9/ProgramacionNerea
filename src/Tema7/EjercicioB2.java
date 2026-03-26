package Tema7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioB2 {

    public static void main(String[] args) {

        String[] nombres = new String[10];
        double[] medias = new double[10];
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("alumnos_notas.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(" ");

                // Nombre y apellido
                String nombreCompleto = partes[0] + " " + partes[1];

                double suma = 0;
                int cantidadNotas = partes.length - 2;

                // Calcular suma de notas
                for (int i = 2; i < partes.length; i++) {
                    suma += Integer.parseInt(partes[i]);
                }

                double media = suma / cantidadNotas;

                nombres[contador] = nombreCompleto;
                medias[contador] = media;
                contador++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (medias[j] < medias[j + 1]) {
                    double auxMedia = medias[j];
                    medias[j] = medias[j + 1];
                    medias[j + 1] = auxMedia;

                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                }
            }
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(nombres[i] + " → media: " + medias[i]);
        }
    }
}

