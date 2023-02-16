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
public class ExampleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fValue, sValue, res;
        System.out.print("Entre com o primeiro valor: ");
        fValue = scan.nextInt();
        System.out.print("\nEntre com o segundo valor: ");
        sValue = scan.nextInt();
        res = fValue + sValue;
        System.out.println("\nO resultado da soma é: " + res);
        scan.close();    
    }
}
