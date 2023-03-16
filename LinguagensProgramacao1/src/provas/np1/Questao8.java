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
public class Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pesoIdeal, altura;
        String sexo;
        
        System.out.print("Sexo (Homem/H ou Mulher/M): ");
        sexo = scan.nextLine();
        
        System.out.print("Altura: ");
        altura = scan.nextDouble();
        
        switch(sexo.toUpperCase()){
            case "H":
            case "HOMEM":
                pesoIdeal = 72.7*altura - 58;
                System.out.print("Peso Ideal: " + pesoIdeal);
                break;
            case "M":
            case "Mulher":
                pesoIdeal = 62.1*altura - 44.7;
                System.out.print("Peso Ideal: " + pesoIdeal);
                break;
            default:
                System.out.println("Entrada Invalida!");
        }
    }
}
