package met.org.dominio;

public class Piloto {
    public String nombre;

    public void strategia(String estrategia) {

        switch (estrategia) {
            case "Blandos":
                Strategy strategia1 = new Blandos();
                System.out.println(nombre + " para en boxes y pone neumaticos " + strategia1.paradaEnBoxes());
                break;
            case "Duros":
                Strategy strategia2 = new Duros();
                System.out.println(nombre + " para en boxes y pone neumaticos " + strategia2.paradaEnBoxes());
                break;
            case "Medios":
                Strategy strategia3 = new Medios();
                System.out.println(nombre + " para en boxes y pone neumaticos " + strategia3.paradaEnBoxes());
                break;
        }
    }
}
