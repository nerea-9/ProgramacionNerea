package Tema5;


import java.util.Scanner;
import java.util.ArrayList;

public class RegistroAnimales {

    public static void showMenu(){
        System.out.println("1. Añadir avistamiento. Añade un avistamiento al listado");
        System.out.println("2. Mostrar todos los avistamientos a partir de las 8 horas");
        System.out.println("3. Mostrar todos los avistamientos nocturnos (entre las 20 y las 8)");
        System.out.println("4. Mostrar manadas. Mostrará las manadas de lobos");
        System.out.println("5. Mostrar serpientes. Mostrará las serpientes");
        System.out.println("6. Mostrar pájaros. Mostrará los pájaros");
        System.out.println("0. Salir" );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Avistamiento> lista = new ArrayList<>();

        int opcion = -1;

        while (opcion != 0) {

            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {

                case 1:

            }


        }














    }





}
