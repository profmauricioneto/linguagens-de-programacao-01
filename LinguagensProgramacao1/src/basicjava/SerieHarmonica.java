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
public class SerieHarmonica {
    public static void main(String[] args) {
        int qtdElem;
        double somaHarm = 0;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.print("Quantidade de Elementos da Série: ");
        qtdElem = scan.nextInt();
        
        for(int i = 1; i <= qtdElem; i++) {
            somaHarm = somaHarm + (double)1/i;
        }
        System.out.println("O valor da séria harmonica né: " + somaHarm);
    }
}
