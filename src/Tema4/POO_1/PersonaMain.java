package Tema4.POO_1;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre:");
        String n1 = sc.nextLine();
        System.out.println("Introduce apellidos:");
        String a1 = sc.nextLine();
        System.out.println("Introduce edad:");
        int e1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce DNI:");
        String d1 = sc.nextLine();
        Persona p1 = new Persona(n1, a1, e1, d1);
        System.out.println("Introduce nombre:");
        String n2 = sc.nextLine();
        System.out.println("Introduce apellidos:");
        String a2 = sc.nextLine();
        System.out.println("Introduce edad:");
        int e2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce DNI:");
        String d2 = sc.nextLine();
        Persona p2 = new Persona(n2, a2, e2, d2);
        p1.print();
        p2.print();
        System.out.println("Persona 1 adulta: " + p1.isAdult());
        System.out.println("Persona 2 adulta: " + p2.isAdult());
        System.out.println("Persona 1 jubilada: " + p1.isRetired());
        System.out.println("Persona 2 jubilada: " + p2.isRetired());
        System.out.println("Diferencia de edad: " + p1.ageDifference(p2));
        System.out.println("DNI 1 correcto: " + Persona.checkDNI(p1.getDNI()));
        System.out.println("DNI 2 correcto: " + Persona.checkDNI(p2.getDNI()));
        sc.close();
    }

}