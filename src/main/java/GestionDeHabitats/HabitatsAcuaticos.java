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
    public HabitatsAcuaticos(String nombre, String descripcion, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String salinidad, String profundidad, String tipoDeAgua, String calidadDelAgua, String cantidadDeAgua, List<AnimalesAcuaticos> animales) {
        super(nombre, descripcion, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.salinidad = salinidad;
        this.profundidad = profundidad;
        this.tipoDeAgua = tipoDeAgua;
        this.calidadDelAgua = calidadDelAgua;
        this.cantidadDeAgua = cantidadDeAgua;
        this.animales = animales;
    }

    //Constructor de copia
    public HabitatsAcuaticos(HabitatsAcuaticos original) {
        super(original);
        this.salinidad = original.salinidad;
        this.profundidad = original.profundidad;
        this.tipoDeAgua = original.tipoDeAgua;
        this.calidadDelAgua = original.calidadDelAgua;
        this.cantidadDeAgua = original.cantidadDeAgua;
        this.animales = original.animales != null ? new ArrayList<>(original.animales) : null;
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

    public void agregarAnimal(AnimalesAcuaticos animal){
        animales.add(animal);
    }
    public void eliminarAnimal(AnimalesAcuaticos animal){
        animales.remove(animal);
    }
    public void moverAnimal(AnimalesAcuaticos animal){
        animales.set(animales.indexOf(animal), animal);
    }

    //Mostrar datos de los habitats acuaticos
    public void mostrarDatosDeHabitatsAcuaticos(){
        System.out.println("Salinidad: " + getSalinidad());
        System.out.println("Profundidad: " + getProfundidad());
        System.out.println("Tipo de agua: " + gettipoDeAgua());
        System.out.println("La calidad del agua es: " + getcalidadDelAgua());
        System.out.println("La cantidad de agua es: " + getcantidadDeAgua());
        System.out.println("Animales: " + getAnimales());
    }
}





