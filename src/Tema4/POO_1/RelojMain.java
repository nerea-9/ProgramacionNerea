package Tema4.POO_1;

public class RelojMain {
    public static void main(String[] args) {

        Reloj r1 = new Reloj(22, 15, 10, true);
        Reloj r2 = new Reloj(22, 15, 10, false);

       System.out.println(r1);
       System.out.println(r2);
    }
}
