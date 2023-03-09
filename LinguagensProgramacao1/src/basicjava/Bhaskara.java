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
public class Bhaskara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        // entrada de dados
        System.out.print("Digite valor de A: ");
        a = scan.nextDouble();
        System.out.print("Digite valor de B: ");
        b = scan.nextDouble();
        System.out.print("Digite valor de C: ");
        c = scan.nextDouble();
        // verificando se é equação do segundo grau.
        if(a == 0) {
            System.out.println("Não é equação do segundo grau!");
        } else {
            double delta, x1, x2;
            delta = b*b - 4*a*c;
            if(delta < 0) {
                System.out.println("Não existe raizes reais!");
            } else if(delta == 0) {
                x1 = (-b + Math.sqrt(delta))/2*a;
                System.out.println("Somente uma raiz = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta))/2*a;
                x2 = (-b - Math.sqrt(delta))/2*a;
                System.out.println("Possui duas raizes!");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        scan.close();
    }
}
