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
public class PesoIdeal {
    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu gênero (h/homem ou m/mulher): ");
        sexo = scan.nextLine();
       
        System.out.print("Digite o sua altura: ");
        altura = scan.nextDouble();
        
        switch(sexo.toUpperCase()) {
            case "H":
            case "HOMEM": {
                peso = (72.7 * altura) - 58;
                System.out.println("Peso Ideal: " + peso);
                break;
            }
            case "M":
            case "MULHER": {
                peso = (62.1 * altura) - 44.7;
                System.out.println("Peso Ideal: " + peso);
                break;
            }
            default:
                System.out.println("Entrada Inválida!");
        }
        
//        if (sexo.equals("HOMEM") || sexo.equals("homem")) {
//            peso = (72.7 * altura) - 58;
//            System.out.println("Peso Ideal: " + peso);
//        } else if (sexo.equals("MULHER") || sexo.equals("mulher")) {
//            peso = (62.1 * altura) - 44.7;
//            System.out.println("Peso Ideal: " + peso);            
//        } else {
//            System.out.println("Entrada Inválida!");
//        }
        
        scan.close();
    }
}
