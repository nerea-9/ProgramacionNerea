package Tema7.Ficheros;

import Tema5.Avistamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class FunkoMain {
    public static void showMenu(){
        System.out.println("1. Añadir funko");
        System.out.println("2. Borrar funko");
        System.out.println("3. Mostrar todos los funkos)");
        System.out.println("4. Mostrar el funko más caro.");
        System.out.println("5. Mostrar la media de precio de los funkos");
        System.out.println("6. Mostrar los funkos agrupados por modelos");
        System.out.println("7. Mostrar los funkos de 2023.");
        System.out.println("0. Salir" );
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funko> lista = new ArrayList<>();

        int opcion = -1;

        while (opcion != 0) {

            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("Codigo del funko: ");
                    String  codigo = sc.nextLine();

                    System.out.println("Nombre del Funko: ");
                    String nombre =  sc.nextLine();

                    System.out.println("Modelo del Funko: ");
                    String modelo =  sc.nextLine();

                    System.out.println("Precio del Funko: ");
                    double precio =  sc.nextInt();

                    System.out.println("Fecha del Funko: ");
                    int fecha =  sc.nextInt();

                    break;

                case 2:
                    for(Funko funko : lista){
                        if(funko != null)
                            System.out.println(funko);
                    }
                    break;

                case 3:
                    for(int i = 0; i < lista.size(); i++){
                    System.out.println(lista.get(i));
                    }
                break;

                case 4:
                    for(int i = 0; i > lista.size(); i++){
                        System.out.println(lista.get(i));
                    }
                    break;

            }
        }
    }
}
