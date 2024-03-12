package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Reparaciones {
    //Atributos
    private List<Reparaciones> trabajos;
    public Reparaciones() {
        this.trabajos = new ArrayList<>();
    }
    public void programarReparacion(Reparaciones reparacion) {
        trabajos.add(reparacion);
    }
    public void actualizarEstadoReparacion(Reparaciones reparacion, String nuevoEstado) {
        reparacion.setEstado(nuevoEstado);
    }
    public List<Reparaciones> obtenerTrabajosProgramados() {
        return trabajos;
    }

    //Caracteristicas de las reparaciones
        private Instalaciones instalacion;
        private String fechaProgramada;
        private String estado;
        private String descripcion;

    //Constructor
    public Reparaciones(Instalaciones instalacion, String fechaProgramada, String estado, String descripcion) {
        this.instalacion = instalacion;
        this.fechaProgramada = fechaProgramada;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    //Constructor de copia
    public Reparaciones(Reparaciones reparacion) {
        this.instalacion = reparacion.instalacion;
        this.fechaProgramada = reparacion.fechaProgramada;
        this.estado = reparacion.estado;
        this.descripcion = reparacion.descripcion;
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
        return "Reparaciones{" +
                "instalacion=" + instalacion +
                ", fechaProgramada='" + fechaProgramada + '\'' +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    //Getters y setters
    public List<Reparaciones> getTrabajos() {
        return trabajos;
    }
    public void setTrabajos(List<Reparaciones> trabajos) {
        this.trabajos = trabajos;
    }

    public Instalaciones getInstalacion() {
        return instalacion;
    }
    public void setInstalacion(Instalaciones instalacion) {
        this.instalacion = instalacion;
    }

    public String getFechaProgramada() {
        return fechaProgramada;
    }
    public void setFechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo para mostrar la informacion de la reparacion
    public String mostrarReparacion() {
        return "Reparacion{" + "instalacion=" + instalacion + ", fechaProgramada=" + fechaProgramada + ", estado=" + estado + ", descripcion=" + descripcion + '}';
    }

    //Metodo para mostrar la informacion de la reparacion
    public void mostrarTrabajosProgramados() {
        for (Reparaciones reparacion : trabajos) {
            System.out.println(reparacion);
        }
    }
}