
public class UnidadBomberos extends UnidadEmergencia{
    //Atributos que representan los componentes de la unidad
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //Constructor que inicializa el nombre de la unidad y nombre del operador
    public UnidadBomberos (String nombre, String nombreOperador){
        super(nombre); // Llama al constructor de la clase base para establecer el nombre de la unidad
        this.gps = new SistemaGPS();
        this.sirena = new Sirena ();
        this.operador = new Operador (nombreOperador);
    }

    //Metodo que simula la secuencia completa de operación de la unidad de bomberos
    public void iniciarOperacion (){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
        System.out.println();
    }

    //Implementación del método abstracto responder de la clase UnidadEmergencia
    @Override
    public void responder (){
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }
}
