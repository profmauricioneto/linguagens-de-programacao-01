/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author maumneto
 */
public class ListaChamada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> chamada = new ArrayList<>();
        int qtdChamada;
        String nome;
        
        System.out.print("Quantidade de pessoas: ");
        qtdChamada = scan.nextInt();
        
        for(int i = 0; i < qtdChamada; i++) {
            System.out.print("Nome: ");
            nome = scan.next();
            chamada.add(nome);
        }
        
        for(String n: chamada) {
            System.out.println(n);
        }
        
    }
}
