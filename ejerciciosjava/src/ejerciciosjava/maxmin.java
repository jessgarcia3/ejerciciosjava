/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

class maxmin {
  public maxmin() {
    
  }
  public static void maxmin(){
    int nro;
    nro=10;
    int numeros[] = new int[nro];
    for (int i=0;i<nro;i++){
      numeros[i]=(int)(Math.random()*100+1);
      System.out.println("arreglo "+i+ "="+numeros[i]);   
  }
    //vamor max y min
    int max, min;
    max=min=numeros[0];
    for(int i = 0; i< numeros.length; i++){
      if(numeros[i]>max){
        max=numeros[i];
      }
    }
    System.out.println("El valor maximo es: "+max+" El valor minimo es: "+min);
}
}
