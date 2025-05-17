//Importaciones necesarias para el manejo de archivos y rutas
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // 1. Se define la ruta del archivo de configuración, ubicado dentro de una carpeta llamada "config"
        Path rutaArchivo = Paths.get("config/parametros.txt");

        // 2. Se llama al método que escribe los parámetros de simulación en el archivo
        guardarParametros(rutaArchivo);

        // 3. Se verifica que el archivo fue creado correctamente
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ Archivo creado correctamente.");

            // 4. Si el archivo existe, se llama al método para leerlo y mostrar su contenido
            leerParametros(rutaArchivo);
        } else {
            // 5. Si no se encuentra el archivo, se muestra un mensaje de error
            System.out.println("❌ No se pudo crear el archivo.");
        }
    }

    /**
     * Este método se encarga de crear el archivo y escribir los parámetros
     * de entrada necesarios para una corrida de simulación.
     */
    public static void guardarParametros(Path ruta) {
        // 1. Definimos el contenido del archivo como un bloque de texto multilínea
        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // 2. Verificamos si la carpeta "config/" no existe, y la creamos si es necesario
            if (Files.notExists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent()); // Crea todas las carpetas necesarias
            }

            // 3. Escribimos los parámetros en el archivo usando Files.write()
            //    Convertimos el texto en bytes antes de escribir
            Files.write(ruta, parametros.getBytes());

            // 4. Mostramos la ruta absoluta del archivo creado (útil para verificación en sistemas reales)
            System.out.println("📄 Parámetros guardados en: " + ruta.toAbsolutePath());

        } catch (IOException e) {
            // 5. Capturamos y mostramos cualquier error de entrada/salida (ej. permisos, disco lleno, etc.)
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    /**
     * Este método lee el contenido del archivo de parámetros
     * y lo imprime en consola para su verificación antes de correr la simulación.
     */
    public static void leerParametros(Path ruta) {
        try {
            // 1. Leemos el contenido completo del archivo como una sola cadena de texto
            String contenido = Files.readString(ruta);

            // 2. Mostramos el contenido del archivo en consola, simulando una revisión previa a la simulación
            System.out.println("\n📋 Contenido del archivo:");
            System.out.println("-------------------------");
            System.out.println(contenido);
        } catch (IOException e) {
            // 3. Si ocurre un error al leer (archivo corrupto, eliminado, etc.), se informa al usuario
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
