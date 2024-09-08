package pe.edu.upeu.calcfx.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class CalcControl {

    @FXML
    TextField txtResultado;

    // Método que responde a todas las acciones de los botones
    @FXML
    public void accionButton(ActionEvent event) {
        System.out.println("Holas");
        Button button = (Button) event.getSource();
        switch (button.getId()) {
            case "btn7", "btn8", "btn9", "btn6", "btn5", "btn4", "btn3", "btn2", "btn1", "btn0" -> escribirNumeros(button.getText());
            case "btnSum", "btnMul", "btnRest", "btnDiv" -> operador(button.getText());
            case "btnIgual" -> calcularResultado();
            case "btnC", "AC" -> txtResultado.clear();  // Limpiar resultado con CE y AC
            case "btnRaiz" -> calcularRaiz();
            case "btnPotencia" -> calcularCuadrado();
            case "btnPoten" -> calcularPorcentaje(); // Agregar este método si lo implementas
            case "btnDv1" -> calcularInverso();
            case "btnBin" -> convertirBinario();
            case "btnPI" -> insertarPi();  // Insertar valor de Pi
            case "ON" -> encenderCalculadora(); // Agregar funcionalidad para ON si es necesario
        }
    }

    public void escribirNumeros(String valor) {
        txtResultado.appendText(valor);
    }

    public void operador(String valor) {
        txtResultado.appendText(" " + valor + " ");
    }

    public void calcularResultado() {
        String[] valores = txtResultado.getText().split(" ");
        double val1 = Double.parseDouble(valores[0]);
        double val2 = Double.parseDouble(valores[2]);
        switch (valores[1]) {
            case "+" -> txtResultado.setText(String.valueOf(val1 + val2));
            case "-" -> txtResultado.setText(String.valueOf(val1 - val2));
            case "/" -> txtResultado.setText(String.valueOf(val1 / val2));
            case "*" -> txtResultado.setText(String.valueOf(val1 * val2));
        }
    }

    public void calcularRaiz() {
        double val = Double.parseDouble(txtResultado.getText());
        txtResultado.setText(String.valueOf(Math.sqrt(val)));
    }

    public void calcularCuadrado() {
        double val = Double.parseDouble(txtResultado.getText());
        txtResultado.setText(String.valueOf(Math.pow(val, 2)));
    }

    // Implementación adicional para el botón de potencia, si es necesario
    public void calcularPorcentaje() {
        double val = Double.parseDouble(txtResultado.getText());
        txtResultado.setText(String.valueOf(val / 100));
    }

    public void calcularInverso() {
        double val = Double.parseDouble(txtResultado.getText());
        txtResultado.setText(String.valueOf(1 / val));
    }

    public void convertirBinario() {
        int val = Integer.parseInt(txtResultado.getText());
        txtResultado.setText(Integer.toBinaryString(val));
    }

    public void insertarPi() {
        txtResultado.setText(String.valueOf(Math.PI));
    }

    // Método para el botón ON si tiene algún comportamiento específico
    public void encenderCalculadora() {
        txtResultado.setText("0");
    }
}
