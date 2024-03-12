package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesAcuaticos;

import java.util.ArrayList;
import java.util.List;

public class HabitatsAcuaticos extends Habitats{
    //Caracteristicas de los habitats acuaticos
    private String salinidad;
    private String profundidad;
    private String tipoDeAgua;
    private String calidadDelAgua;
    private String cantidadDeAgua;
    private List<AnimalesAcuaticos> animales;

    //Constructor
    public HabitatsAcuaticos(String nombre, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String salinidad, String profundidad, String tipoDeAgua, String calidadDelAgua, String cantidadDeAgua, List<AnimalesAcuaticos> animales) {
        super(nombre, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.salinidad = salinidad;
        this.profundidad = profundidad;
        this.tipoDeAgua = tipoDeAgua;
        this.calidadDelAgua = calidadDelAgua;
        this.cantidadDeAgua = cantidadDeAgua;
        this.animales = animales;
    }

    //Constructor de copias
    public HabitatsAcuaticos(HabitatsAcuaticos original) {
        super(original);
        this.salinidad = original.salinidad;
        this.profundidad = original.profundidad;
        this.tipoDeAgua = original.tipoDeAgua;
        this.calidadDelAgua = original.calidadDelAgua;
        this.cantidadDeAgua = original.cantidadDeAgua;
        this.animales = original.animales != null ? new ArrayList<>(original.animales) : null;
    }

    //Getters y setters
    public String getSalinidad() {
        return salinidad;
    }
    public void setSalinidad(String salinidad) {
        this.salinidad = salinidad;
    }

    public String getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public String gettipoDeAgua() {
        return tipoDeAgua;
    }
    public void settipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    public String getcalidadDelAgua() {
        return calidadDelAgua;
    }
    public void setcalidadDelAgua(String calidadDelAgua) {
        this.calidadDelAgua = calidadDelAgua;
    }

    public String getcantidadDeAgua() {
        return cantidadDeAgua;
    }
    public void setcantidadDeAgua(String cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public List<AnimalesAcuaticos> getAnimales() {
        return animales;
    }
    public void setAnimales(List<AnimalesAcuaticos> animales) {
        this.animales = animales;
    }
}





