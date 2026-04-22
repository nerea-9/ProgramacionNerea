package Tema7.Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"));
                Persona persona2 = (Persona) ois.readObject();

                // Mostrar datos
                System.out.println("Nombre: " + persona2.nombre);
                System.out.println("Edad: " + persona2.edad);

                ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
