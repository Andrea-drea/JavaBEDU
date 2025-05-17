
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌌 Él está ahí, frente a ti, como si el universo se hubiera detenido solo para este instante.");
        System.out.println("🌹 Extiende su mano... no dice nada, pero sus ojos lo gritan todo.");
        System.out.println();
        System.out.println("💭 Y tú piensas: '¿Y si me rompo? ¿Y si me salvo?'");
        System.out.println();
        System.out.println("1. Tomar su mano. Aunque dé miedo.");
        System.out.println("2. Retroceder. Porque a veces amar también asusta.");
        System.out.print("Elige (1 o 2): ");

        String input = scanner.nextLine().trim();
        System.out.println(); // Espacio para respiro emocional

        return input.equals("1");
    }
}

