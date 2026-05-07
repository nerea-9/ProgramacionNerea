package RehacerTodoPrincipio.Tema1.Ejercicio3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero, para hacer factorial: ");
        int factorial = sc.nextInt();

        int acumulador = 1;

            if(factorial < 0){
                System.out.println("No se puede usar numeros en negativo");
            }else {
                for (int i = 1; i <= factorial; i++) {
                    acumulador *= i;

            }
                System.out.println(acumulador);
        }
        sc.close();
    }
}
