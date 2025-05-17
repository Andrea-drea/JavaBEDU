//Clase abstracta
public abstract class UnidadEmergencia {
    //Atributo que almacena el nombre de la unidad de emergencia
    String nombre;

    //Constructor que inicializa el nombre de la unidad
    public UnidadEmergencia (String nombre){
        this.nombre=nombre;
    }

    //Metodo concreto que simula la activación de la unidad
    public void activarUnidad(){
        System.out.println("🚨 Activando unidad: " + nombre);
    }

    //Metodo abstracto que debe ser implementado por las subclases
    //Define el comportamiento especifico de respuesta de la unidad
    public abstract void responder ();
}
