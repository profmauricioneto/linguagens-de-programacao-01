/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class ExampleJOptionPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example of JOptionPane");
        frame.setLayout(null);

        JLabel firstnameLabel = new JLabel("Nome");
        JLabel lastnameLabel = new JLabel("Sobrenome");
        JTextField firstnameText = new JTextField();
        JTextField lastnameText = new JTextField();
        JButton sendButton = new JButton("Send");

        frame.getContentPane().add(firstnameLabel);
        frame.getContentPane().add(firstnameText);
        frame.getContentPane().add(lastnameLabel);
        frame.getContentPane().add(lastnameText);
        frame.getContentPane().add(sendButton);

        firstnameLabel.setBounds(20, 20, 60, 20);
        firstnameText.setBounds(100, 20, 250, 20);
        lastnameLabel.setBounds(20, 60, 80, 20);
        lastnameText.setBounds(100, 60, 250, 20);
        sendButton.setBounds(100, 100, 100, 20);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstnameField = firstnameText.getText();
                String lastnameField = lastnameText.getText();

//                if (firstnameField.equals("") || lastnameField.equals("")) {
//                    JOptionPane.showMessageDialog(null, "Algum campo está vazio!", "Aviso", 1);            
//                } else {
//                    JOptionPane.showMessageDialog(null, "Enviado!", "Confirmação", 1); 
//                }
//            }
                if (firstnameField.equals("")) {
                    JOptionPane.showMessageDialog(null, "O campo NOME esta vazio!", "Erro", 1);

                } else {
                    if (lastnameField.equals("")) {
                        JOptionPane.showMessageDialog(null, "O campo SOBRENOME esta vazio!", "Erro", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Enviado!", "Confirmação", 1);
                    }
                }
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
