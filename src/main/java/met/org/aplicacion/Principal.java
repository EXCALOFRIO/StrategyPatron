package met.org.aplicacion;

import met.org.dominio.*;

public class Principal {
    public static void main(String[] args) {
        // ESTRATEGIAS

        Strategy estrategia1 = new Blandos();
        Strategy estrategia2 = new Medios();
        Strategy estrategia3 = new Duros();

        // PILOTO1
        Piloto alonso = new Piloto();
        alonso.nombre = "Alonso";
        alonso.strategia(estrategia1);

        // PILOTO2
        Piloto hamilton = new Piloto();
        hamilton.nombre = "Hamilton";
        hamilton.strategia(estrategia2);

        // PILOTO3
        Piloto bottas = new Piloto();
        bottas.nombre = "Bottas";
        bottas.strategia(estrategia3);
    }
}
