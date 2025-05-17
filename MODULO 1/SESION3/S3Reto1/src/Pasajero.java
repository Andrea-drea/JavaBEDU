// Creamos la clase pasajero
public class Pasajero {

    //📋 Atributos
    private String nombre; //nombre del pasajero 👤
    private String pasaporte; // número de pasaporte ✈️

    //🛠️Métodos
    public Pasajero(String nombre, String pasaporte){
        this.nombre= nombre;
        this.pasaporte= pasaporte;
    }
    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }
}
