public class Principal {
    public static void main(String [] args){
        //👤✈️Crear pasajero y vuelo
    Pasajero pasajero1 = new Pasajero("Andrea Jimenez", "P252124");
    Vuelo vuelo1= new Vuelo("IT206", "Colombia", "23:30");

        //Reservar asiento
        vuelo1.reservarAsiento(pasajero1);

        //Mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());

        //Cancelar reserva
        vuelo1.cancelarReserva();

        //Mostrar nuevamente el itinerario
        System.out.println(vuelo1.obtenerItinerario());

        //Reservar un asiento en el vuelo usando un nombre y pasaporte
        vuelo1.reservarAsiento("Jesús Hernández", "P212524");

         //Mostrar el itinerario
        System.out.println(vuelo1.obtenerItinerario());
    }
}
