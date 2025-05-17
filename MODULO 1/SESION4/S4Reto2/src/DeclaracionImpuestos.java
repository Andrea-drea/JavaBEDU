
//Crea un record llamado DeclaracionImpuestos
//Este es una clase inmutable que almacena datos de manera concisa
//En este caso, representa una declaración de impuestos con dos campos:
//-rfcContribuyente (cadena de texto) y -montoDeclarado (número decimal)


public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {

}
