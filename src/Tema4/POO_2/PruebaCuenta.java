package Tema4.POO_2;

import java.util.Scanner;

public class PruebaCuenta {

    public static void showMenu(){
        System.out.println("1. Instanciar objetos de tipo Persona" );
        System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona" );
        System.out.println("3. Mostrar datos de una persona" );
        System.out.println("4. Recibir la nómina mensual de una persona" );
        System.out.println("5. Recibir un pago" );
        System.out.println("6. Realizar transferencia entre cuentas" );
        System.out.println("7. Imprimir las personas morosas" );
        System.out.println("0. Salir" );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] listaPersonas = new Persona[10];

        int totalPersonas = 0;

        int opcion = -1;

        while (opcion != 0) {

            //meter en un procedimiento llamado showMenu()
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("DNI: " );
                    String dniNuevaPersona = sc.nextLine();
                    listaPersonas[totalPersonas] = new Persona(dniNuevaPersona);
                    totalPersonas++;
                    break;

                case 2:
                    System.out.print("DNI: " );
                    String dniParaCuenta = sc.nextLine();
                    System.out.print("Número de cuenta: " );
                    String numeroCuenta = sc.nextLine();
                    System.out.print("Saldo inicial: " );
                    double saldoInicial = sc.nextDouble();
                    sc.nextLine();
                    Cuenta nuevaCuenta = new Cuenta(numeroCuenta, saldoInicial);
                    for (int i = 0; i < totalPersonas; i++) {
                        if(listaPersonas[i].getDNI().equals(dniParaCuenta)) {
                            listaPersonas[i].addCuentas(nuevaCuenta);
                        }
                    }
                    break;
                case 3:
                    System.out.print("DNI: " );
                    String dniMostrar = sc.nextLine();
                    for (int i = 0; i < totalPersonas; i++) {
                        if (listaPersonas[i].getDNI().equals(dniMostrar)) {
                            System.out.println(listaPersonas[i]);
                        }
                    }
                    break;
                case 4:
                case 5:
                    System.out.print("DNI: " );
                    String dniIngreso = sc.nextLine();
                    System.out.print("Número de cuenta: " );
                    String cuentaIngreso = sc.nextLine();
                    System.out.print("Cantidad:" );
                    double cantidadIngreso = sc.nextDouble();
                    sc.nextLine();
                    for (int i = 0; i < totalPersonas; i++) {
                        if(listaPersonas[i].getDNI().equals(dniIngreso)) {

                            Cuenta[] cuentas = listaPersonas[i].getCuentaBancaria();
                            for (int j = 0; j < cuentas.length; j++) {
                                if (cuentas[j] != null && cuentas[j].getNumCuenta().equals(cuentaIngreso)) {
                                    cuentas[j].recibirAbono(cantidadIngreso);
                                }
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.print("DNI: ");
                    String dniOrigen = sc.nextLine();
                    System.out.print("Cuenta origen: ");
                    String cuentaOrigenTexto = sc.nextLine();
                    System.out.print("DNI destino: ");
                    String dniDestino = sc.nextLine();
                    System.out.print("Cuenta destino:");
                    String cuentaDestinoTexto = sc.nextLine();
                    System.out.print("Cantidad:");
                    double cantidadTransferencia = sc.nextDouble();
                    sc.nextLine();
                    Cuenta cuentaOrigen = null;
                    Cuenta cuentaDestino = null;
                    for (int i = 0; i < totalPersonas ; i++){
                    if(listaPersonas[i].getDNI().equals(dniOrigen)) {
                        Cuenta[] cuentas = listaPersonas[i].getCuentaBancaria();

                        for (int j = 0; j < cuentas.length ; j++){
                            if ( cuentas[j] != null && cuentas[j].getNumCuenta().equals(cuentaOrigenTexto)){
                                cuentaOrigen = cuentas[j];
                            }
                        }
                    }

                    if (listaPersonas[i].getDNI().equals(dniDestino)) {
                        Cuenta[] cuentas =     listaPersonas[i].getCuentaBancaria();
                        for (int j = 0; j < cuentas.length ;
                        j++){
                            if ( cuentas[j] != null && cuentas[j].getNumCuenta().equals(cuentaDestinoTexto)){
                                cuentaDestino = cuentas[j];
                            }
                        }
                    }
                }
                    if ( cuentaOrigen != null && cuentaDestino != null) {
                        cuentaOrigen.pagarRecibo(cantidadTransferencia);
                        cuentaDestino.recibirAbono(cantidadTransferencia);
                    }
                    break;

                case 7:
                    for (int i = 0; i < totalPersonas ; i++){
                    if (listaPersonas[i].isMorosa()) {
                        System.out.println(listaPersonas[i]);
                    }
                }
                break;
            }
        }
    }
}