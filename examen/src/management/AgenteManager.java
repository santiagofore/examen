package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.util.ArrayList;

public class AgenteManager {
    private ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer(); 

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente);
        }
    }

    public void incrementarNivelAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente al que desea incrementar el nivel: ");
        ConsoleUtils.limpiarBuffer();

        Agente agenteEncontrado = null;
        for (Agente agente : agentes) {
            if (agente.getId() == id) {
                agenteEncontrado = agente;
                break;
            }
        }

        if (agenteEncontrado != null) {
            agenteEncontrado.incrementarNivel();
            System.out.println("Nivel del agente " + agenteEncontrado.getNombre() + " incrementado.");
        } else {
            System.out.println("Agente con ID " + id + " no encontrado.");
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Incrementar Nivel de Agente");
            System.out.println("4. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer(); 

            switch (opcion) {
                case 1 -> registrarAgente();
                case 2 -> mostrarAgentes();
                case 3 -> incrementarNivelAgente();
                case 4 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
