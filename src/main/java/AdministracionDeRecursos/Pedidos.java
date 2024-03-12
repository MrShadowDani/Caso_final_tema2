package AdministracionDeRecursos;

public class Pedidos {
    //Caracteristicas de los pedidos
    private String fecha;
    private String hora;
    private String idPedido;
    private String nombreProducto;
    private int cantidad;
    private double precio;
    private String direccion;
    private String telefono;
    private String estado;

    //Constructor
    public Pedidos(String fecha, String hora, String idPedido, String nombreProducto, int cantidad, double precio, String direccion, String telefono, String estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    // Constructor de copia
    public Pedidos(Pedidos original) {
        this.fecha = original.fecha;
        this.hora = original.hora;
        this.idPedido = original.idPedido;
        this.nombreProducto = original.nombreProducto;
        this.cantidad = original.cantidad;
        this.precio = original.precio;
        this.direccion = original.direccion;
        this.telefono = original.telefono;
        this.estado = original.estado;
    }
    public double calcularPrecioTotal(){
        return this.cantidad * this.precio;
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

    //Getters y Setters
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void cambiarEstado(String estado){
        this.estado = estado;
    }

    //Metodo para mostrar los pedidos
    public void mostrarPedido(){
        System.out.println("Pedido: " + idPedido);
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
        System.out.println("Total: " + calcularPrecioTotal());
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Estado: " + estado);
    }
}
