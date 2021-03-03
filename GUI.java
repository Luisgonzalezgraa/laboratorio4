import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {
    private JPanel ventana;
    private JPanel ventana2;
    private JButton btn_ingresar;
    private JButton btn_registrarse;
    private JButton btn_respuestas;
    private Register registro;

    public GUI(Register registro) {
        this.registro = registro;
        add(ventana);

        setTitle("StackOverflow");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn_registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Register registro = new Register();
        new GUI(registro).setVisible(true);
    }



}
