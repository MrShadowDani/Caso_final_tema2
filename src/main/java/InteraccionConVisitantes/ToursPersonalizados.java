package InteraccionConVisitantes;

import CuidadoDeLosAnimales.Animales;
import GestionDeHabitats.Habitats;
import java.util.List;
import java.util.stream.Collectors;

public class ToursPersonalizados {
    public void crearTourPersonalizado (Visitantes visitantes, List<Habitats> habitats, List<Animales> animales) {
        System.out.println("El tour personalizado para " + visitantes.getNombre() + " ha sido creado con exito");

        // Filtrar los animales basándose en los gustos del visitante
        List<Animales> animalesFiltrados = animales.stream()
                .filter(animal -> visitantes.getGustos().contains(animal.getTipo()))
                .collect(Collectors.toList());

        System.out.println("Los habitats que visitara son: ");
        for (Habitats habitat : habitats) {
            System.out.println(habitat.getNombre());
        }

        System.out.println("Los animales que visitara son: ");
        for (Animales animal : animalesFiltrados) {
            System.out.println(animal.getNombre());
        }
    }
}