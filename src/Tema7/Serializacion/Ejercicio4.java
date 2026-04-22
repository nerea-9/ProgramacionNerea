package Tema7.Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio4 {
    public static void main(String[] args) {

        Persona p = new Persona("Ximo", 25);

        try {
            FileOutputStream fos = new FileOutputStream("persona.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

