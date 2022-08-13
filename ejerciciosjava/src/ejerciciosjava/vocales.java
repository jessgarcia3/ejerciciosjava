/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;


import java.util.Scanner;

class vocales {
  public vocales(){
  }
  public static void vocales() {
    Scanner entrada = new Scanner(System.in);
    String palabra;
    int contador1 = 0, contador2 = 0, consonantes;
    System.out.println("Introduzca una palabra");
    palabra = entrada.nextLine();

    for (int i = 0; i < palabra.length(); i++) {
      contador1++;
    }
    for (int i = 0; i < palabra.length(); i++) {
      if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')
          || (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u')) {
        contador2++;
      }
    }
    consonantes = contador1 - contador2;
    System.out.println("La palabra  " + palabra + "  contiene " + contador2 + "  vocales");
    System.out.println("La palabra  " + palabra + "  contiene " + consonantes + "  consonantes");
  }
}
