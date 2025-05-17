
public class PagoTarjeta extends MetodoPago {
    //Atributo privado que representa el saldo disponible en la tarjeta
    private double saldoDisponible;

    //Constructor que recibe el monto del pago y saldo disponible
    public PagoTarjeta (double monto, double saldoDisponible){
        //Llamar al constructor de la clase base MetoodoPago para asignar el monto
        super (monto);
        this.saldoDisponible = saldoDisponible;
    }

    //Implementacion del metodo autenticar de la interfaz autenticable
    //Verifica si hay suficiente saldo para cubrir el monto del pago
    @Override
    public boolean autenticar (){
        return saldoDisponible >= monto;
    }

    //Implementación del metodo abstracto procesarPago de MetodoPago
    //Simula el procesamiento del pago con tarjeta
    @Override
    public void procesarPago(){
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
