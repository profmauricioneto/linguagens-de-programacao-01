/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.JPassword;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class LoginScreenExample extends JFrame {
    JLabel welcomeLabel = new JLabel("Bem-vindo Usuário!");
    JLabel loginLabel = new JLabel("Login");
    JLabel passLabel = new JLabel("Password");
    JTextField loginText = new JTextField();
    JPasswordField passText = new JPasswordField();
    JButton enterButton = new JButton("Entrar");
    
    public LoginScreenExample() {
        Container container = getContentPane();
        setLayout(null);
        
        container.add(welcomeLabel);
        container.add(loginLabel);
        container.add(passLabel);
        container.add(loginText);
        container.add(passText);
        container.add(enterButton);
        
        welcomeLabel.setBounds(20, 20, 250, 30);
        loginLabel.setBounds(20, 60, 100, 30);
        loginText.setBounds(130, 60, 150, 30);
        passLabel.setBounds(20, 100, 100, 30);
        passText.setBounds(130, 100, 150, 30);
        enterButton.setBounds(20, 140, 250, 30);
        
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        enterButton.setHorizontalAlignment(JButton.CENTER);
        
        LoginEvent event = new LoginEvent();
        enterButton.addActionListener(event);
        
        setSize(350, 250);
        setVisible(true);
    }
    
//    private class Clear implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            loginText.setText("");
//            passText.setText("");
//            loginText.requestFocus();
//        }
//    }
    
    private class LoginEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String login = loginText.getText();
            String pass = new String(passText.getPassword());
            System.out.println("OOCORREUUU!");
            
            if (login.equals("mauricio.moreira")) {
                if(pass.equals("qwerty")) {
                    JOptionPane.showMessageDialog(null, "Login Success", "Verified", 1);  
                } else {
                    JOptionPane.showMessageDialog(null, "Pass Failed", "Error", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", 1);
            }
        }
        
    }
    
    public static void main(String[] args) {
        LoginScreenExample login = new LoginScreenExample();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
