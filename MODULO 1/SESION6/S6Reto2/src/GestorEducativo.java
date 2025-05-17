
import java.util.Collections; //Para ordenar listas
import java.util.Comparator; // Definir ordenamientos personalizados
import java.util.concurrent.CopyOnWriteArrayList; // Lista segura para acceso concurrente
import java.util.concurrent.ConcurrentHashMap; //Mapa seguro para acceso concurrente

public class GestorEducativo {
    public static void main(String[] args) {

        //Se crea una lista de temas que puede ser modificada de forma segura
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        //Se agregan varios temas con diferentes prioridades
        temas.add(new Tema("Español", 3));
        temas.add(new Tema("Matematicas", 1));
        temas.add(new Tema("Historia", 2));
        temas.add(new Tema("Programación", 2));

        //Ordenar la lista alfabeticamente usando el orden definido en Tema
        Collections.sort(temas);
        System.out.println("-Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t); //Se imprime cada tema
        }

        //Ordenar la lista según la prioridad usando un Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // Ordena de menor a mayor
            }
        });

        //Mostrar los temas ordenados por prioridad
        System.out.println("\n -Temas ordenados por prioridad (1-3):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        //Se crea un mapa seguro para uso en concurreencia
        //asocia cada tema con un recurso en línea
        ConcurrentHashMap<String, String> recurso = new ConcurrentHashMap<>();
        recurso.put("Español", "https://espanol");
        recurso.put("Matematicas", "https://matematicascurso");
        recurso.put("Historia", "https://historia-universal");
        recurso.put("Programación", "https://aprendeprogrmacion");

        //Mostrar todos los recursos disponibles por tema
        System.out.println("\n \uD83D\uDCDA-Repositorio de recursos por tema:");
        for (String tema : recurso.keySet()) {
            System.out.println(tema + " → " + recurso.get(tema)); //Muestra cada tema con su URL correspondiente
        }
    }
}
