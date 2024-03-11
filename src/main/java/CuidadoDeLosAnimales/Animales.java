package CuidadoDeLosAnimales;

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
    private static final String Animal_literal = "El animal";

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

    // Constructor de copia
    public Animales(Animales original) {
        this.nombre = original.nombre;
        this.especie = original.especie;
        this.raza = original.raza;
        this.color = original.color;
        this.sexo = original.sexo;
        this.edad = original.edad;
        this.peso = original.peso;
        this.altura = original.altura;
        this.tipo = original.tipo;
        this.habitat = original.habitat;
        this.alimentacion = original.alimentacion;
        this.reproduccion = original.reproduccion;
        this.cuidados = original.cuidados;
        this.enfermedades = original.enfermedades;
        this.vacunas = original.vacunas;
        this.salud = original.salud;
        this.comportamiento = original.comportamiento;
        this.id = original.id;
    }

    //Datos guardados en la base de datos
    @Override
    public String toString() {
        return "Animal []";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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

    public void buenasalud () {
        if (salud) {
            System.out.println(Animal_literal + nombre + id  + "se encuentra en buen estado de salud");
        } else {
            System.out.println(Animal_literal + nombre + id + "se encuentra en mal estado de salud");
        }
    }

    public void buencomportamiento () {
        if (comportamiento) {
            System.out.println(Animal_literal + nombre + id  + "tiene buen comportamiento");
        } else {
            System.out.println(Animal_literal + nombre + id + "tiene mal comportamiento");
        }
    }

    //Metodo para mostrar los datos de los animales
    public void registrarAlimentacion (String alimentacion) {
        System.out.println(Animal_literal + nombre + "se alimenta de" + alimentacion);
    }

    public void registrarReproduccion (String reproduccion) {
        System.out.println(Animal_literal + nombre + id + "se reproduce con" + reproduccion);
    }

    public void registrarCuidados (String cuidados) {
        System.out.println(Animal_literal +nombre + id + "necesita" + cuidados);
    }

    public void registrarEnfermedades (String enfermedades) {
        System.out.println(Animal_literal + nombre + id + "puede sufrir de" + enfermedades);
    }

    public void registrarVacunas (String vacunas) {
        System.out.println(Animal_literal + nombre + id + "necesita vacunarse de" + vacunas);
    }

    public void registrarHabitat (String habitat) {
        System.out.println(Animal_literal + nombre + "vive en" + habitat);
    }

    public void registrarPeso (String peso) {
        System.out.println(Animal_literal + nombre + id + "pesa" + peso);
    }

    public void registrarAltura (String altura) {
        System.out.println(Animal_literal + nombre + id + "mide" + altura);
    }

    public void registrarEdad (String edad) {
        System.out.println(Animal_literal + nombre + id + "tiene" + edad);
    }

    public void registrarColor (String color) {
        System.out.println(Animal_literal + nombre + id + "es de color" + color);
    }

    public void registrarRaza (String raza) {
        System.out.println(Animal_literal + nombre + id + "es de raza" + raza);
    }

    public void registrarEspecie (String especie) {
        System.out.println(Animal_literal + nombre + id + "es de especie" + especie);
    }

    public void regsitrarNombre (String nombre) {
        System.out.println(Animal_literal + nombre + id + "se llama" + nombre);
    }

    public void registrarSexo (String sexo) {
        System.out.println(Animal_literal + nombre + id + "es de sexo" + sexo);
    }

    public void registrarTipo (String tipo) {
        System.out.println(Animal_literal + nombre + id + "es de tipo" + tipo);
    }

    public void registrarId (int id) {
        System.out.println(Animal_literal + nombre + "tiene el id" + id);
    }

}
