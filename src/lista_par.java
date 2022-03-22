
public class lista_par {

	boolean buscaBinaria(T o) {
		int p=0;
		int u=cant-1;
		while(p<=u) {
			int m=(p+u)/2;
			if(o.clave<m) {
				u=m;
				
			}else if(o.clave>m) {
				
				p=m;
			}
			else(o.clave==lista[m].clave){
				return true;
			}
		}
		return (o.clave==lista[m].clave);
	}
}
