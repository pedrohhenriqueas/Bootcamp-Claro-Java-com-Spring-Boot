package com.github.willyancaetano.junit;

import java.util.logging.Logger;

public class BancoDeDados {


	private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		//fez algo
		LOGGER.info("Iniciou conexao");
	}
	
	public static void finalizarConexao() {
		//fez algo
		LOGGER.info("Finalizou conexao");
	}
	
	public static void insereDados(Pessoa pessoa) {
		//insere pessoa na DB
		LOGGER.info("insere dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		//remove pessoa da DB
		LOGGER.info("remove dados");
	}
}
	
