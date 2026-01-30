package Tema3;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean validarRadius(double radius) {

        return radius > 0;
    }

    public static double calcularPerimetroCirculo(double radius) {

        return 2 * Math.PI * radius;
    }

    public static double calcularAreaCirculo(double radius) {

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;

        System.out.print("Introduce el radio del círculo (> 0): ");
        radio = sc.nextDouble();

        if (validarRadius(radio)) {
            double perimetro = calcularPerimetroCirculo(radio);
            double area = calcularAreaCirculo(radio);

            System.out.println("Perímetro del círculo: " + perimetro);
            System.out.println("Área del círculo: " + area);
        } else {
            System.out.println("El radio no es válido. Debe ser mayor que 0.");
        }

        sc.close();
    }
}

