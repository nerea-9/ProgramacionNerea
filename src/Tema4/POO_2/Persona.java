package Tema4.POO_2;
public class Persona {
    // Usar constantes cuando un número no cambia y es una regla fija
    // Ejemplos: edad mínima, daño mínimo, curación, límites, etc (sin magic numbers)
    // Atributos
    private String DNI;
    private Cuenta[] cuentaBancaria;
    private final static int maxCuentas=3;

    // Constructor vacío
    public Persona(){
        DNI= "";
        cuentaBancaria = new Cuenta[maxCuentas];
    }
    // Constructor con parametros
    public Persona(String DNI){
        this.DNI=DNI;
    }

    // Getters y setters
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {this.DNI = DNI;}

    public Cuenta[] getCuentaBancaria() {
        return cuentaBancaria;
    }
    public Cuenta[] setCuentaBancaria(){return this.cuentaBancaria;}

// Metodos
    //SOLO HAY UN RETURN
    public boolean addCuentas(Cuenta cuenta){
        boolean seAnyade  = false;

        for (int i = 0; i < maxCuentas; i++){
            if (cuentaBancaria [i] == null && !seAnyade){
                cuentaBancaria [i] = cuenta;
                seAnyade = true;
            }
        }
        return seAnyade;
    }

    public boolean isMorosa(){
        boolean morosa  = false;

        for (int i = 0; i < maxCuentas; i++){
            if (cuentaBancaria [i] != null &&
                cuentaBancaria[i].getSaldo() < 0){
                morosa = true;
            }
        }
        return morosa;
    }

    // Imprime la información
    //    public void print() {System.out.println(this.toString());}

    // Devuelve información como texto
    public String toString(){
        return "DNI: " + DNI + "CuentaBancaria: "  + cuentaBancaria;
    }
}