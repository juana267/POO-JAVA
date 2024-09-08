package pe.edu.upeu.encapsulamiento;


public class Loro implements Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Holo Manito .....Aprende pue!!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo...su comidita!!!");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz...zzz..zz");
    }
}
