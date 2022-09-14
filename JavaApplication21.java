/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author M&M
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    String tipoDia = "";
    String diaSemana = "lunes";

    switch (diaSemana.toLowerCase()) {
      case "lunes":
        tipoDia = "Inicio de la semana";
        break;
      case "martes":
      case "miercoles":
      case "jueves":
        tipoDia = "Mediados de la semana";
        break;
      case "viernes":
       tipoDia = "Incio del fin de semana";
        break;
      case "sabado":
      case "domingo":
        tipoDia = "Fin de la semana";
        break;
    }
    System.out.println(diaSemana + " es " + tipoDia);
  }
}  