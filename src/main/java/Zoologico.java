import AdministracionDeRecursos.*;
import CuidadoDeLosAnimales.*;
import GestionDeHabitats.*;
import InteraccionConVisitantes.*;
import MantenimientoYSeguridad.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    public static void zoologico (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Zoologico Arapleshhh");
        String nombre = scanner.nextLine();
        System.out.println("¿Eres visitante o trabajador?");
        String userType = scanner.nextLine();

        if(userType.equalsIgnoreCase("trabajador")){
            boolean exit = false;
            while(!exit){
                System.out.println("Menu de gestión del zoologico Arapleshhh");
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Administración de recursos");
                System.out.println("2. Cuidado de los animales");
                System.out.println("3. Gestión de habitats");
                System.out.println("4. Interacción con visitantes");
                System.out.println("5. Mantenimiento y seguridad");
                System.out.println("6. Salir");

                String option = scanner.nextLine();

                switch(option){
                    case "1":
                        System.out.println("Menu de administración de recursos");
                        System.out.println("¿Qué quieres hacer?");
                        System.out.println("1. Trabajadores");
                        System.out.println("2. Productos");
                        System.out.println("3. Proveedores");
                        System.out.println("4. Pedidos");
                        System.out.println("5. Salir");

                        String option1 = scanner.nextLine();

                        switch (option1){
                            case "1":
                                System.out.println("Menu de administración de trabajadores");
                                System.out.println("Nombre del trabajador");
                                String nombreTrabajador = scanner.nextLine();
                                System.out.println("Apellido del trabajador");
                                String apellidoTrabajador = scanner.nextLine();
                                System.out.println("DNI del trabajador");
                                String DNITrabajador = String.valueOf(scanner.nextInt());
                                System.out.println("Telefono del trabajador");
                                String telefonoTrabajador = String.valueOf(scanner.nextInt());
                                System.out.println("Especialidad del trabajador");
                                String especialidadTrabajador = scanner.nextLine();
                                System.out.println("Horario del trabajador");
                                String horarioTrabajador = scanner.nextLine();
                                break;

                            case "2":
                                System.out.println("Menu de administración de productos");
                                System.out.println("Nombre del producto");
                                String nombreProducto = scanner.nextLine();
                                System.out.println("ID del producto");
                                String idProducto = scanner.nextLine();
                                System.out.println("Descripción del producto");
                                String descripcionProducto = scanner.nextLine();
                                System.out.println("Categoria del producto");
                                String categoriaProducto = scanner.nextLine();
                                System.out.println("Precio del producto");
                                double precioProducto = scanner.nextDouble();
                                break;

                            case "3":
                                System.out.println("Menu de administración de proveedores");
                                System.out.println("Nombre del proveedor");
                                String nombreProveedor = scanner.nextLine();
                                System.out.println("Telefono del proveedor");
                                String telefonoProveedor = scanner.nextLine();
                                System.out.println("Direccion del proveedor");
                                String direccionProveedor = scanner.nextLine();
                                System.out.println("Email del proveedor");
                                String emailProveedor = scanner.nextLine();
                                break;

                            case "4":
                                System.out.println("Menu de administración de pedidos");
                                System.out.println("Fecha del pedido");
                                String fechaPedido = scanner.nextLine();
                                System.out.println("Hora del pedido");
                                String horaPedido = scanner.nextLine();
                                System.out.println("ID del pedido");
                                String idPedido = scanner.nextLine();
                                System.out.println("Nombre del producto");
                                String nombreProductos = scanner.nextLine();
                                System.out.println("Cantidad del producto");
                                int cantidadProducto = scanner.nextInt();
                                System.out.println("Precio del producto");
                                double precioProductos = scanner.nextDouble();
                                System.out.println("Direccion del pedido");
                                String direccionPedido = scanner.nextLine();
                                System.out.println("Telefono del pedido");
                                String telefonoPedido = scanner.nextLine();
                                System.out.println("Estado del pedido");
                                String estadoPedido = scanner.nextLine();
                                break;
                        }
                    case "2":
                        System.out.println("Menu de cuidado de los animales");
                        System.out.println("Indique el nombre del animal");
                        String nombreAnimal = scanner.nextLine();
                        System.out.println("Indique la especie del animal");
                        String especieAnimal = scanner.nextLine();
                        System.out.println("Indique la raza del animal");
                        String razaAnimal = scanner.nextLine();
                        System.out.println("Indique el color del animal");
                        String colorAnimal = scanner.nextLine();
                        System.out.println("Indique el sexo del animal");
                        String sexoAnimal = scanner.nextLine();
                        System.out.println("Indique el edad del animal");
                        String edadAnimal = scanner.nextLine();
                        System.out.println("Indique el peso del animal");
                        String pesoAnimal = scanner.nextLine();
                        System.out.println("Indique la altura del animal");
                        String alturaAnimal = scanner.nextLine();
                        System.out.println("Indique el tipo del animal");
                        String tipoAnimal = scanner.nextLine();
                        System.out.println("Indique el habitat del animal");
                        String habitatAnimal = scanner.nextLine();
                        System.out.println("Indique la alimentación del animal");
                        String alimentacionAnimal = scanner.nextLine();
                        System.out.println("Indique la reproducción del animal");
                        String reproduccionAnimal = scanner.nextLine();
                        System.out.println("Indique los cuidados del animal");
                        String cuidadosAnimal = scanner.nextLine();
                        System.out.println("Indique las enfermedades del animal");
                        String enfermedadesAnimal = scanner.nextLine();
                        System.out.println("Indique las vacunas del animal");
                        String vacunasAnimal = scanner.nextLine();
                        System.out.println("Indique el estado de salud del animal");
                        boolean saludAnimal = scanner.nextBoolean();
                        System.out.println("Indique el comportamiento del animal");
                        boolean comportamientoAnimal = scanner.nextBoolean();
                        System.out.println("Indique el id del animal");
                        int idAnimal = scanner.nextInt();


                }
        }
    }
 }
}
