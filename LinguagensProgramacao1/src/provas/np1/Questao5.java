/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provas.np1;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, prestacao;
        
        System.out.print("Salario: ");
        salario = scan.nextDouble();
        System.out.print("Prestação: ");
        prestacao = scan.nextDouble();
        
        if(prestacao > 0.2*salario) {
            System.out.println("Emprestimo não concedido.");
        } else {
            System.out.println("Emprestimo concedido!");
        }
        scan.close();
    }
}
