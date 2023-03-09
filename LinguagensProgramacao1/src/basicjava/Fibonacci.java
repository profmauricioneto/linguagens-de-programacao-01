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
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int termos, a = 0, b = 1, aux;
        System.out.print("Digite a quantidade de termos: ");
        termos = scan.nextInt();
        if (termos <= 0) {
            System.out.println("Não existe serie de fibonacci.");
        } else if (termos == 1) {
            System.out.println("0");
        } else if (termos == 2) {
            System.out.println("0\n1");
        } else {
            System.out.println("0\n1");
            for (int i = 2; i < termos; i++) {
                aux = a + b;
                System.out.println(aux);
                a = b;
                b = aux;
            }
        }
        scan.close();
    }
}
