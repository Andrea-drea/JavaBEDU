    //Crea la clase vuelo
public class Vuelo {

    //🔐Atributos
    final String codigoVuelo; //código único del vuelo ✈️
    String destino; // ciudad destino del vuelo 🗺️
    String horaSalida; //hora de salida en formato 24h ⏰
    Pasajero asientoReservado; // referencia al pasajero que reservó el asiento (puede ser null)

    //🧱Constructor
    public Vuelo (String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo= codigoVuelo;
        this.destino= destino;
        this.horaSalida= horaSalida;
        this.asientoReservado= null;
    }

    public boolean reservarAsiento (Pasajero p){
        if (asientoReservado == null){
            asientoReservado= p;
            System.out.println( "✅ Reserva realizada con éxito.");
            return true;
        } else{
            System.out.println("❌ El asiento ya está reservado.");
            return false;
        }
    }

    public boolean reservarAsiento (String nombre, String pasaporte){
        return reservarAsiento(new Pasajero (nombre, pasaporte));
    }

    public void cancelarReserva(){
        if (asientoReservado != null){
            System.out.println("❌ Cancelando reserva..." );
            asientoReservado= null;
        }else{
            System.out.println("❌ No hay reserva para cancelar.");
        }
    }

    public String obtenerItinerario (){
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre (): "[Sin reserva]";
        return "\n ✈\uFE0F Itinerario del vuelo:\n "
                +"Código: " + codigoVuelo + "\n"
                +"Destino: " + destino + "\n"
                +"Salida: " + horaSalida + "\n"
                +"Pasajero: " + pasajeroInfo + "\n";
        }
    }
