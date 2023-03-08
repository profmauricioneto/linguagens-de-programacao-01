/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicjava;

/**
 *
 * @author maumneto
 */
public class DiffSomaQuad {
    public static void main(String[] args) {
        int somaQuad = 0;
        int quadSoma = 0;
        int cont = 0;
        int diff = 0;
        
        while(cont <= 10) {
            quadSoma = quadSoma + cont;
            somaQuad = somaQuad + cont*cont;
            cont++;
        }
        quadSoma = quadSoma * quadSoma;
        diff = quadSoma - somaQuad;
        System.out.println("Diferença é: " + diff);
    }
}
