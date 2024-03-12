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
        }
    }
}
