import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> consumosRegistrados = new HashSet<>();

        try {
            System.out.println("Ingrese la cantidad de servidores a monitorear:");
            int cantidadServidores = scanner.nextInt();

            for (int i = 1; i <= cantidadServidores; i++) {
                System.out.printf("Servidor %d - Ingrese consumo de CPU (%%): ", i);

                try {
                    int consumo = scanner.nextInt();

                    // Validaciones básicas
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0 y 100.");
                        i--; // volver a pedir el valor para este servidor
                        continue;
                    }

                    // Verificar duplicado
                    if (!consumosRegistrados.add(consumo)) {
                        System.out.println("⚠️ Advertencia: Valor duplicado. Intente con un nuevo valor.");
                        i--; // volver a pedir el valor para este servidor
                        continue;
                    }

                    // Validación crítica
                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🚨 ¡Consumo crítico detectado en el servidor " + i + "! (" + consumo + "%)");
                    }

                    System.out.println("✅ Consumo registrado correctamente.");

                } catch (InputMismatchException e) {
                    System.out.println("❌ Error: Debe ingresar un valor numérico.");
                    scanner.next(); // limpiar entrada incorrecta
                    i--; // volver a pedir el valor para este servidor
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Entrada inválida. Se esperaba un número entero para la cantidad de servidores.");
        } finally {
            scanner.close();
            System.out.println("🔚 Monitoreo finalizado. Recursos liberados.");
        }
    }
}