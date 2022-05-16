package ar.edu.unju.fi.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Frutas {
  ArrayList<String> Frut = new ArrayList<>();
  int i;

  public void setI(int i) {
    this.i = i;
  }

  public int getI() {
    return i;
  }

  public ArrayList<String> par(){
    ArrayList<String> fruit = new ArrayList<String>();
    Frut.add("Manzana");
    Frut.add("Banana");
    Frut.add("Mandarina");
    Frut.add("Naranja");
    Frut.add("Ciruela");
    Frut.add("Frutilla");
    int aux=Frut.size();
    for(int i=0;i<aux;i++){
      fruit.add(Frut.get(i));
    }
    return fruit;
  }

  public ArrayList<String> borrar(){
    if(this.i<=Frut.size()){
      Frut.remove(this.i);
    }
    return Frut;
  }

  public int cantidad(){
    int cantidad=Frut.size();
    return cantidad;
  }
}
