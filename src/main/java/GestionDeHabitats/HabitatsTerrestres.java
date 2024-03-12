package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesTerrestres;

import java.util.ArrayList;
import java.util.List;

public class HabitatsTerrestres extends Habitats{
    //Caracteristicas de los habitats terrestres
    private String tipoDeSuelo;
    private int cantidadDeCuevas;
    private List<AnimalesTerrestres> animales;

    //Constructor
    public HabitatsTerrestres(String nombre, String descripcion, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String tipoDeSuelo, int cantidadDeCuevas, List<AnimalesTerrestres> animales) {
        super(nombre, descripcion, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.tipoDeSuelo = tipoDeSuelo;
        this.cantidadDeCuevas = cantidadDeCuevas;
        this.animales = animales;
    }

    //Constructor de copia
    public HabitatsTerrestres(HabitatsTerrestres original) {
        super(original);
        this.tipoDeSuelo = original.tipoDeSuelo;
        this.cantidadDeCuevas = original.cantidadDeCuevas;
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

    public List<AnimalesTerrestres> getAnimales() {
        return animales;
    }
    public void setAnimales(List<AnimalesTerrestres> animales) {
        this.animales = animales;
    }

    public void agregarAnimal(AnimalesTerrestres animal){
        animales.add(animal);
    }
    public void eliminarAnimal(AnimalesTerrestres animal){
        animales.remove(animal);
    }
    public void moverAnimal(AnimalesTerrestres animal){
        animales.set(animales.indexOf(animal), animal);
    }

    //Mostrar datos de los habitats terrestres
    public void mostrarDatosDeHabitatsTerrestres (){
System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de suelo: " + getTipoDeSuelo());
        System.out.println("Cantidad de cuevas: " + getCantidadDeCuevas());
        System.out.println("Animales: " + getAnimales());
    }
}
