public class Fatorial {

	public int calculaFatorial(int i) {
		if(i == 0) {
			return 1;
		}
		else if(i == 1) {
			return 1;
		}
		else{
			int resultado = i;
			
			while(i > 1) {
				i = i - 1;
				resultado = resultado * i;
			}
			return resultado;
		}
	}
}
