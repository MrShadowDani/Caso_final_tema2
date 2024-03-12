package MantenimientoYSeguridad;

import GestionDeHabitats.Habitats;
import java.util.List;

public class Instalaciones {
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
}
