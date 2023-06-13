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
public class QuestaoFibonacci {
    
    public static void fibonacci(int qtdTermos) {
        if (qtdTermos <= 0) {
            System.out.println("Não existe sequencia de fibonacci com essa quantidade");
        } else {
            int a = 0;
            int b = 1;
            int aux;
            for (int i = 1; i <= qtdTermos; i++) {
                aux = a + b;
                System.out.println(aux);
                a = b;
                b = aux;
            }
        }
    }
    
    public static void main(String[] args) {
        int qtdTermos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        qtdTermos = scan.nextInt();
        QuestaoFibonacci.fibonacci(qtdTermos);
    }
}
