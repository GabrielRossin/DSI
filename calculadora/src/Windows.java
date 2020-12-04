import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Windows extends javax.swing.JFrame {

    JLabel resolucao = new JLabel();
    JTextField texto = new JTextField(25);

    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonLimapar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JTextField jTextField1;


    public Windows() {
        this.Interface();
    }

    public void iniciar() {
        JFrame frame = new Windows();
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo((Component) null);
        frame.setVisible(true);
    }


    private void Interface() {

        JPanel superior = new JPanel();
        superior.setLayout(new FlowLayout());
        superior.add(this.resolucao);
        superior.add(this.texto);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(superior, "Center");


        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonResultado = new javax.swing.JButton();
        jButtonLimapar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();


        JPanel inferior = new JPanel();
        inferior.setLayout(new GridLayout(4, 4));
        inferior.add(jButton7);
        inferior.add(jButton8);
        inferior.add(jButton9);
        inferior.add(jButtonDividir);
        inferior.add(jButton4);
        inferior.add(jButton5);
        inferior.add(jButton6);
        inferior.add(jButtonMultiplicar);
        inferior.add(jButton1);
        inferior.add(jButton2);
        inferior.add(jButton3);
        inferior.add(jButtonSubtrair);
        inferior.add(jButton0);
        inferior.add(jButtonResultado);
        inferior.add(jButtonLimapar);
        inferior.add(jButtonSomar);

        jButton1.setText("1");
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "1");

        });

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "2");

        });

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "3");

        });

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "4");

        });

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "5");

        });

        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "6");

        });

        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "7");

        });

        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton8.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "8");

        });

        jButton9.setText("9");
        jButton9.setActionCommand("9");
        jButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton9.addActionListener((aE) ->
        {

            this.texto.setText(this.texto.getText() + "9");
        });

        jButtonSomar.setText("+");
        jButtonSomar.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSomar.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "+");
        });

        jButtonSubtrair.setText("-");
        jButtonSubtrair.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSubtrair.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "-");
        });

        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMultiplicar.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "*");

        });

        jButtonDividir.setText("/");
        jButtonDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonDividir.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "/");
        });

        jButton0.setText("0");
        jButton0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0.addActionListener((aE) ->
        {
            this.texto.setText(this.texto.getText() + "0");
        });

        jButtonResultado.setText("=");
        jButtonLimapar.setText("Limpar");
        jButtonResultado.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonResultado.addActionListener(this::ActionListener);
        jButtonLimapar.addActionListener((e) -> {
            this.texto.setText("");
        });


        panel.add(inferior, "South");
        this.add(panel);


    }

    private void ActionListener(ActionEvent aE)
    {
        String calculoInformado = this.texto.getText();
        String operador = "";
        Double[] numeros = new Double[2];
        int c = 0;

        for (int i = 0; c < 2; ++i)
        {
            if (!Character.isDigit(calculoInformado.charAt(i)))
            {
                operador = String.valueOf(calculoInformado.charAt(i));
            }
            else
            {
                numeros[c] = Double.parseDouble(String.valueOf(calculoInformado.charAt(i)));
                ++c;
            }
        }

        if (numeros != null || !operador.isEmpty())
        {
            this.texto.setText(this.calcularResultado(numeros, operador));
        }

    }

    public String calcularResultado(Double[] num, String operador)
    {
        double resul = 0.0D;

        if (operador.equals("+"))
        {
            resul = num[0] + num[1];
        }
        else
        {
            if (operador.equals("-"))
            {
                resul = num[0] - num[1];
            }
            else
            {
                if (operador.equals("*"))
                {
                    resul = num[0] * num[1];
                }
                else
                {
                    if (operador.equals("/"))
                    {
                        resul = num[0] / num[1];
                    }
                }


            }


        }
        return "" + resul;

    }
}

