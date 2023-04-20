/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.JTextArea;

import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 *
 * @author maumneto
 */
public class JTextAreaExample extends JFrame {
    JTextArea inputTextArea;
    JTextArea resultTextArea;
    JButton sendButton;

    public JTextAreaExample() {
        super("JTextArea Example");
        Container container = getContentPane();
        
        inputTextArea = new JTextArea();
        resultTextArea = new JTextArea();
        sendButton = new JButton("Send");
        
        container.add(inputTextArea);
        container.add(resultTextArea);
        container.add(sendButton);
        
        inputTextArea.setBounds(20, 20, 300, 150);
        sendButton.setBounds(20, 180, 100, 30);
        resultTextArea.setBounds(20, 220, 300, 150);
        
        setSize(400, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        JTextAreaExample jtextareaExample = new JTextAreaExample();
        jtextareaExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
