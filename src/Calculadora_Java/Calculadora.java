package Calculadora_Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class Calculadora extends JFrame implements ActionListener {

    private JButton btnsuma, btnresta, btnmulti, btndiv, btnlimpar, btnraiz, btnpotencia, btnsalir;
    private JTextField valor1, valor2, camporesultado;
    JLabel label1, label2;


    public void Controles () {

        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        label1 = new JLabel("DIGITE O PRIMEIRO VALOR: ");
        contenedor.add(label1);
        valor1 = new JTextField(10);
        contenedor.add(valor1);

        label2 = new JLabel("DIGITE O SEGUNDO VALOR: ");
        contenedor.add(label2);
        valor2 = new JTextField(10);
        contenedor.add(valor2);

        btnsuma = new JButton("+");
        contenedor.add(btnsuma);
        btnsuma.addActionListener(this);

        btnresta = new JButton("-");
        contenedor.add(btnresta);
        btnresta.addActionListener(this);

        btnmulti = new JButton("x");
        contenedor.add(btnmulti);
        btnmulti.addActionListener(this);

        btndiv = new JButton("/");
        contenedor.add(btndiv);
        btndiv.addActionListener(this);

        btnraiz = new JButton("√");
        contenedor.add(btnraiz);
        btnraiz.addActionListener(this);

        btnpotencia = new JButton("Pot");
        contenedor.add(btnpotencia);
        btnpotencia.addActionListener(this);

        camporesultado = new JTextField(10);
        contenedor.add(camporesultado);

        btnlimpar = new JButton("Limpar");
        btnlimpar.addActionListener(this);
        contenedor.add(btnlimpar);

        btnsalir = new JButton("Salir");
        btnsalir.setBackground(Color.red);
        contenedor.add(btnsalir);
        btnsalir.addActionListener(this);

    }

    public Calculadora() {

        super("Calculadora");
        // cargo Controles

        Controles();
        setSize(900, 400);
        setLocationRelativeTo(null);
        setVisible(true);

    }



    public void actionPerformed (ActionEvent e) {
        double num1, num2, resu;
        String resultado;
        if (e.getSource() == btnsuma) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 + num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado);


            }

        }

        if (e.getSource() == btnmulti) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 * num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado);
            }

        }
        if (e.getSource() == btndiv) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                try {
                  resu=num1/num2;
                  resultado=String.valueOf(resu);
                  camporesultado.setText(resultado.toString());
                }
                catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "Divisao entre cero no eres valida" ,
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (e.getSource() == btnpotencia){
        if (valor1.getText().equals("") || valor2.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Los datos no estan completos",
                    "ERROR" , JOptionPane.ERROR_MESSAGE);
        } else{
            num1=Double.parseDouble(valor1.getText());
            num2=Double.parseDouble(valor2.getText());
            resu=Math.pow(num1, num2);
            resultado=String.valueOf(resu);
            camporesultado.setText(resultado);

           }
        }
        if (e.getSource() == btnraiz){
            if (valor1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Dejaste en blanco el campo",
                        "ERROR" , JOptionPane.ERROR_MESSAGE);
            }else{
                num1=Double.parseDouble(valor1.getText());
                if(num1>=0);
                {
                    resu = Math.sqrt(num1);
                    resultado = String.valueOf(resu);
                    camporesultado.setText(resultado);
                }  {
                    JOptionPane.showMessageDialog(null, "Raiz negativa.",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource() == btnlimpar){
            valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
        }
        if(e.getSource()== btnsalir) {
            System.exit(0);
        }
    }

}


