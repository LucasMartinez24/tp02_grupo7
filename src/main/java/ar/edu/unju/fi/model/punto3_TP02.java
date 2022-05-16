package ar.edu.unju.fi.model;

import java.util.ArrayList;

public class punto3_TP02 {
	private String nombre,apellido;
	private long libreta;
	private ArrayList<Integer> nota =new ArrayList<Integer>() ;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getLibreta() {
		return libreta;
	}
	public void setLibreta(long libreta) {
		this.libreta = libreta;
	}
	public ArrayList<Integer> getNota() {
		return nota;
	}
	public void setNota(ArrayList<Integer> nota) {
		this.nota = nota;
	}

	public int calcularPromedio() {
		nota.add(6);
		nota.add(4);
		nota.add(8);
		nota.add(2);
		nota.add(10);
		int suma=0;
		for(int i:nota) {
			suma=suma+i;
		}
		suma=suma/5;
	return suma;
	}
	public int obtenerNotaMaxima() {
		int mayor=0;
		for(int i:nota) {
			if(i>mayor) {
				mayor=i;
			}
		}
		return mayor;
	}
}
