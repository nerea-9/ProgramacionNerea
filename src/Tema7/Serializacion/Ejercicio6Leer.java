package Tema7.Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ejercicio6Leer {
    public static void main(String[] args) {

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("persona.dat"));

            ArrayList<Persona> lista =
                    (ArrayList<Persona>) ois.readObject();

            ois.close();

            for (Persona p : lista) {
                System.out.println("Nombre: " + p.nombre);
                System.out.println("Edad: " + p.edad);
                System.out.println("-------------------");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

