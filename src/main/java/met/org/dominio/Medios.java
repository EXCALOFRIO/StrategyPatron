package met.org.dominio;

public class Medios implements Strategy {

    String tipoDeNeumatico = "medios";

    @Override
    public String paradaEnBoxes() {

        return Piloto.nombre + " para en boxes y pone neumaticos " + tipoDeNeumatico;
    }

}
