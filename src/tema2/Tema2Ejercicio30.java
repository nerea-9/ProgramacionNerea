package tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;
        double num1, num2, resultado;

        System.out.println("Calculadora simple (escribe 'q' como operación para salir)");

        do {
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextDouble();

            System.out.print("Introduce la operación (+, -, *, /, % o q para salir): ");
            operacion = sc.next();

            if (operacion.equals("q")) break;

            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextDouble();

            switch (operacion) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/": resultado = num1 / num2; break;
                case "%": resultado = num1 % num2; break;
                default:
                    System.out.println("Operación no válida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
            System.out.println();

        } while (!operacion.equals("q"));

        System.out.println("Fin de la calculadora.");
        sc.close();
    }
}




