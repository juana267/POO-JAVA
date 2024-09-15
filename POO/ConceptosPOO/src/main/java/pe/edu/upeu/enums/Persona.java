package pe.edu.upeu.enums;

enum GENERO{Masculino, Femenino}

public class Persona {
    enum ESTADO_CIVIL{Casado, Divorciado, Viudo,Soltero}
    private String nombre;
    private String apellido;
    private ESTADO_CIVIL estado;
    private GENERO genero;
    public String dni;


    public static void main(String[] args) {
        System.out.println(GENERO.Masculino);

        for (ESTADO_CIVIL estado : ESTADO_CIVIL.values()) {
            System.out.println(estado);
        }
    }


}
