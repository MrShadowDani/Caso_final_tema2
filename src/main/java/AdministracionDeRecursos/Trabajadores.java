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
    private final List<Pedidos> pedidos;
    private final List<Proveedores> proveedores;
    private final List<Recursos> recursos;

    //Constructor
    public Trabajadores(String nombre, String apellido, String DNI, String telefono, String especialidad, String horario, List<Pedidos> pedidos, List<Proveedores> proveedores, List<Recursos> recursos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.horario = horario;
        this.pedidos = pedidos;
        this.proveedores = proveedores;
        this.recursos = recursos;
    }

    // Constructor de copia
    public Trabajadores(Trabajadores original) {
        this.nombre = original.nombre;
        this.apellido = original.apellido;
        this.DNI = original.DNI;
        this.telefono = original.telefono;
        this.especialidad = original.especialidad;
        this.horario = original.horario;
        this.pedidos = new ArrayList<>(original.pedidos);
        this.proveedores = new ArrayList<>(original.proveedores);
        this.recursos = new ArrayList<>(original.recursos);
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

    //Metodos para manejar pedidos, proveedores y recursos
       public void agregarPedido(Pedidos pedido){
            pedidos.add(pedido);
        }
        public void eliminarPedido(Pedidos pedido){
            pedidos.remove(pedido);
        }

        public void agregarProveedor(Proveedores proveedor){
            proveedores.add(proveedor);
        }
        public void eliminarProveedor(Proveedores proveedor){
            proveedores.remove(proveedor);
        }

        public void agregarRecurso(Recursos recurso){
            recursos.add(recurso);
        }
        public void eliminarRecurso(Recursos recurso){
            recursos.remove(recurso);
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
