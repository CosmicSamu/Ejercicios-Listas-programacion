
public class Burbuja_mejorada {

	public static void main(String[] args) {
		int lista[] = { 6, 8, 4, 17, 3, 9 };
		
		int cant = lista.length;
		
		
		
		//derecha
		for (int i = 0; i < cant - 1; i++) {
			
			
			for (int j = 0; j < lista.length - (i + 1); j++) {

				if (lista[j] > lista[j + 1]) {	
					int x = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = x;
				}
			}
			//izquierda
			
			for(int j=cant-1; j > i; j--) {
				if (lista[j] < lista[j - 1]) {
					int x = lista[j-1];
					lista[j - 1] = lista[j];
					lista[j] = x;
				}
			
			}
			
			
		
				
			
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
		}
	}

}
