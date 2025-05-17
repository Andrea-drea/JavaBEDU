package Reto02;


public class Principal {
public static void main (String[]args){

    //Creación objetos de tipo Entrada

    Entrada entrada1 = new Entrada("Concierto KPOP", 2640.90);
    Entrada entrada2 = new Entrada("Concierto Rauw", 500.50);

    //Mostrar datos en la consola

    entrada1.MostrarInformacion();
    entrada2.MostrarInformacion();

    //Entrada extra

    Entrada_Record entrada3 = new Entrada_Record("Concierto Duki", 999.50);
    entrada3.MostrarInformacion();


    }
}