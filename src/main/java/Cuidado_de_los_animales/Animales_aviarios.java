package Cuidado_de_los_animales;

public class Animales_aviarios extends Animales{

        private boolean pico;
        private boolean plumaje;
        private boolean alas;
        private boolean garras;
        private String tipo_aviario;

        public Animales_aviarios(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id, boolean pico, boolean plumaje, boolean alas, boolean garras, String tipo_aviario) {
            super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, salud, comportamiento, id);
            this.pico = pico;
            this.plumaje = plumaje;
            this.alas = alas;
            this.garras = garras;
            this.tipo_aviario = tipo_aviario;
        }

        //Getters y setters de los atributos
        public boolean isPico() {
            return pico;
        }
        public void setPico(boolean pico) {
            this.pico = pico;
        }

        public boolean isPlumaje() {
            return plumaje;
        }
        public void setPlumaje(boolean plumaje) {
            this.plumaje = plumaje;
        }

        public boolean isAlas() {
            return alas;
        }
        public void setAlas(boolean alas) {
            this.alas = alas;
        }

        public boolean isGarras() {
            return garras;
        }
        public void setGarras(boolean garras) {
            this.garras = garras;
        }

        public void setTipo_aviario(String tipo_aviario) {
            this.tipo_aviario = tipo_aviario;
        }

}
