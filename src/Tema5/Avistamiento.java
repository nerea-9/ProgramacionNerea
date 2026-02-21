package Tema5;

public class Avistamiento {
        int hora;
        String tipo;
        int datoNumerico;
        String datoTexto;

        public Avistamiento() {
                hora = 0;
                tipo = "";
                datoNumerico = 0;
                datoTexto = "";
        }

        public Avistamiento(int hora, String tipo, int datoNumerico, String datoTexto) {
                this.hora = hora;
                this.tipo = tipo;
                this.datoNumerico = datoNumerico;
                this.datoTexto = datoTexto;
        }

        public int getHora(){
                return hora;
        }
        public void setHora(int hora){
                this.hora = hora;
        }

        public String getTipo(){
            return tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
    }

        public int getDatoNumerico(){
            return datoNumerico;
        }
        public void setDatoNumerico(int datoNumerico){
            this.datoNumerico = datoNumerico;
        }

        public String getDatoTexto(){
            return datoTexto;
        }
        public void setDatoTexto(String datoTexto){
            this.datoTexto = datoTexto;
        }

        public String toString(){
            return "Hora: " + hora + ", Tipo: " + tipo + ", DatoNumerico: " + datoNumerico + ", DatoTexto: " + datoTexto;
        }
}
