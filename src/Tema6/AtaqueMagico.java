package Tema6;

public class AtaqueMagico implements Ataque{

    @Override
    public void lanzarAtaque(){
        System.out.println("Lanzar ataque magico");
    }

    @Override
    public void coste(){
        System.out.println("Coste del ataque magico");
    }

    @Override
    public void danoInfligido(){
        System.out.println("Daño infligido por ataque magico");
    }
}
