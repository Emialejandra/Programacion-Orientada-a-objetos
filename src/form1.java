import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton divisionButton;

    public form1() {
        setTitle("Operaciones Matemáticas");
        setSize(380, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //etiquetas
        JLabel lbl1 = new JLabel("Valor 1:");
        lbl1.setBounds(40, 20, 100, 25);
        add(lbl1);

        JLabel lbl2 = new JLabel("Valor 2:");
        lbl2.setBounds(40, 60, 100, 25);
        add(lbl2);

        JLabel lblRes = new JLabel("Resultado:");
        lblRes.setBounds(40, 100, 100, 25);
        add(lblRes);

        //ingreso de valores
        JTextField txtValor1 = new JTextField();
        txtValor1.setBounds(120, 20, 150, 25);
        add(txtValor1);

        JTextField txtValor2 = new JTextField();
        txtValor2.setBounds(120, 60, 150, 25);
        add(txtValor2);

        JTextField txtResultado = new JTextField();
        txtResultado.setBounds(120, 100, 150, 25);
        txtResultado.setEditable(false);
        add(txtResultado);

        // botones
        JButton btnSumar = new JButton("Sumar");
        btnSumar.setBounds(40, 150, 120, 30);
        add(btnSumar);

        JButton btnRestar = new JButton("Restar");
        btnRestar.setBounds(180, 150, 120, 30);
        add(btnRestar);

        JButton btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setBounds(40, 190, 120, 30);
        add(btnMultiplicar);

        JButton btnDividir = new JButton("Dividir");
        btnDividir.setBounds(180, 190, 120, 30);
        add(btnDividir);

        // validaciones y operaciones
        ActionListener operaciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double v1 = Double.parseDouble(txtValor1.getText());
                    double v2 = Double.parseDouble(txtValor2.getText());
                    double resultado = 0;

                    if (e.getSource() == btnSumar) resultado = v1 + v2;
                    if (e.getSource() == btnRestar) resultado = v1 - v2;
                    if (e.getSource() == btnMultiplicar) resultado = v1 * v2;
                    if (e.getSource() == btnDividir) {
                        if (v2 == 0) {
                            JOptionPane.showMessageDialog(null, "No puedes dividir para cero");
                            return;
                        }
                        resultado = v1 / v2;
                    }

                    txtResultado.setText(String.valueOf(resultado));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos");
                }
            }
        };

        btnSumar.addActionListener(operaciones);
        btnRestar.addActionListener(operaciones);
        btnMultiplicar.addActionListener(operaciones);
        btnDividir.addActionListener(operaciones);

        setVisible(true);
    }

    public static void main(String[] args) {
        new form1();
    }
}
