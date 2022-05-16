package ar.edu.unju.fi.model;

import java.util.ArrayList;

/*6.- Solicite al usuario que ingrese 10 números enteros por consola y guardarlos en un arreglo de tipo
entero. Luego muestre los números en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.*/
public class numerosinvertidos {
  ArrayList<Integer> numeros = new ArrayList<Integer>();
  int aux;
  public void setAux(int aux) {
    this.aux = aux;
  }
  public int getAux() {
    return aux;
  }
  public ArrayList<Integer> Reverso(){
    ArrayList<Integer> inv = new ArrayList<Integer>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);
    numeros.add(7);
    numeros.add(8);
    numeros.add(9);
    numeros.add(10);
    for(int i=numeros.size()-1;i>=0;i--){
      inv.add(numeros.get(i));
    }
    return inv;
  }
}
