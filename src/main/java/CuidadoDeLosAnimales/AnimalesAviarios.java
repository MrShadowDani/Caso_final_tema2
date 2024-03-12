package CuidadoDeLosAnimales;

public class AnimalesAviarios extends Animales{
        //Caracteristicas de los animales aviarios
        private boolean pico;
        private boolean plumaje;
        private boolean alas;
        private boolean garras;
        private String tipoAviario;

        //Constructor
        public AnimalesAviarios(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id, boolean pico, boolean plumaje, boolean alas, boolean garras, String tipoAviario) {
            super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, salud, comportamiento, id);
            this.pico = pico;
            this.plumaje = plumaje;
            this.alas = alas;
            this.garras = garras;
            this.tipoAviario = tipoAviario;
        }

        // Constructor de copia
        public AnimalesAviarios(AnimalesAviarios original) {
            super(original);
            this.pico = original.pico;
            this.plumaje = original.plumaje;
            this.alas = original.alas;
            this.garras = original.garras;
            this.tipoAviario = original.tipoAviario;
        }

    //Datos guardados en la base de datos
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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

        public String getTipoAviario() {
            return this.tipoAviario;
        }
        public void setTipoAviario(String tipoAviario) {
            this.tipoAviario = tipoAviario;
        }

        //Metodo para mostrar los datos de los animales aviarios
        public void mostrarDatosAviarios(){
            System.out.println("Pico: " + isPico());
            System.out.println("Plumaje: " + isPlumaje());
            System.out.println("Alas: " + isAlas());
            System.out.println("Garras: " + isGarras());
            System.out.println("Tipo de aviario: " + getTipoAviario());
        }
}
