package Tema6;

public class FichaBiblioteca {
    private int numero;
    private String titulo;

    public FichaBiblioteca(){
        numero = numero;
        titulo = titulo;
    }

    public FichaBiblioteca(int numero, String titulo){
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String toString(){
        return "Numero: " + numero + ", Titulo: " + titulo;
    }













}
