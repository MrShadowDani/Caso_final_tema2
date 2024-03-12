package InteraccionConVisitantes;

public class Visitantes {
    //Caracteristicas de los visitantes
    private String nombre;
    private String edad;
    private String gustos;
    private String preferencias;

    //Constructor
    public Visitantes(String nombre, String edad, String gustos, String preferencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.gustos = gustos;
        this.preferencias = preferencias;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGustos() {
        return gustos;
    }
    public void setGustos(String gustos) {
        this.gustos = gustos;
    }

    public String getPreferencias() {
        return preferencias;
    }
    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    //Metodo para mostrar los datos de los visitantes
    public void mostrarVisitantes(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Gustos: " + gustos);
        System.out.println("Preferencias: " + preferencias);
    }
}
