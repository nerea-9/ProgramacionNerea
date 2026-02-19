package Tema6;

public class PublicacionFoto implements Publicacion, AbrirPublicacion, PubliReaccion {

    @Override
    public void publicar() {
        System.out.println("Publicar foto");
    }

    @Override
    public void compartir() {
        System.out.println("Compartir foto");
    }

    @Override
    public void abrir() {
        System.out.println("Abrir foto");
    }

    @Override
    public void comentar() {
        System.out.println("Comentar foto");
    }
}

