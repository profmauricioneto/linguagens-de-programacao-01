/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.Forms;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author maumneto
 */
public class FirstExampleForm extends JFrame {
    public FirstExampleForm() {
        super("Título Frame");
        Container container = getContentPane();
        setLayout(null);
        JLabel test = new JLabel("Hello!");
        
        container.add(test);
        
        test.setBounds(20, 50, 200, 20);
        
        setSize(300, 200);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        FirstExampleForm forms = new FirstExampleForm();
        forms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
