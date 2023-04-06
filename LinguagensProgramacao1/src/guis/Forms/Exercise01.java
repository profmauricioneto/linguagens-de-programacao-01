/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.Forms;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class Exercise01 extends JFrame {
    public Exercise01() {
        super("Formulário");
        setLayout(null);
        Container container = getContentPane();
        
        JLabel firstnameLabel = new JLabel("Nome");
        JLabel lastnameLabel = new JLabel("Sobrenome");
        JTextField firstnameText = new JTextField();
        JTextField lastnameText = new JTextField();
        JButton sendButton = new JButton("Send");
        JRadioButton mascButton = new JRadioButton("Masculino", true);
        JRadioButton femButton = new JRadioButton("Feminino");
        
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(femButton);
        radioButtonGroup.add(mascButton);
        
        container.add(firstnameLabel);
        container.add(lastnameLabel);
        container.add(firstnameText);
        container.add(lastnameText);
        container.add(sendButton);
        container.add(mascButton);
        container.add(femButton);
        
        firstnameLabel.setBounds(20, 20, 60, 20);
        firstnameText.setBounds(100, 20, 250, 20);
        lastnameLabel.setBounds(20, 60, 80, 20);
        lastnameText.setBounds(100, 60, 250, 20);
        mascButton.setBounds(20, 100, 200, 20);
        femButton.setBounds(20, 130, 200, 20);
        sendButton.setBounds(100, 160, 100, 20);
        
        setSize(400, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Exercise01 exampleForms = new Exercise01();
        exampleForms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
