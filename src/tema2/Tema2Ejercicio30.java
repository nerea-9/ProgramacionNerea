package tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora simple (escribe 'q' para salir)");

        while (true) {
            System.out.print("Introduce el primer número: ");
            if (sc.hasNext("q")) break;
            double num1 = sc.nextDouble();

            System.out.print("Introduce la operación (+, -, *, /, %): ");
            String op = sc.next();

            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            switch (op) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/": resultado = num1 / num2; break;
                case "%": resultado = num1 % num2; break;
            }

            System.out.println("Resultado: " + resultado);
        }

        System.out.println("Fin de la calculadora.");
    }
}


