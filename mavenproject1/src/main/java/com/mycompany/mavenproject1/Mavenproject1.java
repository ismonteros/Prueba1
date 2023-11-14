/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Ian
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        
        double numero1=scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numero2=scanner.nextDouble();
        double suma=numero1+numero2;
        double resta=numero1-numero2;
        double multi=numero1*numero2;
        double divi=numero1/numero2;
        System.out.println("La suma de" +numero1+" y "+numero2+"es: "+suma);
        System.out.println("La resta de" +numero1+" y "+numero2+"es: "+resta);
        System.out.println("La multiplicacion de" +numero1+" y "+numero2+"es: "+multi);
        System.out.println("La division de" +numero1+" y "+numero2+"es: "+divi);
        
                
    }
}
