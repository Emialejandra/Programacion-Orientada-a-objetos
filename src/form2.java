import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame {

    public form2() {
        setTitle("Encuesta de Tres Preguntas");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // PREGUNTA 1
        JLabel p1 = new JLabel("1. ¿Te gusta programar?");
        p1.setBounds(30, 20, 250, 25);
        add(p1);

        JRadioButton p1_si = new JRadioButton("Sí");
        p1_si.setBounds(50, 50, 100, 20);

        JRadioButton p1_no = new JRadioButton("No");
        p1_no.setBounds(150, 50, 100, 20);

        JRadioButton p1_aveces = new JRadioButton("A veces");
        p1_aveces.setBounds(250, 50, 100, 20);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(p1_si);
        grupo1.add(p1_no);
        grupo1.add(p1_aveces);

        add(p1_si);
        add(p1_no);
        add(p1_aveces);

        // PREGUNTA 2
        JLabel p2 = new JLabel("2. ¿Te gusta el diseño?");
        p2.setBounds(30, 90, 250, 25);
        add(p2);

        JRadioButton p2_si = new JRadioButton("Sí");
        p2_si.setBounds(50, 120, 100, 20);

        JRadioButton p2_no = new JRadioButton("No");
        p2_no.setBounds(150, 120, 100, 20);

        JRadioButton p2_aveces = new JRadioButton("A veces");
        p2_aveces.setBounds(250, 120, 100, 20);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(p2_si);
        grupo2.add(p2_no);
        grupo2.add(p2_aveces);

        add(p2_si);
        add(p2_no);
        add(p2_aveces);

        // PREGUNTA 3
        JLabel p3 = new JLabel("3. ¿Te gustan las bases de datos?");
        p3.setBounds(30, 160, 250, 25);
        add(p3);

        JRadioButton p3_si = new JRadioButton("Sí");
        p3_si.setBounds(50, 190, 100, 20);

        JRadioButton p3_no = new JRadioButton("No");
        p3_no.setBounds(150, 190, 100, 20);

        JRadioButton p3_aveces = new JRadioButton("A veces");
        p3_aveces.setBounds(250, 190, 100, 20);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(p3_si);
        grupo3.add(p3_no);
        grupo3.add(p3_aveces);

        add(p3_si);
        add(p3_no);
        add(p3_aveces);

        // BOTÓN ENVIAR (estaba encima de otras cosas)
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(150, 250, 120, 30);
        add(btnEnviar);

        // ACCIÓN BOTÓN
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String r1 = p1_si.isSelected() ? "Sí" :
                        p1_no.isSelected() ? "No" :
                                p1_aveces.isSelected() ? "A veces" : "Sin responder";

                String r2 = p2_si.isSelected() ? "Sí" :
                        p2_no.isSelected() ? "No" :
                                p2_aveces.isSelected() ? "A veces" : "Sin responder";

                String r3 = p3_si.isSelected() ? "Sí" :
                        p3_no.isSelected() ? "No" :
                                p3_aveces.isSelected() ? "A veces" : "Sin responder";

                String mensaje = "Resultados de la encuesta:\n\n" +
                        "1. Programación: " + r1 + "\n" +
                        "2. Diseño: " + r2 + "\n" +
                        "3. Bases de datos: " + r3;

                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new form2();
    }
}
