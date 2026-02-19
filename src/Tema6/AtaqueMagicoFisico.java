package Tema6;

public class AtaqueMagicoFisico implements Ataque {

    @Override
    public void lanzarAtaque(){
        System.out.println("Lanzar ataque magico y fisico");
    }

    @Override
    public void coste(){
        System.out.println("Coste del ataque magico y fisico");
    }

    @Override
    public void danoInfligido(){
        System.out.println("Daño infligido por ataque magico y fisico");
    }
}
