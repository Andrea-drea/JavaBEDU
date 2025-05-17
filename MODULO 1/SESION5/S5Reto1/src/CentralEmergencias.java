//Clase principal
public class CentralEmergencias {
    public static void main (String[]args){

        //Creación de instancias de diferentes unidades ed emergencia
        Ambulancia ambulancia = new Ambulancia ("Ambulancia", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        //Iniciar la operación de la ambulancia
        ambulancia.iniciarOperacion();
        System.out.println();

        //Iniciar la operación de la patrulla
        patrulla.iniciarOperacion();
        System.out.println();

        //Iniciar la operación de la unidad de bomberos
        bomberos.iniciarOperacion();

    }
}
