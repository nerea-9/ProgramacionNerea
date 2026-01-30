package Tema4.POO_1;

public class HeroMain {
    public static void main(String[] args) {
        Hero h1 = new Hero("Hero", 1, 100, 100, 0, 30, 20);
        Hero h2 = new Hero("Enemigo", 1, 80, 80, 0, 25, 15);
        h1.print();
        h2.print();
        h1.attack(h2);
        h2.attack(h1);
        h1.drinkPotion();
        h2.rest();
        h1.print();
        h2.print();
    }
}

