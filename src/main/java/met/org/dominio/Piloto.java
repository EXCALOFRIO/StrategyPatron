package met.org.dominio;

public class Piloto {
    public static String nombre;

    public void strategia(Strategy estrategia) {
        System.out.println("\n" + estrategia.paradaEnBoxes());
    }
}
