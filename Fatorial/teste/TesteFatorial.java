import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFatorial {

	/* Eu decidi testar 4 tipos de valores.
	 * O primeiro foi um n�mero positivo maior do que 1, j� que o fatorial se aplica a qualquer n�mero
	 * dessa categoria.
	 * O segundo e o terceiro foram o 1 e o 0, que como indicado na literatura sobre fatorial, s�o 
	 * exce��es e portanto seu c�lculo n�o segue o mesmo procedimento dos n�meros maiores do que 1.
	 * E o quarto e �ltimo valor foi um n�mero negativo, que seria um valor n�o aceito para c�lculo de fatorial, 
	 * por�m, ainda seria uma poss�vel entrada do usu�rio e portanto o programa retorna o pr�prio n�mero
	 * negativo.
	*/
	@Test
	public void testaFatorialPositivo() {
		Fatorial f = new Fatorial();
		int numero = 5;
		
		assertEquals(120, f.calculaFatorial(numero));
	}
	
	@Test
	public void testaUm() {
		Fatorial f = new Fatorial();
		assertEquals(1, f.calculaFatorial(1));
	}
	
	@Test
	public void testaZero() {
		Fatorial f = new Fatorial();
		assertEquals(1, f.calculaFatorial(0));
	}
	
	@Test
	public void testaNegativo() {
		Fatorial f = new Fatorial();
		int numero = -3;
		assertEquals(-3, f.calculaFatorial(numero));
	}
	
}
