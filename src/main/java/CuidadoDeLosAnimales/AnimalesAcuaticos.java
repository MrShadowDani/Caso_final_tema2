package CuidadoDeLosAnimales;

public class AnimalesAcuaticos extends Animales{
    //Caracteristicas de los animales acuaticos
    private boolean aletas;
    private boolean branquias;
    private boolean escamas;
    private boolean caparazon;
    private String tipoAgua;

    //Constructor
    public AnimalesAcuaticos(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id, boolean aletas, boolean branquias, boolean escamas, boolean caparazon, String tipoAgua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, salud, comportamiento, id);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.caparazon = caparazon;
        this.tipoAgua = tipoAgua;
    }

    // Constructor de copia
    public AnimalesAcuaticos(AnimalesAcuaticos original) {
        super(original);
        this.aletas = original.aletas;
        this.branquias = original.branquias;
        this.escamas = original.escamas;
        this.caparazon = original.caparazon;
        this.tipoAgua = original.tipoAgua;
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

    public String getTipoAgua() {
        return this.tipoAgua;
    }
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    //Metodo para mostrar los datos de los animales acuaticos
    public void mostrarDatosAcuaticos(){
        System.out.println("Aletas: " + this.isAletas());
        System.out.println("Branquias: " + this.isBranquias());
        System.out.println("Escamas: " + this.isEscamas());
        System.out.println("Caparazon: " + this.isCaparazon());
        System.out.println("Tipo de agua: " + this.getTipoAgua());
    }
}
