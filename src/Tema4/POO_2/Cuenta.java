package Tema4.POO_2;
public class Cuenta {
    // Usar constantes cuando un número no cambia y es una regla fija
// Ejemplos: edad mínima, daño mínimo, curación, límites, etc (sin magic numbers)
    // Atributos
    private String numCuenta;
    private double saldo;

    // Constructor vacío
    public Cuenta() {
        numCuenta = "";
        saldo = 0;
    }

    // Constructor con parametros
    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getNumCuenta() {
        return numCuenta;
    }

    // public void setNumCuenta(String numCuenta) {this.numCuenta =numCuenta;}
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {this.saldo = saldo;}


    // Metodos
    // Sumar lo abonado
    public void recibirAbono(double cantidad) {
        saldo += cantidad;
    }

    // Dejar que haya saldo en negativo
    public void pagarRecibo(double cantidad) {
        saldo -= cantidad;
    }

    // No dejar que haya saldo en negativo
    // public boolean pagarRecibo(double cantidad){
    //if (saldo &gt;= cantidad){
    // saldo -= cantidad;
    // return true;
    // }
    // return false;
    //}

    // Imprime la información
    public void consultarSaldo() {
        System.out.println(this.toString());
    }

    // Devuelve información como texto
    public String toString(){
        return "Cuenta: " + numCuenta + ", Saldo: " + saldo;
    }
}