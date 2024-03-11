package CuidadoDeLosAnimales;

public class AnimalesAcuaticos extends Animales{
    //Caracteristicas de los animales acuaticos
    private boolean aletas;
    private boolean branquias;
    private boolean escamas;
    private boolean caparazon;
    private String tipo_agua;

    //Constructor
    public AnimalesAcuaticos(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id, boolean aletas, boolean branquias, boolean escamas, boolean caparazon, String tipo_agua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, salud, comportamiento, id);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.caparazon = caparazon;
        this.tipo_agua = tipo_agua;
    }

    //Getters y setters de los atributos
    public boolean isAletas() {
        return aletas;
    }
    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }
    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }
    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public boolean isCaparazon() {
        return caparazon;
    }
    public void setCaparazon(boolean caparazon) {
        this.caparazon = caparazon;
    }

    public String getTipo_agua() {
        return this.tipo_agua;
    }
    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

}
