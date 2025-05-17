
public class PagoTransferencia extends MetodoPago {
    //Atributo privado que indica si la transferencia ha sido validada externamente
    private boolean validadoExternamente;

    //Constructor que recibe el monto del pago y si la tranferencia ha sido validada
    public PagoTransferencia (double monto, boolean validadoExternamente){
       //Llama al constructor de la clase base MetodoPago para asignar el monto
        super (monto);
        this.validadoExternamente = validadoExternamente;
    }

    // Implementación del método autenticar de la interfaz Autenticable
    // Solo autentica si la transferencia ha sido validada externamente
  @Override
    public boolean autenticar (){
        return validadoExternamente;
    }

    // Implementación del método abstracto procesarPago de MetodoPago
    // Simula el procesamiento de un pago por transferencia bancaria
    @Override
    public void procesarPago(){
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}
