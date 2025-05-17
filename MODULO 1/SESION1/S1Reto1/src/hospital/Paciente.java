/*Desarrollar un programa en Java que registre los datos de un paciente, aplicando
los fundamentos de clases, objetos, atributos, métodos y la entrada de datos por consola.
 */

package hospital;

//Crea una clase llamada paciente

public class Paciente {
    String nombre;
    int edad;
    String numerodeExpediente;

    //Metodo público llamado mostrarInformacion
    public void mostrarInformacion(){

        //Agregamos texto informativo
        System.out.println("\nInformación del (la) paciente: ");

        System.out.println("Paciente:" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Expediente: " + numerodeExpediente);

    }

}
