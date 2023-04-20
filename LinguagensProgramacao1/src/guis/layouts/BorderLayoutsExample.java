/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guis.layouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maumneto
 */
public class BorderLayoutsExample extends JFrame {
    JButton bNorth, bSouth, bEast, bWest, bCenter;
    
    public BorderLayoutsExample() {
        super("border layout");

        bNorth = new JButton("Button North");
        bSouth = new JButton("Button South");
        bEast = new JButton("Button East");
        bWest = new JButton("Button West");
        bCenter = new JButton("Button Center");
        
        Container cont = getContentPane();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        
        cont.add(bNorth, BorderLayout.NORTH);
        cont.add(bSouth, BorderLayout.SOUTH);
        cont.add(bEast, BorderLayout.EAST);
        cont.add(bWest, BorderLayout.WEST);
        cont.add(bCenter, BorderLayout.CENTER);
                
        setSize(400, 400);
        setVisible(true);
    }
    
    public class ClosePane implements EventListener {

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

    }
    
    public static void main(String[] args) {
        BorderLayoutsExample borderExample = new BorderLayoutsExample();
        borderExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
