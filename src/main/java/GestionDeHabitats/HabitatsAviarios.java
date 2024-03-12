package GestionDeHabitats;

import CuidadoDeLosAnimales.AnimalesAviarios;
import CuidadoDeLosAnimales.AnimalesTerrestres;

import java.util.ArrayList;
import java.util.List;

public class HabitatsAviarios extends Habitats{
    //Caracteristicas de los habitats aviarios
    private String alturaMaxima;
    private int catidadDeArboles;
    private int cantidadDeNidos;
    private List<AnimalesAviarios> animales;

    //Constructor
    public HabitatsAviarios(String nombre, String descripcion, String dimensiones, String ubicacion, String tipo, String temperatura, String humedad, String vegetacion, String fauna, String estado, int id, int capacidadMaxima, int numAnimales, String especieDominante, String alturaMaxima, int catidadDeArboles, int cantidadDeNidos, List<AnimalesAviarios> animales) {
        super(nombre, descripcion, dimensiones, ubicacion, tipo, temperatura, humedad, vegetacion, fauna, estado, id, capacidadMaxima, numAnimales, especieDominante);
        this.alturaMaxima = alturaMaxima;
        this.catidadDeArboles = catidadDeArboles;
        this.cantidadDeNidos = cantidadDeNidos;
        this.animales = animales;
    }

    //Constructor de copia
    public HabitatsAviarios(HabitatsAviarios original) {
        super(original);
        this.alturaMaxima = original.alturaMaxima;
        this.catidadDeArboles = original.catidadDeArboles;
        this.cantidadDeNidos = original.cantidadDeNidos;
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
    public String getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(String alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getcatidadDeArboles() {
        return catidadDeArboles;
    }
    public void setcatidadDeArboles(int catidadDeArboles) {
        this.catidadDeArboles = catidadDeArboles;
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

    public void agregarAnimal(AnimalesAviarios animal){
        animales.add(animal);
    }
    public void eliminarAnimal(AnimalesAviarios animal){
        animales.remove(animal);
    }
    public void moverAnimal(AnimalesAviarios animal){
        animales.set(animales.indexOf(animal), animal);
    }

    //Mostrar datos de los habitats aviarios
    public void mostrarDatosDeHabitatsAviarios(){
        System.out.println("Altura maxima: " + getAlturaMaxima());
        System.out.println("Cantidad de arboles: " + getcatidadDeArboles());
        System.out.println("Cantidad de nidos: " + getCantidadDeNidos());
        System.out.println("Animales: " + getAnimales());
    }
}
