//💻 Implementar un programa que simule un cajero automático básico, aplicando estructuras de control como while, switch, break y continue para navegar entre opciones y validar operaciones del usuario.
// Importamos scanner para poder leer datos de entrada proporcionados por el usuario

import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Crear objeto Scanner
        var saldo = 1000.0; //Saldo inicial
        int opcion; //Variable para almacenar la opción del menú

        //Repetir el menú mientras la opción no sea salir
        do{
            System.out.println("\n \uD83C\uDFD7\uFE0F Bienvenido al servicio de cajero automático");
            System.out.println(" ✅ 1. Consultar saldo");
            System.out.println( "\uD83D\uDCB0 2. Depositar dinero");
            System.out.println(" \uD83D\uDCB8 3. Retirar dinero");
            System.out.println("\uD83D\uDC4B 4. Salir");
            System.out.println("Elige una opción");

            opcion = scanner.nextInt(); //Leer la opción elegida por el usuario
            // Uso de switch para manejar las opciones del menú
            switch (opcion){
                case 1 -> {
                    //Consulta de saldo
                    System.out.println( "Tu saldo actual es: $ " + saldo);
                }
                case 2 -> {
                    //Depositar dinero
                    System.out.println("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0){
                        //Validación: el monto debe ser mayor a cero
                        System.out.println(" El monto debe ser mayor a 0.");
                        continue; //Volver al menú sin modificar el saldo
                    }
                    saldo += deposito; //Aumentar el saldo
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    //Retiro dinero
                    System.out.println("Ingresa el monto a retirar");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0){
                        //Validación: el monto debe ser mayor a cero
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; //Volver al menú sin hacer nada
                    }
                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; //Restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
                    //Salair del programa
                    System.out.println("Gracias por usar el cajero. Hasta pronto!");
                }
                default ->{
                    //Opcion no válida
                    System.out.println("Opción inválida. Intenta nuevamente.");
                }
            }
        }while (opcion != 4); //Salir cuando el usuario elija la opcion 4

        scanner.close();
     }
    }
