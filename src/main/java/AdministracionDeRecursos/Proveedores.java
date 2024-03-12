package AdministracionDeRecursos;

import java.util.List;

public class Proveedores {
    //Caracteristicas de los proveedores
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private List<String> productos;

    //Constructor
    public Proveedores(String nombre, String telefono, String direccion, String email, List<String> productos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.productos = productos;
    }

    // Constructor de copia
    public Proveedores(Proveedores original) {
        this.nombre = original.nombre;
        this.telefono = original.telefono;
        this.direccion = original.direccion;
        this.email = original.email;
        this.productos = original.productos;
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

    //Metodos para manejar productos
    public void agregarProducto(String producto){
        this.productos.add(producto);
    }
    public void eliminarProducto(String producto){
        this.productos.remove(producto);
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getProductos() {
        return productos;
    }
    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    //Metodo para mostrar los datos de los proveedores
    public void mostrarDatosDeProveedores(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Email: " + this.email);
        System.out.println("Productos: " + this.productos);
    }
}
