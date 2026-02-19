package Tema6;

public class DVD extends FichaBiblioteca{
    private String director;
    private int ano;
    private String tipo;

    public DVD(){
        director = "";
        ano = 0;
        tipo = "";
    }

    public DVD(int numero, String titulo, String director, int ano, String tipo){
        super(numero, titulo);
        this.director = director;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return super.toString() + ", Director: " + director + ", Año: " + ano + ", Tipo: " + tipo;
    }
}
