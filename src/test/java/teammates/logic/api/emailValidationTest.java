package tst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import emailValidation.EmailValidation;

class emailValidationTest {
	
	private EmailValidation email; 
	
	
	@Test
	void verificarPrimeiraCondicao() {
		
		String x = "pedro@gmail.com";
		assertEquals("possui", EmailValidation.getEmailValido(x));

	}
	
	@Test 
	void verificarSegundaCondicao() {
		
		String x = "pedro,@gmail.com"; 
		assertEquals("não valido", EmailValidation.getEmailValido(x));
		
	}

}
