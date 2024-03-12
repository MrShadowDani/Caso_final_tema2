package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesAviarios;

import java.util.ArrayList;
import java.util.List;

public class HabitatsTerrestres extends Habitats{
    //Caracteristicas de los habitats terrestres
    private String tipoDeSuelo;
    private int cantidadDeCuevas;
    private List<AnimalesAviarios> animales;

    //Constructor
    public HabitatsTerrestres(String nombre, String descripcion, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String tipoDeSuelo, int cantidadDeCuevas, List<AnimalesAviarios> animales) {
        super(nombre, descripcion, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.tipoDeSuelo = tipoDeSuelo;
        this.cantidadDeCuevas = cantidadDeCuevas;
        this.animales = animales;
    }

    //Constructor de copias
    public HabitatsTerrestres(HabitatsTerrestres original) {
        super(original);
        this.tipoDeSuelo = original.tipoDeSuelo;
        this.cantidadDeCuevas = original.cantidadDeCuevas;
        this.animales = original.animales != null ? new ArrayList<>(original.animales) : null;
    }

    //Getters y setters
    public String getTipoDeSuelo() {
        return tipoDeSuelo;
    }
    public void setTipoDeSuelo(String tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public int getCantidadDeCuevas() {
        return cantidadDeCuevas;
    }
    public void setCantidadDeCuevas(int cantidadDeCuevas) {
        this.cantidadDeCuevas = cantidadDeCuevas;
    }

    public List<AnimalesAviarios> getAnimales() {
        return animales;
    }
    public void setAnimales(List<AnimalesAviarios> animales) {
        this.animales = animales;
    }
}
