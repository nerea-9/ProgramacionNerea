package Tema3;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENÚ EJERCICIOS ");
            System.out.println("1) Mostrar signo de un número");
            System.out.println("2) Indicar si es mayor de edad (usando signo + isAdult)");
            System.out.println("3) Área y perímetro de un círculo");
            System.out.println("4) Conversor euros/dólares");
            System.out.println("5) Tabla de multiplicar de un número");
            System.out.println("6) Tablas del 1 al 10");
            System.out.println("7) Comprobar números primos");
            System.out.println("8) Comprobar fecha");
            System.out.println("9) Dibujar triángulos");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int n = sc.nextInt();
                    if (n > 0) System.out.println("El número es positivo.");
                    else if (n < 0) System.out.println("El número es negativo.");
                    else System.out.println("El número es cero.");
                    break;

                case 2:
                    System.out.print("Introduce un número: ");
                    int n2 = sc.nextInt();
                    if (n2 > 0) System.out.println("El número es positivo.");
                    else if (n2 < 0) System.out.println("El número es negativo.");
                    else System.out.println("El número es cero.");

                    System.out.print("Introduce tu edad: ");
                    int edad = sc.nextInt();
                    if (edad >= 18) System.out.println("Eres mayor de edad.");
                    else System.out.println("Eres menor de edad.");
                    break;

                case 3:
                    System.out.print("Introduce el radio: ");
                    double radio = sc.nextDouble();
                    if (radio > 0) {
                        System.out.println("Perímetro: " + (2 * Math.PI * radio));
                        System.out.println("Área: " + (Math.PI * radio * radio));
                    } else {
                        System.out.println("El radio debe ser mayor que 0.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce cantidad: ");
                    double cantidad = sc.nextDouble();
                    System.out.print("¿Convertir a (1) dólares o (2) euros?: ");
                    opcion = sc.nextInt();
                    double cambio = 1.08;
                    if (opcion == 1) System.out.println(cantidad + "€ = " + (cantidad * cambio) + "$");
                    else if (opcion == 2) System.out.println(cantidad + "$ = " + (cantidad / cambio) + "€");
                    else System.out.println("Opción inválida.");
                    break;

                case 5:
                    System.out.print("Introduce un número: ");
                    int tablaMultiplicar = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tablaMultiplicar + " x " + i + " = " + (tablaMultiplicar * i));
                    }
                    break;

                case 6:
                    for (int Multiplicar = 1; Multiplicar <= 10; Multiplicar++) {
                        System.out.println("Tabla del " + Multiplicar);
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(Multiplicar + " x " + i + " = " + (Multiplicar * i));
                        }
                    }
                    break;

                case 7:
                    System.out.print("Introduce un número: ");
                    int numero = sc.nextInt();
                    boolean primo = true;
                    if (numero <= 1) primo = false;
                    else {
                        for (int i = 2; i <= numero; i++) {
                            if (numero % i == 0) {
                                primo = false;
                                break;
                            }
                        }
                    }
                    if (primo) System.out.println(numero + " es primo.");
                    else System.out.println(numero + " no es primo.");
                    break;

                case 8:
                    System.out.print("Introduce el día (1-31): ");
                    int dia = sc.nextInt();

                    System.out.print("Introduce el mes (1-12): ");
                    int mes = sc.nextInt();

                    System.out.print("Introduce el año: ");
                    int ano = sc.nextInt();

                    boolean fechaCorrecta = true;

                    if (mes < 1 || mes > 12) {
                        fechaCorrecta = false;
                    } else {
                        int diasMes;

                        switch (mes) {
                            case 4: case 6: case 9: case 11:
                                diasMes = 30;
                                break;
                            case 2:
                                // Año bisiesto
                                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                                    diasMes = 29;
                                } else {
                                    diasMes = 28;
                                }
                                break;
                            default:
                                diasMes = 31;
                                break;
                        }

                        if (dia < 1 || dia > diasMes) {
                            fechaCorrecta = false;
                        }
                    }

                    if (fechaCorrecta) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("La fecha NO es correcta.");
                    }
                    break;


                case 9:
                    System.out.print("Introduce el carácter: ");
                    char c = sc.next().charAt(0);

                    System.out.print("Introduce el número de líneas: ");
                    int lineas = sc.nextInt();

                    for (int i = 0; i < lineas; i++) {
                        int numCaracteres = 2 * i + 1;
                        for (int j = 0; j < numCaracteres; j++) {
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;


                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
