package Tema7.Serializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {

        String FileName = "src/Documentos/usuario.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(FileName))){

            String linea;

            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
