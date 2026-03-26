package Tema7;

import java.io.*;
import java.util.Scanner;

public class EjercicioB4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos nombres de persona deseas generar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.print("A que archivo deseas añadirlo: ");
        String addArchivo = sc.nextLine();

        String[] nombres = new String[200];
        String[] apellidos = new String[200];

        int contadorNombres = 0;
        int contadorApellidos = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("usa_nombres.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nombres[contadorNombres] = linea;
                contadorNombres++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("usa_apellidos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                apellidos[contadorApellidos] = linea;
                contadorApellidos++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(addArchivo, true))) {

            for (int i = 0; i < cantidad; i++) {

                int nombre = (int)(Math.random() * contadorNombres);
                int apellido = (int)(Math.random() * contadorApellidos);

                String completo = nombres[nombre] + " " + apellidos[apellido];

                bw.write(completo);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nombres generados correctamente.");
    }
}
