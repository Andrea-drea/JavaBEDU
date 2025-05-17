package Reto02;

public class Entrada {

//Declaracion de atributos
String NombredelEvento;
double Precio;

//Constructor
public Entrada (String NombredelEvento, double Precio){
    this.NombredelEvento= NombredelEvento;
    this.Precio= Precio;
    }

    // Metodo público para mostrar información.
    public void MostrarInformacion(){
        System.out.println("Evento: " + NombredelEvento + " | Precio: $" + Precio);

    }

}
