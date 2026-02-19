package Tema6;

public class AtaqueFisico implements Ataque{

    @Override
    public void lanzarAtaque(){
        System.out.println("Lanzar ataque fisico");
    }

    @Override
    public void coste(){
        System.out.println("Coste del ataque fisico");
    }

    @Override
    public void danoInfligido(){
        System.out.println("Daño infligido por ataque fisico");
    }
}
