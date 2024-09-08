package pe.edu.upeu.poliabstract;

public abstract class Animal {
    public abstract void emitirSonido();

    public void dormir(){
        System.out.println("Ya quiero dormir...no molestes!!");
    }

    public void comer(String comida, String tipo){
        switch (tipo){
            case "liquido":{
                System.out.println("Tomando mi aguita!!"); break;
            }
            case "fruta":{
                System.out.println("Esta rica esta "+comida+"...!!"); break;
            }
            default:
                System.out.println("No me gusta esta(e) "+tipo);
        }

    }


}
