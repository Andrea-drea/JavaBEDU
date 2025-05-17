
public class PagoEfectivo extends MetodoPago {

    //Constructor que recibe el monto del pago
    public PagoEfectivo(double monto){
        super(monto); //Llama al contrutor de la base MetodoPago para asignar el monto
    }

    //Implementación del metodo autenticar de la interfaz Autenticable
    //En el caso del pago en efectivo, siempre se considera autenticado (retorna true)
    @Override
    public boolean autenticar (){
        return true;
    }

    //Implementación del metodo abstracto procesarPago de MetodoPago
    //Simula el procesamiento del pago en efectivo
    @Override
    public void procesarPago (){
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
