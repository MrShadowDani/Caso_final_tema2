package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesAcuaticos;

import java.util.ArrayList;
import java.util.List;

public class HabitatsAcuaticos extends Habitats{
    //Caracteristicas de los habitats acuaticos
    private String salinidad;
    private String profundidad;
    private String tipo_de_agua;
    private String calidad_del_agua;
    private String cantidad_de_agua;
    private List<AnimalesAcuaticos> animales;

    //Constructor
    public HabitatsAcuaticos(String nombre, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String salinidad, String profundidad, String tipo_de_agua, String calidad_del_agua, String cantidad_de_agua, List<AnimalesAcuaticos> animales) {
        super(nombre, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.salinidad = salinidad;
        this.profundidad = profundidad;
        this.tipo_de_agua = tipo_de_agua;
        this.calidad_del_agua = calidad_del_agua;
        this.cantidad_de_agua = cantidad_de_agua;
        this.animales = animales;
    }

    //Constructor de copias
    public HabitatsAcuaticos(HabitatsAcuaticos original) {
        super(original);
        this.salinidad = original.salinidad;
        this.profundidad = original.profundidad;
        this.tipo_de_agua = original.tipo_de_agua;
        this.calidad_del_agua = original.calidad_del_agua;
        this.cantidad_de_agua = original.cantidad_de_agua;
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

    public String getTipo_de_agua() {
        return tipo_de_agua;
    }
    public void setTipo_de_agua(String tipo_de_agua) {
        this.tipo_de_agua = tipo_de_agua;
    }

    public String getCalidad_del_agua() {
        return calidad_del_agua;
    }
    public void setCalidad_del_agua(String calidad_del_agua) {
        this.calidad_del_agua = calidad_del_agua;
    }

    public String getCantidad_de_agua() {
        return cantidad_de_agua;
    }
    public void setCantidad_de_agua(String cantidad_de_agua) {
        this.cantidad_de_agua = cantidad_de_agua;
    }

    public List<AnimalesAcuaticos> getAnimales() {
        return animales;
    }
    public void setAnimales(List<AnimalesAcuaticos> animales) {
        this.animales = animales;
    }
}





