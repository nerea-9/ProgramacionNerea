package Tema5;

import java.util.ArrayList;

public class GestionarCola {
   private static ArrayList<UsuarioBanco> cola = new ArrayList<>();

    public void addUsuario(UsuarioBanco usuario){
        cola.add(usuario);
        System.out.println("Añadido a la cola: " + usuario);
    }

    public void attendUsuario(UsuarioBanco usuario){

    }












    public static void main(String[] args) {
        cola.add(new UsuarioBanco("Juan", 56, "53562891D"));
        cola.add(new UsuarioBanco("Maria", 34, "54237623S"));
        cola.add(new UsuarioBanco("Paco", 34, "34269812W"));
        cola.add(new UsuarioBanco("Belen", 34, "10456525A"));
    }





}
