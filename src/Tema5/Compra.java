package Tema5;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Compra {
    public static void main(String[] args) {

        Set<String> compras =  new HashSet<>();
        compras.add("Leche");
        compras.add("Huevos");
        compras.add("Pan");
        compras.add("Cafe");
        compras.add("Jamon");
        compras.add("Jamon");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un producto: ");
        String compra = scanner.nextLine();

        if (compras.contains(compra)){
            System.out.println("EL producto ya existe");
        } else {
            compras.add(compra);
        }

        for (String producto : compras){
            System.out.println(producto);
        }

        System.out.println("La compra es: " + compras.size());
    }

}






















