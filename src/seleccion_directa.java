//Mover todo uno y poner el menor de la posición ultima en moverse 
public class seleccion_directa {

	public static void main(String[] args) {

		int menor;
		int lista[] = { 6, 8, 4, 17, 3, 9 };
		int cantidad = lista.length;
		for (int i = 0; i < cantidad; i++) {
			menor = i;
			for (int j = i + 1; j < cantidad; j++) {
				if (lista[menor] > lista[j]) {
					menor = j;
				}
			}
			if (i != menor) {
				int x = lista[menor];
				for (int j = menor; j > i; j--) {
					lista[j] = lista[j - 1];
					lista[i] = x;
				}
			}
		}
	}

}


// intercambiar sin pasar a la siguiente posición 

	public static void main(String[] args) {

		int menor;
		int lista[] = { 6, 8, 4, 17, 3, 9 };
		int cantidad = lista.length;
		for (int i = 0; i < cantidad; i++) {
			menor = i;
			for (int j = i + 1; j < cantidad; j++) {
				if (lista[menor] > lista[j]) {
					menor = j;
				}
			}
			if (i != menor) {
				int x = lista[menor];
				lista[menor]=lista[i];
				lista[i]=x;
				}
			}
		}
	}


