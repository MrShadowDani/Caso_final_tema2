package gestion_de_habitats;

import cuidado_de_los_animales.Animales_acuaticos;
import java.util.List;

public class Habitats_acuaticos extends Habitats{

    private String salinidad;
    private String profundidad;
    private String tipo_de_agua;
    private String calidad_del_agua;
    private String cantidad_de_agua;
    private List<Animales_acuaticos> animales;

public Habitats_acuaticos(String nombre, String salinidad, String profundidad, String tipo_de_agua, String calidad_del_agua, String cantidad_de_agua, List<Animales_acuaticos> animales) {
        super(nombre,);
        this.salinidad = salinidad;
        this.profundidad = profundidad;
        this.tipo_de_agua = tipo_de_agua;
        this.calidad_del_agua = calidad_del_agua;
        this.cantidad_de_agua = cantidad_de_agua;
        this.animales = animales;
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

    public List<Animales_acuaticos> getAnimales() {
        return animales;
    }
    public void setAnimales(List<Animales_acuaticos> animales) {
        this.animales = animales;
    }
}





