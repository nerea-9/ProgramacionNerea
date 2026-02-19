package Tema6;

public class AtaqueBolaFuego implements AtaqueAvanzado{

    @Override
    public void  lanzarAtaque(){
        System.out.println("Lanzar un ataque bola fuego");
    }

    @Override
    public void coste(){
        System.out.println("Coste del ataque tanto en maná, como en esfuerzo fisico");
    }

    @Override
    public void danoInfligido(){
        System.out.println("Daño infligido por ataque magico y fisico");
    }
}
