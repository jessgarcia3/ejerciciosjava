/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.*;
class promedio {
  public promedio() {
  }
  
  public static void promedio(){
    int nro;
    nro=10;
    int numeros[] = new int[nro];
    for (int i=0;i<nro;i++){
      numeros[i]=(int)(Math.random()*100+1);
      System.out.println("Arreglo"+i+"="+numeros[i]);
    }
    
    //recorrer 
    int suma = 0;
    for (int x = 0; x < numeros.length; x++){
      suma = suma + numeros[x];
    }
    float promedio = suma / numeros.length;
    System.out.printf("Suma: %d. Promedio: %f",suma,promedio);
      }
}
