package met.org.dominio;

public class Blandos implements Strategy {

    String tipoDeNeumatico = "blandos";

    
    @Override
    public String paradaEnBoxes() {
        
        return Piloto.nombre + " para en boxes y pone neumaticos " + tipoDeNeumatico;
    }

}
