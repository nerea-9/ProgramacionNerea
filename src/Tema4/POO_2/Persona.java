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
        DNI= "";;
        cuentaBancaria= new Cuenta[maxCuentas];
    }
    // Constructor con parametros
    public Persona(String DNI){
        this.DNI=DNI;
    }
    // Getters y setters
    public String getDNI() {
        return DNI;
    }
    //public void setDNI(String DNI) {this.DNI = DNI;}
    public Cuenta[] getCuentaBancaria() {
        return cuentaBancaria;
    }
    //public Cuenta[] setCuentaBancaria(){return this.cuentaBancaria;}
// Metodos
    public boolean addCuentas(Cuenta cuenta){
        for (int i = 0; i < maxCuentas; i++){
            if (cuentaBancaria [i] == null){
                cuentaBancaria [i] = cuenta;
                return true;
            }
        } return false;
    }
    public boolean isMorosa(){
        for (int i = 0; i < maxCuentas; i++){
            if (cuentaBancaria [i] != null &&
                cuentaBancaria[i].getSaldo() < 0){
                return true;
            }
        }return false;
    }

    // Imprime la información
    public void print() {
        System.out.println(this.toString());
    }
    // Devuelve información como texto
    public String toString(){
        return "DNI: " + DNI + "CuentaBancaria: "  + cuentaBancaria;
    }
}