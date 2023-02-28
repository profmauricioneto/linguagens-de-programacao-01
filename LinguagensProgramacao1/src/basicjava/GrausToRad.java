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
public class GrausToRad {
    public static void main(String[] args) {
        double radianos, graus;
        final double pi = 3.1415;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor em graus: ");
        graus = scan.nextDouble();
        
        //radianos = (graus * 3.1415)/180;
        //radianos = (graus * pi)/180;
        radianos = (graus * Math.PI)/180;
        
        System.out.println("O valor em radiano é: " + radianos);
        scan.close();
    }
}
