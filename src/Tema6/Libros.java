package Tema6;

public class Libros extends FichaBiblioteca{

    private String autor;
    private String editorial;

    public Libros(){
        autor = "";
        editorial = "";
    }

    public Libros(int numero, String titulo, String autor, String editorial){
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String toString(){
        return super.toString() + ", Autor: " + autor + ", Editorial: " + editorial;
    }

}
