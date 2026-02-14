package Tema5;

public class GatoMain {
    public static void main(String[] args) {

        // Crear un gato valido
        try {
            Gato g1 = new Gato("Misi", 3);
            System.out.println(g1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Crear un gato con nombre invalido
        try { Gato g2 = new Gato("Lu", 2);
             System.out.println(g2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //  Crear un gato con edad inválida
        try {
            Gato g3 = new Gato("Toby", -5);
            System.out.println(g3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Usar setters con valores válidos
        try {
            Gato g4 = new Gato("Luna", 1);
            g4.setNombre("Nieve");
            g4.setEdad(4);
            System.out.println(g4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Usar setters con valores inválidos
        try {
            Gato g5 = new Gato("Pipo", 2);
            g5.setNombre("A");
            g5.setEdad(-10);
            System.out.println(g5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
