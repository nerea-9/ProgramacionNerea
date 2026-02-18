package Tema6;

public class Revistas extends FichaBiblioteca{
    private int numPublicacion;
    private int ano;

    public Revistas(){
        numPublicacion = 0;
        ano = 0;
    }

    public Revistas(int numero, String titulo, int numPublicacion, int ano){
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.ano  = ano;
    }

    public int getNumPublicacion(){
        return numPublicacion;
    }
    public void setNumPublicacion(int numPublicacion){
        this.numPublicacion = numPublicacion;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return super.toString() + ", NumeroPublicacion: " + numPublicacion + "Año: " + ano;
    }
}
