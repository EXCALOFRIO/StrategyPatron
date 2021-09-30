package met.org.aplicacion;

import met.org.dominio.*;

public class Principal {
    public static void main(String[] args) {
        Piloto alonso = new Piloto();
        alonso.nombre = "Alonso";
        alonso.strategia("Duros");

        Piloto hamilton = new Piloto();
        hamilton.nombre = "Hamilton";
        hamilton.strategia("Blandos");
    }
}
