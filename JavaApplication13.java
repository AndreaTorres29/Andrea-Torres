/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author M&M
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
    System.out.println("Ingrese el numero de base: ");
    double base = Entrada.nextDouble();
    System.out.println("Ingrese el numero exponente: ");
    double exponente = Entrada.nextDouble();
    double resultado = Math.pow(base, exponente);
    System.out.println("El resultado seria: "+ resultado);
    }
    
}


    