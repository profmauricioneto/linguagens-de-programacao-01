/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicjava;

/**
 *
 * @author maumneto
 */
public class TestFor {
    public static void main(String[] args) {
        int somatorio = 0, media, i;
        for(i = 0; i <= 10; i++) {
            somatorio = somatorio + i;
//            System.out.println(i);
        }
        media = somatorio/i;
        System.out.println(media);
    }
}
