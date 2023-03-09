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
public class QuestaoPrestacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, prestacao;
        // entrada de dados
        System.out.print("Digite o valor do salário: ");
        salario = scan.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        prestacao = scan.nextDouble();
        // condição
        System.out.println("Valor da porcentagem: " + 0.2*salario);
        if (prestacao <= 0.2*salario) {
            System.out.println("Emprestimo concedido!");
        } else {
            System.out.println("Emprestimo não concedido!");
        }
    }
}
