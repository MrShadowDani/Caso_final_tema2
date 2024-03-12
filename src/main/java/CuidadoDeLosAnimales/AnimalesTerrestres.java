package CuidadoDeLosAnimales;

public class AnimalesTerrestres extends Animales{
    //Caracteristicas de los animales terrestres
    private boolean patas;
    private boolean cola;
    private boolean pelo;
    private boolean garras;
    private String tipoTerrestre;

    //Constructor
    public AnimalesTerrestres(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id, boolean patas, boolean cola, boolean pelo, boolean garras, String tipoTerrestre) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, salud, comportamiento, id);
        this.patas = patas;
        this.cola = cola;
        this.pelo = pelo;
        this.garras = garras;
        this.tipoTerrestre = tipoTerrestre;
    }

    //Getters y setters de los atributos
    public boolean isPatas() {
        return patas;
    }
    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }
    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelo() {
        return pelo;
    }
    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public boolean isGarras() {
        return garras;
    }
    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    public String gettipoTerrestre() {
        return this.tipoTerrestre;
    }
    public void settipoTerrestre(String tipoTerrestre) {
        this.tipoTerrestre = tipoTerrestre;
    }

}
