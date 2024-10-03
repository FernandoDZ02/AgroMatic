import javax.swing.*;
import java.awt.event.*;

public class LetrasAZ extends JFrame {
    private JTextField textField;

    public LetrasAZ() {
        // Configurar la ventana
        setTitle("Evento KeyPress en Java");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear el campo de texto
        textField = new JTextField();
        textField.setBounds(50, 50, 300, 30); // Posición y tamaño del campo de texto
        add(textField);

        // Agregar el evento KeyListener al campo de texto
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar(); // Obtener el carácter presionado
                // Comprobar si la tecla presionada está entre 'a' y 'z' o entre 'A' y 'Z'
                if ((keyChar >= 'a' && keyChar <= 'z') || (keyChar >= 'A' && keyChar <= 'Z')) {
                    JOptionPane.showMessageDialog(null, "Has presionado la tecla: " + keyChar);
                }
                // Si se presiona la tecla Enter
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null, "Has presionado Enter!");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        LetrasAZ ventana = new LetrasAZ();
        ventana.setVisible(true);
    }
}