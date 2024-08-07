package ejercicio19_cap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrianguloEquilateroInterfaz {

    private JFrame frame;
    private JTextField txtLado;
    private JTextArea txtOutput;

    public TrianguloEquilateroInterfaz() {
        // Crear la ventana principal
        frame = new JFrame("Cálculo de Triángulo Equilátero");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear componentes
        JLabel lblLado = new JLabel("Valor del lado:");
        txtLado = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        // Agregar componentes al panel
        frame.add(lblLado);
        frame.add(txtLado);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(btnCalcular);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(new JScrollPane(txtOutput));

        // Configurar acción del botón
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularYMostrar();
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    private void calcularYMostrar() {
        try {
            // Leer datos del campo de texto
            double lado = Double.parseDouble(txtLado.getText());

            // Crear un objeto TrianguloEquilatero
            TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

            // Mostrar resultados
            txtOutput.setText(triangulo.mostrarDatos());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese un valor válido para el lado.",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrianguloEquilateroInterfaz());
    }
}

