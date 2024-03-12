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

    // Constructor de copia
    public AnimalesTerrestres(AnimalesTerrestres original) {
        super(original);
        this.patas = original.patas;
        this.cola = original.cola;
        this.pelo = original.pelo;
        this.garras = original.garras;
        this.tipoTerrestre = original.tipoTerrestre;
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

    //Metodo para mostrar los datos de los animales terrestres
    public void mostrarDatos(){
        System.out.println("Patas: " + isPatas());
        System.out.println("Cola: " + isCola());
        System.out.println("Pelo: " + isPelo());
        System.out.println("Garras: " + isGarras());
        System.out.println("Tipo Terrestre: " + gettipoTerrestre());
    }
}
