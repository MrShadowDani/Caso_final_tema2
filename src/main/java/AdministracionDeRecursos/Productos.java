package AdministracionDeRecursos;

public class Productos {
    //Caracteristicas de los productos
    private String nombre;
    private String idProducto;
    private String descripcion;
    private String categoria;
    private double precio;

    //Constructor
    public Productos(String nombre, String idProducto, String descripcion, String categoria, double precio) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Constructor de copia
    public Productos(Productos original) {
        this.nombre = original.nombre;
        this.idProducto = original.idProducto;
        this.descripcion = original.descripcion;
        this.categoria = original.categoria;
        this.precio = original.precio;
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

    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo para mostrar los datos del producto
    public String mostrarProducto(){
        return "Nombre: " + this.nombre + "\nID: " + this.idProducto + "\nDescripcion: " + this.descripcion + "\nCategoria: " + this.categoria + "\nPrecio: " + this.precio;
    }
}
