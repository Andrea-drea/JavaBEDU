//Clase abstracta que implementa la interfaz Autenticable
public abstract class MetodoPago implements Autenticable {
    //Atributo protegido que representa el monto del pago
    protected double monto;

    //Constructor que inicializa el atributo monto
    public MetodoPago (double monto){
        this.monto = monto;
    }

    //Metodo abstracto que debe ser implementado por las subclases
    //Define la lógica específica para procesar el pago
    public abstract void procesarPago();

    //Metodo concreto que muestra un resumen del pago por la consola
    public void mostrarResumen(){

        //Muestra el nombre de la clase que hereda de MetodoPago y el monto
        System.out.println("📄 Tipo: "+ this.getClass().getSimpleName() + "Monto: $ " + monto);

    }
}
