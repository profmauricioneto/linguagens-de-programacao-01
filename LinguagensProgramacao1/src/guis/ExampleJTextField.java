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
import javax.swing.JTextField;


public class ExampleJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example JTextField");
        JTextField input = new JTextField();
        JButton button = new JButton("OK");
        JLabel output = new JLabel();
        
        frame.setLayout(null);
        frame.getContentPane().add(input);
        frame.getContentPane().add(button);
        frame.getContentPane().add(output);
        
        input.setBounds(30, 20, 150, 20);
        button.setBounds(30, 50, 100, 20);
        output.setBounds(30, 80, 150, 20);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                name = input.getText();
//                output.setText("Hello There, " + name);
                output.setText(name);
                input.setText("");
            }
        });
        
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
