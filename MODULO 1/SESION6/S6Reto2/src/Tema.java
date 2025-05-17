//Definición de la clase Tema, que implementa la interfaz comparable para poder
//ordenar objetos de esta clase
class Tema implements Comparable<Tema> {
    //Atributos de la clase
    String titulo;
    int prioridad;

    //Constructor
    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    //Metodo obligatorio de la interfaz comparable
    //Compara el tema actual con otro tema, basandose en el titulo
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabético
    }

    //Metodo toString sobrescrito para mostrar la información del tema de forma legible
    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}
