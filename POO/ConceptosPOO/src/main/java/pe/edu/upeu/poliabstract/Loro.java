package pe.edu.upeu.poliabstract;

public class Loro extends Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Hey estas entendiendo!!");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz...zzz");
    }

    @Override
    public void comer(String comida, String tipo) {
        if(tipo.equals("fruta")){
            System.out.println("Esta fruta ("+comida+") como me gusta...esta deli!!");
        }else {
            System.out.println("No se que me han dado no me gusta!!!");
        }
    }
}
