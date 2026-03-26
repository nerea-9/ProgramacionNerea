package Tema7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioB1 {
    public static void main(String[] args) {
        String FileName = "src/Documentos/numeros.txt";

        int min = Integer.parseInt(FileName);
        int max = min;


        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {

            while ((FileName = br.readLine()) != null) {
                int n = Integer.parseInt(FileName);

                if (n > max) max = n;
                if (n < min) min = n;
            }

            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);

        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        }

    }
}
