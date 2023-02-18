package Calculadora_Java;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.*;






class Calculadora_Java {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Calculadora calc = new Calculadora();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}



