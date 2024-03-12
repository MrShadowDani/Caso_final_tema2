package InteraccionConVisitantes;

import CuidadoDeLosAnimales.Animales;
import GestionDeHabitats.Habitats;

import java.util.List;

public class InformacionDeHabitatsYAnimales {
    public void mostrarInformacionHabitats (List<Habitats> habitats) {
        for (Habitats habitat : habitats) {
            System.out.println("Nombre: " + habitat.getNombre());
            System.out.println("Descripcion: " + habitat.getDescripcion());
            System.out.println("Tipo: " + habitat.getTipo());
            System.out.println("Temperatura: " + habitat.getTemperatura());
            System.out.println("Humedad: " + habitat.getHumedad());
            System.out.println("Vegetacion: " + habitat.getVegetacion());
            System.out.println("Fauna: " + habitat.getFauna());
            System.out.println("Estado: " + habitat.getEstado());
            System.out.println("Capacidad Maxima: " + habitat.getCapacidadMaxima());
            System.out.println("Numero de animales: " + habitat.getNumAnimales());
            System.out.println("Especie dominante: " + habitat.getEspecieDominante());
        }
    }
    public void mostrarInformacionAnimales (List<Animales> animales) {
        for (Animales animal : animales) {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("Raza: " + animal.getRaza());
            System.out.println("Color: " + animal.getColor());
            System.out.println("Sexo: " + animal.getSexo());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Tipo: " + animal.getTipo());
        }
    }

}
