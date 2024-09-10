package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Teste da classe {@link Conta} usando Spy para realizar o recurso de verificações
 */
@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1000);
    
    @Test
    void validarOrdemDeChamadas() {
    	conta.pagaBoleto(300);
    	
    	InOrder inOrder = Mockito.inOrder(conta);
    	inOrder.verify(conta).pagaBoleto(300);
    	inOrder.verify(conta).validaSaldo(300);
    	inOrder.verify(conta).debita(300);
    	inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }
    
    @Test
    void validarQuantidadeDeChamadas() {
    	conta.validaSaldo(300);
    	conta.validaSaldo(400);
    	conta.validaSaldo(500);
    	
    	Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }
}
