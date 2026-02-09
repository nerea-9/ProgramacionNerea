package Tema5;

import java.util.ArrayList;

public class GestionarCola {
   private static ArrayList<UsuarioBanco> cola = new ArrayList<>();

    public void addUsuario(UsuarioBanco usuario){
        cola.add(usuario);
        System.out.println("Añadido a la cola: " + usuario);
    }

    public void attendUsuario() {
        if(cola.isEmpty()){
            System.out.println("La cola esta vacía");
        }
        else {
            UsuarioBanco usuario = cola.get(0);
            cola.remove(0);
            System.out.println("Atendido: "  + usuario);
        }
    }

    public void tiredUsuario(int position) {
        UsuarioBanco usuario = null;

        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        } else if (position < 0 || position >= cola.size()) {
            System.out.println("Posición no es valida");
        } else {
            usuario = cola.get(position);
            cola.remove(position);
            System.out.println("Se ha ido de la cola: " + usuario);
        }
    }

    public static void main(String[] args) {
        GestionarCola gestionar = new GestionarCola();

        cola.add(new UsuarioBanco("Juan", 56, "53562891D"));
        cola.add(new UsuarioBanco("Maria", 34, "54237623S"));
        cola.add(new UsuarioBanco("Paco", 44, "34269812W"));
        cola.add(new UsuarioBanco("Belen", 24, "10456525A"));

        System.out.println("Cola actual:"); System.out.println(cola);
        System.out.println("Atender al primero: "); gestionar.attendUsuario();
        System.out.println("Cola después de atender: "); System.out.println(cola);
        System.out.println("Quitando al usuario en posición 1 (Por ejemplo)"); gestionar.tiredUsuario(1);
        System.out.println("Cola final: "); System.out.println(cola);
    }
}
