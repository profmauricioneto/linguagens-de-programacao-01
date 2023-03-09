/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, fat = 1;
        System.out.print("Digite o valor para o fatorial: ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            fat = i * fat;
            System.out.println(fat);
        }
    }
}
