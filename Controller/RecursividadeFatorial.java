package Controller;

public class RecursividadeFatorial {

	public RecursividadeFatorial() {

		super();
	}

	public int fatorial(int fat) {
		//ponto de parada
		if (fat <= 1) {
			return 1;

		}
		//fun��o do termo anterior 
		return fat * fatorial(fat - 1);
	}

}
