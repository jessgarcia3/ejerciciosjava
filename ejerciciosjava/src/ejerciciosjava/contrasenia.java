/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.*;
import java.util.Scanner;

class contrasenia{
  public contrasenia(){
    
  }
  public static void contrasenia(){
    final int max = 8;
    final int numeros = 2;
    final int digitos = 2;
    int numeroscontador = 0;
    int digitoscontador = 0;
  
  System.out.println("Ingrese una contraseña: ");

    Scanner input = new Scanner (System.in);

    String contrasenia = input.nextLine();

    for (int i=0; i < contrasenia.length(); i++){
      char c = contrasenia.charAt(i);
      if (Character.isDigit(c))
        numeroscontador++;
      else if (c>=33&&c<=46||c==64){
        digitoscontador++;
      }
    }
if (contrasenia.length() >= max && numeroscontador >= numeros && digitoscontador >= digitos) {
    System.out.println("Su contraseña es valida");
  }
    else{
  System.out.println("Tu contraseña no contiene los siguientes caracteres: ");
  if (contrasenia.length() < max)
    System.out.println("Se necesitan 8 caracteres");
  if (numeroscontador < numeros)
    System.out.println("La contraseña debe contener números");
  if (digitoscontador < digitos)
    System.out.println("La contraseña debe contener dos digitos");
      
  }
  }
}
