public class Patrulla extends UnidadEmergencia {
    //Atributos privados que representan los compenentes de la patrulla
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //Constructor que inicializa el nombre de la patrulla y el nombre del operador
    public Patrulla (String nombre, String nombreOperador){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador (nombreOperador);
    }

    //Metodo que simula la secuencia completa de operación de la patrulla
    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }

    //Implementación del método abstarcto responder de la calse UnidadEmergencia
    @Override
    public void responder(){
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }

}
