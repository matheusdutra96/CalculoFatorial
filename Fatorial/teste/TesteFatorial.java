import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFatorial {

	/* Eu decidi testar 4 tipos de valores.
	 * O primeiro foi um número positivo maior do que 1, já que o fatorial se aplica a qualquer número
	 * dessa categoria.
	 * O segundo e o terceiro foram o 1 e o 0, que como indicado na literatura sobre fatorial, são 
	 * exceções e portanto seu cálculo não segue o mesmo procedimento dos números maiores do que 1.
	 * E o quarto e último valor foi um número negativo, que seria um valor não aceito para cálculo de fatorial, 
	 * porém, ainda seria uma possível entrada do usuário e portanto o programa retorna o próprio número
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
