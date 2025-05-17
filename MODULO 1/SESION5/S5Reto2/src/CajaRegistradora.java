//Clase principal que simula el funcionamiento del una caja registradora
public class CajaRegistradora {
    public static void main(String[] args) {

        //Se crea un arreglo de objetos MetodoPago con diferentes tipos de pagos
        MetodoPago[] pagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false)
        };

        for (MetodoPago pago : pagos) {
            //Se verifica si el pago pasa la autenticación
            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago(); //Procesa el pago
                pago.mostrarResumen(); //Muesra un resumen del pago
            } else {
                //En caso de que falle la autenticación, se notifica el error
                System.out.println("❌ Fallo de autenticación.\n" + pago.getClass().getSimpleName() + " No válido ");
            }
            //Espacio en blanco para separar la salida de cada transacción
            System.out.println ();
        }
    }
}
