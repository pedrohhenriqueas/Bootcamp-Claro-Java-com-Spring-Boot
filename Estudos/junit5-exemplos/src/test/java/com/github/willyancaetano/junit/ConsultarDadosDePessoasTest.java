package com.github.willyancaetano.junit;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoasTest {

	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach
	void inereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("Pedro", LocalDateTime.of(2002, 9, 5, 0, 0)));
	}
	
	@AfterEach
	void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("Pedro", LocalDateTime.of(2002, 9, 5, 0, 0)));
	}
	
	@Test
	void validarDadosRetorno() {
		Assertions.assertTrue(true);
	}
	
	@Test
	void validarDadosRetorno2() {
		Assertions.assertNull(null);
	}
	
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
	}
	
}
