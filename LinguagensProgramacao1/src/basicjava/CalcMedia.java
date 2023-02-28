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
public class CalcMedia {
    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        // calculo da média
        media = (nota1 + nota2)/2;
        System.out.println("Media = " + media);
        // estado do aluno com base na média
        if (media >= 7.0) {
            System.out.println("Aprovado! Vai embora!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo...");
            } else {
                System.out.println("Final! Bora ver se ainda passa...");
                float notaFinal, mediaFinal;
                System.out.print("Digite a nota da final: ");
                notaFinal = scan.nextFloat();
                mediaFinal = (media + notaFinal)/2;
                System.out.println("Media Final = " + mediaFinal);
                if (mediaFinal >= 5.0) {
                    System.out.println("Aprovado na Final! Passou raspando hein!");
                } else {
                    System.out.println("Reprovado na Final! Bem que tentou...");
                }
            }
        }
    }
}
