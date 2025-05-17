public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision){
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena(){
        dialogo.mostrarDialogo( "La noche lo envuelve todo. El claro, oculto entre árboles, parece un secreto que solo tú debías encontrar.");
        dialogo.mostrarDialogo("Él aparece entre sombras, como si el viento lo hubiera traído. No dice nada al principio, pero su mirada lo dice todo.");
        dialogo.mostrarDialogo( "No deberías estar aquí tan tarde... Aunque me alegra que lo estés.");

        boolean eleccion = decision.tomarDecision();

        if (eleccion) {
            dialogo.mostrarDialogo( "Tus dedos tiemblan al tocar los suyos, pero no retrocedes. Algo en ti... se siente en casa.");
            dialogo.mostrarDialogo( "Ven. Quiero mostrarte lo que el resto del mundo no entiende.");
        } else {
            dialogo.mostrarDialogo( "No fue miedo. Fue protección. Y eso también es una forma de amar.");
            dialogo.mostrarDialogo( "Está bien... Solo prométeme que no olvidarás este momento.");
        }

        transicion.siguienteEscena();
    }

    public static void main(String[] args){
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}