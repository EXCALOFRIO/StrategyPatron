package met.org.dominio;

public class Duros implements Strategy {

    String tipoDeNeumatico = "duros";

    
    @Override
    public String paradaEnBoxes() {
        
        return Piloto.nombre + " para en boxes y pone neumaticos " + tipoDeNeumatico;
    }

}
