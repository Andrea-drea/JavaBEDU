
public class Principal {
    public static void main(String[] args) {
        // Crear una declaración de impuestos con RFC y monto declarado
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Crear una cuenta fiscal con RFC y saldo disponible
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostrar la información de la declaración de impuestos
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        //Mostrar información de la cuenta fiscal
        cuenta.mostrarCuenta();

        // Validar si el RFC de la declaración coincide con el de la cuenta
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
