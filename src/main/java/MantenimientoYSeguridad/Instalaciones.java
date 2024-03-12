package MantenimientoYSeguridad;

import GestionDeHabitats.Habitats;
import java.util.ArrayList;
import java.util.List;

public class Instalaciones {
    //Atributos
    private List<Instalaciones> trabajos;
    public Instalaciones() {
        this.trabajos = new ArrayList<>();
    }
    public void programarInstalacion(Instalaciones instalacion) {
        trabajos.add(instalacion);
    }
    public void actualizarEstadoInstalacion(Instalaciones instalacion, String nuevoEstado) {
        instalacion.setEstado(nuevoEstado);
    }
    public List<Instalaciones> obtenerTrabajosProgramados() {
        return trabajos;
    }

    //Caracteristicas de las instalaciones
    private String nombre;
    private String ubicacion;
    private String estado;
    private String fechaUltimoMantenimiento;
    private List<Habitats> habitats; // Lista de habitats asociados a la instalación

    // Constructor
    public Instalaciones(String nombre, String ubicacion, String estado, String fechaUltimoMantenimiento, List<Habitats> habitats) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.habitats = habitats;
        this.trabajos = new ArrayList<>();
    }

    // Constructor de copia
    public Instalaciones(Instalaciones original) {
        this.nombre = original.nombre;
        this.ubicacion = original.ubicacion;
        this.estado = original.estado;
        this.fechaUltimoMantenimiento = original.fechaUltimoMantenimiento;
        this.habitats = original.habitats;
        this.trabajos = new ArrayList<>(original.trabajos);
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

    @Override
    public String toString() {
        return "Instalaciones{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaUltimoMantenimiento='" + fechaUltimoMantenimiento + '\'' +
                ", habitats=" + habitats +
                '}';
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }
    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public List<Habitats> getHabitats() {
        return habitats;
    }
    public void setHabitats(List<Habitats> habitats) {
        this.habitats = habitats;
    }

    //Metodo para mostrar la informacion de la instalacion
    public void mostrarTrabajosProgramados() {
        for (Instalaciones instalacion : trabajos) {
            System.out.println(instalacion);
        }
    }
}
