
public class Burbuja {

	public static void main(String[] args) {
		int lista[] = { 6, 8, 4, 17, 3, 9 };
		boolean ordenado;
		for (int i = 0; i < lista.length - 1; i++) {
			ordenado = true;
			for (int j = 0; j < lista.length - (i + 1); j++) {

				if (lista[j] > lista[j + 1]) {
					ordenado = false;
					int x = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = x;
				}
			}
			
			if(ordenado) {
				
			}
		}for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
		}
	}
}
