package Cuidado_de_los_animales;

public class Animales {

    //Caracteristicas de los animales
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private String sexo;
    private String edad;
    private String peso;
    private String altura;
    private String tipo;
    private String habitat;
    private String alimentacion;
    private String reproduccion;
    private String cuidados;
    private String enfermedades;
    private String vacunas;
    private boolean salud;
    private boolean comportamiento;
    private int id;

    //Constructor
    public Animales(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, boolean salud, boolean comportamiento, int id) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.id = id;
    }

    //Datos guardados en la base de datos
    @Override
    public String toString() {
        return "Animal []";
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

    //Getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }







}
