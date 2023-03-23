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
public class Nutricionista {
    public static double imc(double peso, double altura) {
        double imc;
        imc = peso / (altura * altura);
        return imc;
    }
    
    public static double pesoIdeal(double altura, String genero) {
        double pesoIdeal = -1;
        if (genero.toLowerCase().equals("homem")) {
            pesoIdeal = 72.7*altura - 58;
        } else if (genero.toLowerCase().equals("mulher")) {
            pesoIdeal = 62.1*altura - 44.7;
        } else {
            System.out.println("Genero inválido!");
        }
        return pesoIdeal;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura, pesoAtual, pesoIdealValor, imcValor;
        String genero;
        
        System.out.print("Altura: ");
        altura = scan.nextDouble();
                
        System.out.print("Peso Atual: ");
        pesoAtual = scan.nextDouble();
                
        System.out.print("Genero: ");
        genero = scan.next();
        
        imcValor = imc(pesoAtual, altura);
        pesoIdealValor = pesoIdeal(altura, genero);
        
        System.out.println("IMC: " + imcValor);
        System.out.println("Peso Ideal: " + pesoIdealValor);

    }
}
