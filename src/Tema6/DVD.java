package Tema6;

public class DVD extends FichaBiblioteca{
    private String director;
    private int ano;
    private boolean tipo;

    public DVD(){
        director = "";
        ano = 0;
        tipo = false;
    }

    public DVD(int numero, String titulo, String director, int ano, boolean tipo){
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

    public boolean getTipo(){
        return tipo;
    }
    public void setTipo(boolean tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return super.toString() + ", Director: " + director + ", Año: " + ano + ", Tipo: " + tipo;
    }

}
