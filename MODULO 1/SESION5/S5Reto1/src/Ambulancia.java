
public class Ambulancia extends UnidadEmergencia {
    //Atributos que representan los componentes de la ambulancia
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //Constructor
    public Ambulancia(String nombre, String nombreOperador){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }
    //metodo que simula la secuencia completa de operacion de la ambulancia
    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }

    //Implementación del método abstracto respoder de la clase UnidadEmergencia
    @Override
    public void responder (){
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }
}
