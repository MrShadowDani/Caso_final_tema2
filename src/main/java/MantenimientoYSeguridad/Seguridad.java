package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Seguridad {
    //Caracteristicas de la seguridad
    private final List<Camara> camaras;
    private final List<Sensor> sensores;

    public Seguridad() {
        this.camaras = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }

    public void agregarCamara(Camara camara) {
        this.camaras.add(camara);
    }

    public void agregarSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    public void monitorearZoo() {
        for (Camara camara : camaras) {
            camara.monitorear();
        }
        for (Sensor sensor : sensores) {
            sensor.detectarMovimiento();
        }
    }

    public static class Camara {
        private final String ubicacion;
        private String estado;

        public Camara(String ubicacion, String estado) {
            this.ubicacion = ubicacion;
            this.estado = estado;
        }

        public void monitorear() {
            // Logica para monitorear
            System.out.println("Monitoreando desde la cámara en " + ubicacion);
        }

        public void activar() {
            this.estado = "activado";
            System.out.println("Cámara en " + ubicacion + " activada.");
        }

        public void desactivar() {
            this.estado = "desactivado";
            System.out.println("Cámara en " + ubicacion + " desactivada.");
        }

        public String getEstado() {
            return estado;
        }
    }

    public static class Sensor {
        private final String ubicacion;
        private String estado;

        public Sensor(String ubicacion, String estado) {
            this.ubicacion = ubicacion;
            this.estado = estado;
        }

        public void detectarMovimiento() {
            // Logica para detectar movimiento
            System.out.println("Detectando movimiento desde el sensor en " + ubicacion);
        }


        public void activar() {
            this.estado = "activado";
            System.out.println("Sensor en " + ubicacion + " activado.");
        }

        public void desactivar() {
            this.estado = "desactivado";
            System.out.println("Sensor en " + ubicacion + " desactivado.");
        }

        public String getEstado() {
            return estado;
        }
    }
}