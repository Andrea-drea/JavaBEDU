package Reto02;

public record Entrada_Record (String NombredelEvento, double Precio){
    public void MostrarInformacion(){
        System.out.println("Evento: "+ NombredelEvento + "| Precio: $" + Precio);
    }

}
