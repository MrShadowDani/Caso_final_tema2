package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesAviarios;

import java.util.ArrayList;
import java.util.List;

public class HabitatsAviarios extends Habitats{
    //Caracteristicas de los habitats aviarios
    private String alturaMaxima;
    private String tipoDeAveDominante;
    private int cantidadDeNidos;
    private List<AnimalesAviarios> animales;

    //Constructor
    public HabitatsAviarios(String nombre, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String alturaMaxima, String tipoDeAveDominante, int cantidadDeNidos, List<AnimalesAviarios> animales) {
        super(nombre, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.alturaMaxima = alturaMaxima;
        this.tipoDeAveDominante = tipoDeAveDominante;
        this.cantidadDeNidos = cantidadDeNidos;
        this.animales = animales;
    }

    //Constructor de copias
    public HabitatsAviarios(HabitatsAviarios original) {
        super(original);
        this.alturaMaxima = original.alturaMaxima;
        this.tipoDeAveDominante = original.tipoDeAveDominante;
        this.cantidadDeNidos = original.cantidadDeNidos;
        this.animales = original.animales != null ? new ArrayList<>(original.animales) : null;
    }

    //Getters y setters

    public String getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(String alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public String getTipoDeAveDominante() {
        return tipoDeAveDominante;
    }
    public void setTipoDeAveDominante(String tipoDeAveDominante) {
        this.tipoDeAveDominante = tipoDeAveDominante;
    }

    public int getCantidadDeNidos() {
        return cantidadDeNidos;
    }
    public void setCantidadDeNidos(int cantidadDeNidos) {
        this.cantidadDeNidos = cantidadDeNidos;
    }

    public List<AnimalesAviarios> getAnimales() {
        return animales;
    }
    public void setAnimales(List<AnimalesAviarios> animales) {
        this.animales = animales;
    }
}
