import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosJavaSwing extends JFrame {

    public EventosJavaSwing() {
        // Configurar la ventana principal
        setTitle("Eventos en Java");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear componentes
        JButton clickButton = new JButton("Haz clic aquí");
        JTextField keyEventInput = new JTextField(20);
        JLabel hoverLabel = new JLabel("Pasa el ratón por aquí");
        JButton submitButton = new JButton("Enviar");

        // Agregar componentes a la ventana
        add(clickButton);
        add(keyEventInput);
        add(hoverLabel);
        add(submitButton);

        // Evento click
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Has hecho clic en el botón!");
            }
        });

        // Evento mouseover (mouseEntered) y mouseout (mouseExited)
        hoverLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                hoverLabel.setText("¡Estás sobre mí!");
                hoverLabel.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                hoverLabel.setText("Pasa el ratón por aquí");
                hoverLabel.setForeground(Color.BLACK);
            }
        });

        // Evento keydown (keyPressed)
        keyEventInput.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Tecla presionada: " + e.getKeyChar());
            }
        });

        // Evento submit (equivalente a un clic en el botón "Enviar")
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Formulario enviado, pero no se recargará la página.");
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar la ventana
        EventosJavaSwing ventana = new EventosJavaSwing();
        ventana.setVisible(true);
    }
}