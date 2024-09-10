package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Teste da classe {@link ServicoEnvioEmail} exemplificando testes usando Argument Captor
 */
@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;
    
    @InjectMocks public ServicoEnvioEmail servico;
    
    @Captor
    private ArgumentCaptor<Email> captor;
    
    

    @Test
    void validaDadosEnviadosParaAPlataforma(){
    	String enderecoDeEmail = "Usuario@teste.com.br";
    	String mensagem = "Ola mundo";
    	boolean eformatoHtml = true;
    	
    	
    	servico.enviaEmail(enderecoDeEmail, mensagem, eformatoHtml);
    	
    	Mockito.verify(plataforma).enviaEmail(captor.capture());
    	
    	Email emailCapturado = captor.getValue();
    	
    	Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
    	Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
    	Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
    }
}









