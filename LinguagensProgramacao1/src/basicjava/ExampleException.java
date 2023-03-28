/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicjava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class ExampleException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        double resultado;
        
        try {
        System.out.print("Valor: ");
        valor = scan.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error: a wild problem appears: " + e.getMessage());
        }
        try {
            resultado = (double)1/valor;
            System.out.println(resultado);
        } catch(ArithmeticException e) {
            System.out.println("Error: a wild problem appears: " + e.getMessage());
        }
        
    }
}
