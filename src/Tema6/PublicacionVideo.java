package Tema6;

public class PublicacionVideo implements Publicacion, AbrirPublicacion, PubliReaccion {

    @Override
    public void publicar() {
        System.out.println("Publicar video");
    }

    @Override
    public void compartir() {
        System.out.println("Compartir video");
    }

    @Override
    public void abrir() {
        System.out.println("Abrir video");
    }

    @Override
    public void comentar() {
        System.out.println("Comentar video");
    }
}

