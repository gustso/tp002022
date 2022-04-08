package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	private int numeroA;
	private int numeroB;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	
	public int sumarNumeros() {
		return numeroA+numeroB;
	}
	
}
