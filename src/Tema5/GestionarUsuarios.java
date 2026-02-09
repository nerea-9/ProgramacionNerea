package Tema5;

import java.util.HashMap;
import java.util.Map;

public class GestionarUsuarios {

    public static void altaUsuario(Map<String, UsuarioGym> usuarios, String dni, String nombre, int edad) {
        if (usuarios.containsKey(dni)) {
            System.out.println("Ese usuario ya existe");
        } else {
            usuarios.put(dni, new UsuarioGym(nombre, edad));
            System.out.println("Usuario añadido correctamente");
        }
    }

    public static void bajaUsuario(Map<String, UsuarioGym> usuarios, String dni) {
        if (usuarios.containsKey(dni)) {
            usuarios.remove(dni);
            System.out.println("Usuario dado de baja correctamente");
        } else {
            System.out.println("No existe el usuario");
        }
    }

    public static void modificarUsuario(Map<String, UsuarioGym> usuarios, String dni, String nombre, int edad) {
        if (usuarios.containsKey(dni)) {
            usuarios.put(dni, new UsuarioGym(nombre, edad));
            System.out.println("Usuario modificado");
        } else {
            System.out.println("No existe el usuario");
        }
    }

    public static void mostrarUsuario(Map<String, UsuarioGym> usuarios, String dni) {
        if (usuarios.containsKey(dni)) {
            System.out.println(usuarios.get(dni));
        } else {
            System.out.println("No existe el usuario");
        }
    }

    public static void mostrarTodos(Map<String, UsuarioGym> usuarios) {
        for (Map.Entry<String, UsuarioGym> entrada : usuarios.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public static void main(String[] args) {

        Map<String, UsuarioGym> usuarios = new HashMap<>();
        usuarios.put("54678945J", new UsuarioGym("Juan", 40));
        usuarios.put("53668040H", new UsuarioGym("Maria", 20));
        usuarios.put("45769021L", new UsuarioGym("Paco", 33));
        usuarios.put("32564510A", new UsuarioGym("Carmen", 55));

        String usuario = "54678945J";

        if (usuarios.containsKey(usuario)) {
            System.out.println("DNI de " + usuario + " es: " + usuarios.get(usuario));
        } else {
            System.out.println(usuario + " no está en el mapa.");
        }

        for (Map.Entry<String, UsuarioGym> entrada : usuarios.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }


            altaUsuario(usuarios, "999X", "Nuevo", 30);

            bajaUsuario(usuarios, "45769021L");

            mostrarUsuario(usuarios, "53668040H");

            modificarUsuario(usuarios, "54678945J", "Juan Carlos", 41);

            mostrarTodos(usuarios);
    }
}
