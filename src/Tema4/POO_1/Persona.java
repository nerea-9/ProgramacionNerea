package Tema4.POO_1;

public class Persona {
    // Usar constantes cuando un número no cambia y es una regla fija
    // Ejemplos: edad mínima, daño mínimo, curación, límites, etc (sin magic numbers)
    private static final int adultAge=18;
    private static final int retiredAge=65;

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private final String DNI;

    // Constructor vacío
    public Persona(){
        nombre = "";
        apellidos = "";
        edad = 0;
        DNI = "";
    }

    // Constructor con parametros
    public Persona(String nombre, String apellidos, int edad, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
    }

    // Getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getDNI(){
        return DNI;
    }
   // public void setDNI(int DNI){}

    // Metodos

    // Comprobar si es adulto o no
    public boolean isAdult(){
        return edad >= adultAge;
    }

    // Comprobar si esta jubilado o no
    public boolean isRetired(){
        return edad >= retiredAge;
    }

    // Saber la diferencia de edad entre personas
    public int ageDifference(Persona otraPersona){
        if (this.edad > otraPersona.edad){
            return this.edad - otraPersona.edad;
        }else {
            return otraPersona.edad - this.edad;
        }

    }

    // Comprobar que tenga 9 caracteres
    public static boolean checkDNI(String DNI){
    //añadir comprobación de letra
        if (DNI.length() == 9) {
            String numeros = DNI.substring(0, 8);

            // Convertir a mayúscula para que acepte tanto 'a' como 'A'
            char letraIntroducida = Character.toUpperCase(DNI.charAt(8));

            int num = Integer.parseInt(numeros);

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraCorrecta = letras.charAt(num % 23);

            if (letraIntroducida != letraCorrecta) {
                return false;
            }
        }
        return DNI.length() == 9;
    }

    // Imprime la información
    public void print() {
        System.out.println(this.toString());
    }

    // Devuelve información como texto
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad + ", DNI: " + DNI;
    }
}


