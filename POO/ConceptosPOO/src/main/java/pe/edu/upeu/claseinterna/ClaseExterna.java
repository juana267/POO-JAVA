package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int resultado;
    public void suma(int a, int b) {
        resultado = a + b;
        System.out.println(resultado);
    }

    class ClaseInterna{
        public void resta(int a, int b){
            resultado = a - b;
            System.out.println(resultado);
        }
    }
}

