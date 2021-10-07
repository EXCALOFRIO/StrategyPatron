package met.org.dominio;

public class Piloto {
    public static String nombre;

    
    public void strategia(Strategy x) {
        System.out.println("\n" + x.paradaEnBoxes());
    }
}
