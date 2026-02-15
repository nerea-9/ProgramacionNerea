package Tema5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayGatoMain {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (gatos.size() < 5) {
            try {
                System.out.println("Introduce el nombre del gato: ");
                String nombre = sc.nextLine();

                System.out.println("Introduce la edad del gato: ");
                int edad = sc.nextInt();
                sc.nextLine();

                Gato g = new Gato(nombre, edad);
                gatos.add(g);

                System.out.println("Gato añadido correctamente");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Vuelve a intentarlo");
            }
        }

        System.out.println("Lista de gatos válidos: ");
        for (Gato g : gatos) {
            System.out.println(g);
        }
    }
}
