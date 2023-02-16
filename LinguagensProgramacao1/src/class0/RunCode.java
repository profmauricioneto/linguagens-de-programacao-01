/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class0;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class RunCode {
    public static void main(String[] args) {
        int x;
        int y = 6;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        int cont = 0;
        while(x < y){
            x = x + 2;
            y = y + 1;
            cont++;
        }
        System.out.println("Quantidade de repeticoes: " + cont);
    }
}
