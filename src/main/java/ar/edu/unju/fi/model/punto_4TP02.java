package ar.edu.unju.fi.model;


import java.util.ArrayList;
import java.util.List;

public class punto_4TP02 {
	private List<Integer> num = new ArrayList<>() ;
	int posicion;
	

	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public String parimpar() {
		this.num.add(1);
		this.num.add(2);
		this.num.add(3);
		this.num.add(4);
		this.num.add(5);
		this.num.add(6);
		this.num.add(7);
		this.num.add(8);
		
			if (num.get(posicion)% 2 == 0) {
		        return "par";
		    } else {
		        return "impar";
		    }
			
	}
		}
		


