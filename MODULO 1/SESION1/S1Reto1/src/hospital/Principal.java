package hospital;

//Importar la clase scanner

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente p1= new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        p1.nombre= input.nextLine();

        System.out.println("Ingresa la edad: ");
        p1.edad= input.nextInt();
        input.nextLine();

        System.out.println("Ingresa el número de expediente ");
        p1.numerodeExpediente = input.nextLine();

        //Decirle al scanner que ya no habrá más información
        input.close();

        p1.mostrarInformacion();

    }
}
