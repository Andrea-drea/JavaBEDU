
import java.util.Objects;
//Clase que representa una cuenta fiscal asociada a un contribuyente
public class CuentaFiscal {
    //Atributos encapsulados
    private final String rfc;      //RFC del contribuyente (inmutable)
    private double saldoDisponible; //Saldo actual en la cuenta

    // Constructor
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        //Validación para evitar saldos negativos
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo.");
            this.saldoDisponible = 0;   //Se asigna 0 en caso de valor inválido
        }
    }

    // Getter para el saldo disponible
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Validación del RFC con Objects.equals()
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    //Muestra la información de la cuenta fiscal en consola
    public void mostrarCuenta(){
        System.out.println("\uD83C\uDFE6 Cuenta Fiscal registrada con RFC: " + rfc + " . Saldo disponible: $" + saldoDisponible);
    }
}
