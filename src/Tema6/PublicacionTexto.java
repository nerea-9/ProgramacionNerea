package Tema6;

public class PublicacionTexto implements Publicacion, PubliReaccion {

    @Override
    public void publicar(){
        System.out.println("Publicar texto");
    }

    @Override
    public void compartir(){
        System.out.println("Compartir texto");
    }

    @Override
    public void comentar(){
        System.out.println("Comentar texto");
    }
}
