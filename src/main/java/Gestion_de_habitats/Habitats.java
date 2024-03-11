package Gestion_de_habitats;

public class Habitats {

    //Caracteristicas de los habitats
    private String nombre;
    private String dimensiones;
    private String ubicacion;
    private String tipo;
    private String temperatura;
    private String humedad;
    private String vegetacion;
    private String fauna;
    private String estado;
    private int id;
    private int capacidadMaxima;
    private int numAnimales;
    private String especieDominante;

    //Constructor
    public Habitats(String nombre, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante) {
        this.nombre = nombre;
        this.dimensiones = dimensiones;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.vegetacion = vegetacion;
        this.fauna = fauna;
        this.estado = estado;
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.numAnimales = numAnimales;
        this.especieDominante = especieDominante;
    }

    //Datos guardados en la base de datos
    @Override
    public String toString() {
        return "Habitat []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }
    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getVegetacion() {
        return vegetacion;
    }
    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public String getFauna() {
        return fauna;
    }
    public void setFauna(String fauna) {
        this.fauna = fauna;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumAnimales() {
        return numAnimales;
    }
    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }

    public String getEspecieDominante() {
        return especieDominante;
    }
    public void setEspecieDominante(String especieDominante) {
        this.especieDominante = especieDominante;
    }
}


