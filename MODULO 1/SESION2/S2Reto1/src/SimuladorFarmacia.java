//Nos permite leer datos ingresados por el usuario
//Importamos el paquete java.util

import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);

        //Solicitar datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculamos el total
        double totalSinDescuento = precioUnitario * cantidad;

        //Evaluamos si aplica descuento
        //Operador ternario " condición ? valor_si_verdadero : valor_si_falso; " funciona similar a un if-else simples
        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        //Mostrar resumen de la compra
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad"  +  cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?" + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

    //Cerramos scanner
        scanner.close();

    }
}
