package Tema3;

public class Ejercicio9 {


    public static void dibujarTriangulo(char c, int lineas) {
        for (int i = 0; i < lineas; i++) {
            int numCaracteres = 2 * i + 1;


            for (int j = 0; j < numCaracteres; j++) {
                System.out.print(c);
            }

        }
    }

    public static void main(String[] args) {

        dibujarTriangulo('a', 4);
    }
}


