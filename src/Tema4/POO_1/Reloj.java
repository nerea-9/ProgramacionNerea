package Tema4.POO_1;

public class Reloj {
    // Atributos
    private int hora;
    private int minutos;
    private int segundos;
    private boolean formato24;

    // Constructor vacío
    public Reloj() {
        hora = 0;
        minutos = 0;
        segundos = 0;
        formato24 = true;
    }

    // Constructor con parametros
    public Reloj(int hora, int minutos, int segundos, boolean formato24) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.formato24 = formato24;
    }

    // Getters y setters
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        if (minutos > 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (segundos > 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    public boolean getformato24() {
        return formato24;
    }
    public void setFormato24(boolean formato24) {
        this.formato24 = formato24;
    }

    // Metodos

    // Imprime la hora en formato 24h o 12h según valor
    public void mostrarHora() {
        if (formato24) {
            System.out.println(hora + ":" + minutos + ":" + segundos);
        } else {
            int hora12 = hora;
            if (hora12 >= 13) {
                hora12 -= 12;
            }
            System.out.println(hora12 + ":" + minutos + ":" + segundos);
        }
    }

    // Devuelve información como texto
        public String toString() {
            if (formato24) {
              return hora + ":" + minutos + ":" + segundos;
            } else {
                int hora12 = hora;
                if (hora12 >= 13) {
                    hora12 -= 12;
                }
                return hora12 + ":" + minutos + ":" + segundos;

            }
        }



}