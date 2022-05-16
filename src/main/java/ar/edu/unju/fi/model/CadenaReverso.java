package ar.edu.unju.fi.model;


public class CadenaReverso {
  String aux;

  public void setAux(String aux) {
    this.aux = aux;
  }
  public String getAux() {
    return aux;
  }

  public String Reverso(){
    char[] inv = new char[100];
    int cont=0;
    for(int i=this.aux.length()-1;i>=0;i--){
      inv[cont]= aux.charAt(i);
      cont++;
    }
    String aux2=String.copyValueOf(inv);
    return aux2;
  }
}
