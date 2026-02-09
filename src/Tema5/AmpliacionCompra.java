package Tema5;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class AmpliacionCompra {
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
            System.out.println("El producto se ha añadido");
        }

        for (String producto : compras){
            System.out.println(producto);
        }

        System.out.println("La compra es: " + compras.size());

    ///////////////////////////////////////////////////////////////////////

        Set<String> carro =  new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Que producto quieres meter al carro?: ");
        String productoCarro = sc.nextLine();

        if (compras.contains(productoCarro)){
            carro.add(productoCarro);
            System.out.println("Producto añadido al carro");
        } else {
            System.out.println("El producto no está en la lista de compras");
        }

        System.out.println("Productos en el carro: ");
        System.out.println(carro);

    //////////////////////////////////////////////////////////////////////

        Set<String> faltan = new HashSet<>(compras);

        faltan.removeAll(carro); System.out.println("Productos que faltan por añadir: ");
        System.out.println(faltan);
    }
}

