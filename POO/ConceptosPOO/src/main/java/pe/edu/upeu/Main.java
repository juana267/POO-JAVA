package pe.edu.upeu;

import pe.edu.upeu.modelo.Persona;
//Clase
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona = new Persona();//Creando un Objeto
        //persona.nombre="David";
        //persona.edad=36;
        //aplicar concepto encapsulamiento
        persona.setNombre("Jose");
        persona.setEdad(36);
        System.out.println(persona.getNombre()+"\t"+persona.getEdad());
    }
}