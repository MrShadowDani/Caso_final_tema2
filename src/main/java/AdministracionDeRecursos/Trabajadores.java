package AdministracionDeRecursos;

import java.util.ArrayList;
import java.util.List;
public class Trabajadores {
    //Caracteristicas de los trabajadores
    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String especialidad;
    private String horario;

    //Constructor
    public Trabajadores(String nombre, String apellido, String DNI, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.horario = horario;
    }

    // Constructor de copia
    public Trabajadores(Trabajadores original) {
        this.nombre = original.nombre;
        this.apellido = original.apellido;
        this.DNI = original.DNI;
        this.telefono = original.telefono;
        this.especialidad = original.especialidad;
        this.horario = original.horario;
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

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Metodo para mostrar trabajadores
    public void mostrarTrabajadores(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Telefono: " + telefono);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horario: " + horario);
    }
}
