
public class Operador {
    String nombre; //Atributo

    //Constructor
    public Operador (String nombre){
        this.nombre = nombre;
    }

    //Metodo que simula que el operador se reporta
    public void reportarse(){
        System.out.println("👷 Operador " + nombre + " reportándose.");
    }
}
