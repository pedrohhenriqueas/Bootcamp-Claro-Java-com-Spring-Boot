package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

/**
 * Teste da classe {@link EnviarMensagem} exemplificando Spy
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

	@Spy
	private EnviarMensagem enviarMensagem;
	
	
	@Test
	void verificarComportamentoDaClasse() {
		Mockito.verifyNoInteractions(enviarMensagem);
		
		enviarMensagem.adicionarMensagem( new Mensagem("Hello World"));
		
		Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
	}
}
