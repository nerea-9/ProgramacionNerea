package Tema4.POO_1;

import java.util.Random;

public class PruebaHero {
    public static void main(String[] args){

        Random r = new Random();

        Hero jugador = new Hero("Jugador", 1, 200, 200, 0, 20, 10);

        int hordasSuperadas = 0;

        while (jugador.getHealth() > 0){

            hordasSuperadas = hordasSuperadas + 1;

            Hero[] enemigos = new Hero[3];

            int numeroEnemigos = r.nextInt(3) + 1;

            for (int i = 0; i < 3; i++){
                if (i < numeroEnemigos){
                    enemigos[i] = new Hero("Enemigo" + i, 1, 50, 50, 0, 10, 5);
                } else {
                    enemigos[i] = null;
                }
            }

            for (int i = 0; i < 3; i++){
                if (enemigos[i] != null){
                    double numAleatorio = r.nextDouble();
                    if (numAleatorio < 0.10){
                        enemigos[i].setHealth(0);
                    }
                }
            }


            while (jugador.getHealth() > 0){

                Hero enemigoActual = null;

                for (int i = 0; i < 3; i++){
                    if (enemigos[i] != null && enemigos[i].getHealth() > 0){
                        enemigoActual = enemigos[i];
                    }
                }

                if (enemigoActual == null){
                    jugador.setHealth(1);
                    jugador.setHealth(0);
                } else {
                    jugador.attack(enemigoActual);

                    if (enemigoActual.getHealth() <= 0){
                        enemigoActual.setHealth(0);
                    }

                    for (int i = 0; i < 3; i++){
                        if (enemigos[i] != null && enemigos[i].getHealth() > 0){
                            enemigos[i].attack(jugador);
                        }
                    }
                }
            }

            if (jugador.getHealth() > 0){

                double numDescanso = r.nextDouble();
                if (numDescanso < 0.001){
                    jugador.rest();
                }

                double numPocion = r.nextDouble();
                if (numPocion < 0.10){
                    jugador.drinkPotion();
                }
            }
        }

        System.out.println("Has sobrevivido a " + hordasSuperadas + " hordas.");
    }
}


