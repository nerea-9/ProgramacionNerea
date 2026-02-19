package Tema6;

public class AtaqueEspadazo implements AtaqueAvanzado{

    @Override
    public void lanzarAtaque(){
        System.out.println("Lanzar ataque espadazo");
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
