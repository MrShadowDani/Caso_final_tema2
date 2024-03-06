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

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }
    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getCuidados() {
        return cuidados;
    }
    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public String getEnfermedades() {
        return enfermedades;
    }
    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getVacunas() {
        return vacunas;
    }
    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public boolean isSalud() {
        return salud;
    }
    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }
    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void buenasalud (boolean salud) {
        if (salud == true) {
            System.out.println("El animal" + nombre + "se encuentra en buen estado de salud");
        } else {
            System.out.println("El animal" + nombre + "se encuentra en mal estado de salud");
        }
    }

    public void buencomportamiento (boolean comportamiento) {
        if (comportamiento == true) {
            System.out.println("El animal" + nombre + "tiene buen comportamiento");
        } else {
            System.out.println("El animal" + nombre + "tiene mal comportamiento");
        }
    }









}
