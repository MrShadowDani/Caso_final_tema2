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
                System.out.println("4. Mantenimiento y seguridad");
                System.out.println("5. Salir");

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
                        if(saludAnimal == true){
                            System.out.println("El animal está sano");
                        }else{
                            System.out.println("El animal está enfermo");
                        }if (comportamientoAnimal == true){
                            System.out.println("El animal se comporta bien");
                        }else{
                            System.out.println("El animal se comporta mal");
                        }
                        break;

                    case "3":
                        System.out.println("Menu de gestion de habitats");
                        System.out.println("Indique el nombre del habitat");
                        String nombreHabitat = scanner.nextLine();
                        System.out.println("Indique la descripcion del habitat");
                        String descripcionHabitat = scanner.nextLine();
                        System.out.println("Indique las dimensiones del habitat");
                        String dimensionesHabitat = scanner.nextLine();
                        System.out.println("Indique la ubicacion del habitat");
                        String ubicacionHabitat = scanner.nextLine();
                        System.out.println("Indique el tipo del habitat");
                        String tipoHabitat = scanner.nextLine();
                        System.out.println("Indique la temperatura del habitat");
                        String temperaturaHabitat = scanner.nextLine();
                        System.out.println("Indique la humedad del habitat");
                        String humedadHabitat = scanner.nextLine();
                        System.out.println("Indique la vegetacion del habitat");
                        String vegetacionHabitat = scanner.nextLine();
                        System.out.println("Indique la fauna del habitat");
                        String faunaHabitat = scanner.nextLine();
                        System.out.println("Indique el estado del habitat");
                        String estadoHabitat = scanner.nextLine();
                        System.out.println("Indique el id del habitat");
                        int idHabitat = scanner.nextInt();
                        System.out.println("Indique la capacidad maxima del habitat");
                        int capacidadMaximaHabitat = scanner.nextInt();
                        System.out.println("Indique el numero de animales del habitat");
                        int numAnimalesHabitat = scanner.nextInt();
                        System.out.println("Indique la especie dominante del habitat");
                        String especieDominanteHabitat = scanner.nextLine();
                        System.out.println("1. Habitat Acuatico");
                        System.out.println("2. Habitat Terrestre");
                        System.out.println("3. Habitat Aviario");

                        String option3 = scanner.nextLine();

                        switch (option3){
                            case "1":
                                System.out.println("Menu de gestion de habitats acuaticos");
                                System.out.println("Indique el salinidad del habitat");
                                String salinidad = scanner.nextLine();
                                System.out.println("Indique la profundidad del habitat");
                                String profundidad = scanner.nextLine();
                                System.out.println("Indique el tipo de agua");
                                String tipoAgua = scanner.nextLine();
                                System.out.println("Indique el calidad de agua");
                                String calidadAgua = scanner.nextLine();
                                System.out.println("Indique el cantidad de agua");
                                String cantidadAgua = scanner.nextLine();
                                break;
                            case "2":
                                System.out.println("Menu de gestion de habitats terrestres");
                                System.out.println("Indique el tipo de suelo");
                                String tipoSuelo = scanner.nextLine();
                                System.out.println("Indique el cantidad de cuevas");
                                String cantidadCuevas = scanner.nextLine();
                                break;
                            case "3":
                                System.out.println("Menu de gestion de habitats aviarios");
                                System.out.println("Indique la altura de maxima");
                                String alturaMaxima = scanner.nextLine();
                                System.out.println("Indique la cantidad de arboles");
                                String cantidadArboles = scanner.nextLine();
                                System.out.println("Indique la cantidad de nidos");
                                String cantidadNidos = scanner.nextLine();
                                break;
                        }
                    case "4":
                        System.out.println("Menu de mantenimiento y seguridad");
                        System.out.println("¿Qué quieres hacer?");
                        System.out.println("1. Instalaciones");
                        System.out.println("2. Mantenimientos");
                        System.out.println("3. Reparaciones");
                        System.out.println("4. Seguridad");
                        System.out.println("5. Salir");

                        String option4 = scanner.nextLine();

                        switch (option4){
                            case "1":
                                System.out.println("Menu de mantenimiento de instalaciones");
                                System.out.println("Indique el nombre de la instalacion");
                                String nombreInstalacion = scanner.nextLine();
                                System.out.println("Indique la ubicacion de la instalacion");
                                String ubicacionInstalacion = scanner.nextLine();
                                System.out.println("Indique el estado de la instalacion");
                                String estadoInstalacion = scanner.nextLine();
                                System.out.println("Indique la fecha del ultimo mantenimiento");
                                String fechaUltimoMantenimiento = scanner.nextLine();
                                break;

                            case "2":

                        }
                    }
                }
        }
    }
 }
