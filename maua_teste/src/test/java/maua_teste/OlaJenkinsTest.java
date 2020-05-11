package maua_teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OlaJenkinsTest {
	
	private String resultadoEsperado = "Ola, Jenkins";
	
	@Test
	public void test () {
		OlaJenkins instancia = new OlaJenkins();
		assertEquals(resultadoEsperado, instancia.hello());	
	}

}
