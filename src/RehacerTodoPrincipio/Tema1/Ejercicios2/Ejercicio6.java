package RehacerTodoPrincipio.Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del artículo: ");
        int precioA = sc.nextInt();


        System.out.println("Introduce el precio de venta real: ");
        int precioV = sc.nextInt();

        double descuento = (precioA - precioV) * 100.0 / precioA;


        System.out.println("El porcenaje de descuento es: " + descuento + "%");
    }
}
