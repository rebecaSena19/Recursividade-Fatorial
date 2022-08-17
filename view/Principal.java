package view;

import Controller.RecursividadeFatorial;

public class Principal {

	public static void main(String[] args) {

		RecursividadeFatorial fat = new RecursividadeFatorial();
		int fatorial = 10;
		int resultado = fat.fatorial(fatorial);
	System.out.println(resultado);
	}

}
