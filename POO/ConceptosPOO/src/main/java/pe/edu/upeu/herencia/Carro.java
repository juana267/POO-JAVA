package pe.edu.upeu.herencia;
//Clase carro ---Aplicando Herencia
public class Carro extends Vehiculo{
    String tipo;
    String color;
    private String modelo;

    public void mostrarCaracteristicas(){
        marca="Toyota";
        modelo="Hilux";
        tipo="Automatico";
        color="Red";
    }


    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mostrarCaracteristicas();
        System.out.println("Marca: "+carro.marca+"\nModelo: "+carro.modelo
                +"\nTipo: "+carro.tipo+"\nColor: "+carro.color);
        carro.emitirSonido(); //Usando metodos aplicando Herencia

    }
}
