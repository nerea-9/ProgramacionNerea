package tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("Los 20 primeros números primos son:");
        while (count < 20) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}

