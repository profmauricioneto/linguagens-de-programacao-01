/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review_np3;

import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class QuestaoFatorial {
    
    public static int fatorial(int number) {
        if(number < 0) {
            return -1;
        } else {
            int fat = 1;
            for(int i = 1; i <= number; i++) {
                fat = fat * i;
            }
            return fat;
        }
    }
    
    public static void main(String[] args) {
        int number, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        number = scan.nextInt();
        result = QuestaoFatorial.fatorial(number);
        if (result == -1) {
            System.out.println("Não existe fatorial negativo!");
        } else {
            System.out.println("Valor do fatorial: " + result);
        }
    }
}
