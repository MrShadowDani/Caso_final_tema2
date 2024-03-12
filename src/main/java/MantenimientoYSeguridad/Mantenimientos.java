package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Mantenimientos {
    //Atributos de los mantenimientos
    private List<Mantenimientos> trabajos;
    public Mantenimientos () {
        this.trabajos = new ArrayList<>();
    }
    public void programarMantenimiento (Mantenimientos mantenimiento) {
        trabajos.add(mantenimiento);
    }
    public void cancelarMantenimiento (Mantenimientos mantenimiento) {
        trabajos.remove(mantenimiento);
    }
    public void actualizarMantenimiento (Mantenimientos mantenimiento, String nuevoEstado) {
        mantenimiento.setEstado(nuevoEstado);
    }
    public List<Mantenimientos> obtenerTrabajosProgramados() {
        return trabajos;
    }

    //Caracteristicas de los mantenimientos
    private Instalaciones instalacion;
    private String fechaProgramada;
    private String tipo;
    private String estado;
    private String Descripcion;

    // Constructor
    public Mantenimientos(Instalaciones instalacion, String fechaProgramada, String tipo, String estado, String Descripcion) {
        this.instalacion = instalacion;
        this.fechaProgramada = fechaProgramada;
        this.tipo = tipo;
        this.estado = estado;
        this.Descripcion = Descripcion;
    }

    //Constructor de copia
    public Mantenimientos(Mantenimientos mantenimiento) {
        this.instalacion = mantenimiento.instalacion;
        this.fechaProgramada = mantenimiento.fechaProgramada;
        this.tipo = mantenimiento.tipo;
        this.estado = mantenimiento.estado;
        this.Descripcion = mantenimiento.Descripcion;
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
        return "Mantenimiento{" +
                "instalacion=" + instalacion +
                ", fechaProgramada='" + fechaProgramada + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }

    //Getters y Setters
    public List<Mantenimientos> getTrabajos() {
        return trabajos;
    }
    public void setTrabajos(List<Mantenimientos> trabajos) {
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

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    //Metodo para mostrar los trabajos programados
    public void mostrarTrabajosProgramados() {
        for (Mantenimientos mantenimiento : trabajos) {
            System.out.println(mantenimiento);
        }
    }
}
