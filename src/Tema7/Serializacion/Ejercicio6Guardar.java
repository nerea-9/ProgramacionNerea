package Tema7.Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio6Guardar {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 56));
        personas.add(new Persona("Paco", 76));
        personas.add(new Persona("Maria", 34));
        personas.add(new Persona("Carla", 23));

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("persona.dat"));

            oos.writeObject(personas);

            oos.close();

            System.out.println("Lista guardada");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}