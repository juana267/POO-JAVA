package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {
    public static void main(String[] args) {
        Animal a=new Loro();
        a.emitirSonido();
        a.comer();
        a.dormir();
    }
}
