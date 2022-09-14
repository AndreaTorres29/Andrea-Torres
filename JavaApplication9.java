/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author M&M
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
    int numero1;
    int numero2;
    int numero3;
    int suma;

  System.out.println("Escriba un numero entero: ");
    numero1 = Entrada.nextInt();
    
    System.out.println("Escriba un numero entero: ");
    numero2 = Entrada.nextInt();

  System.out.println("Escriba un numero entero: ");
    numero3 = Entrada.nextInt();

  suma = numero1 + numero2 + numero3; 

  System.out.println("El total de la suma es: " + suma);
    }
    


    
  }
