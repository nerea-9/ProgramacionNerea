package Tema7.Serializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio3 {
    public static void main(String[] args) {

        String FileName = "src/Documentos/texto.txt";
        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FileName))){
            String linea;

            while ((linea = br.readLine()) != null ){
                // Separar la línea en palabras
                String[] trozos = linea.split(" ");

                // Sumar cuántas palabras tiene esta línea
                totalPalabras += trozos.length;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Total de palabras: " + totalPalabras);
    }
}
