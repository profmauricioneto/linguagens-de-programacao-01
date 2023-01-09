/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author maumneto
 */
public class JTextFieldExample3 {

    public static void main(String[] args) {

        // create elements of the GUI
        JFrame frame = new JFrame("JTextFieldExample");
        JLabel firstname_label = new JLabel("First Name: ");
        JLabel lastname_label = new JLabel("Last Name: ");
        JTextField firstname_textfield = new JTextField();
        JTextField lastname_textfield = new JTextField();
        JButton buttonShow = new JButton("Click Here");
        JLabel result_label = new JLabel();
        JButton buttonClear = new JButton("Clear");

        // adding these elements in the frame
        frame.getContentPane().add(firstname_label);
        frame.getContentPane().add(lastname_label);
        frame.getContentPane().add(firstname_textfield);
        frame.getContentPane().add(lastname_textfield);
        frame.getContentPane().add(buttonShow);
        frame.getContentPane().add(result_label);
        frame.getContentPane().add(buttonClear);

        // disabling the auto-layout
        frame.setLayout(null);

        // set the position of the elements
        firstname_label.setBounds(20, 20, 100, 20);
        firstname_textfield.setBounds(120, 20, 300, 20);
        lastname_label.setBounds(20, 50, 100, 20);
        lastname_textfield.setBounds(120, 50, 300, 20);
        buttonShow.setBounds(150, 90, 100, 20);
        buttonClear.setBounds(280, 90, 100, 20);
        result_label.setBounds(20, 120, 300, 20);

        // adding an action to the button (when the button clicks)
        buttonShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname = firstname_textfield.getText().toUpperCase();
                String lastname = lastname_textfield.getText().toUpperCase();
                if (firstname.isEmpty() || lastname.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada vazia!", "Error", 1);
                } else {
                    result_label.setText("Hello, Sr(a). " + firstname + " " + lastname);
                }
            }
        });
        // action of clear button
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstname_textfield.setText("");
                lastname_textfield.setText("");
                result_label.setText("");
            }
        });

        // configurate the frame
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
