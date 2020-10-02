package com.patrones;

public class IteradorConcreto implements Iterador {
	
	private Persona[] listaPersonas;
	private boolean estadoIterador; //No se para que se usa
	private int posicion = 0;

	public IteradorConcreto(Persona[] listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public Boolean tieneSiguiente() {
		if (posicion >= listaPersonas.length || 
				listaPersonas[posicion] == null)
			return false;
		else
			return true;
		
	}
	
	public Object siguiente() {
		Persona persona =  listaPersonas[posicion]; 
		posicion += 1; 
        return persona; 
	}	

}
