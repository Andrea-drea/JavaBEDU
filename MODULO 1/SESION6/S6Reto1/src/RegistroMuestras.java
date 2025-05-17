//Importa utilidades como ArrayList y HashMap
import java.util.*;
//Clase principal que simula el registro de muestras biológicas
public class RegistroMuestras {
    public static void main (String []args){

        //Lista para registrar especies de muestras en el orden en que se reciben
        ArrayList<String> listaMuestras = new ArrayList<>();

        //Agrega nombres cientificos de las especies a la lista
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");

        //Imprime la lista de muestras en el orden recibido
        System.out.println("📋 Muestras recibidas en orden:");
        for (int i = 0; i< listaMuestras.size(); i++){
            System.out.println((i + 1 ) + ". " + listaMuestras.get(i));
        }

        //Mapa que relaciona el ID deuna muestra con el nombre del investigador responsable
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        //Asignación de investigadores a muestras por ID
        muestrasInvestigador.put("M-001", "Dra. Hernandez");
        muestrasInvestigador.put("M-002", "Dr. Gomez");
        muestrasInvestigador.put("M-003", "Dra. Sanchez");


        //Imprime todas ls asignaciones de muestras a investigadores
        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry: muestrasInvestigador.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        //Busqueda de un investigador por ID de muestra
        String idBuscar = "M-001";
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));

    }
}
