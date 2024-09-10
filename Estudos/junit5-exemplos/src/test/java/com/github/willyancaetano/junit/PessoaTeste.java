/*
    MIT License

    Copyright (c) 2022 Willyan Guimarães Caetano

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */

package com.github.willyancaetano.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {
	
	@Test
	void validarCalculoDeIdade() {
		Pessoa pessoa = new Pessoa("Pedro", LocalDateTime.of(2002, 9, 5, 0, 0));
		Assertions.assertEquals(21, pessoa.getIdade());
	}
	
	
	@Test
	void deveRetornarSeEMaiorDeIdade() {
		Pessoa pedro = new Pessoa("Pedro", LocalDateTime.of(2002, 9, 5, 0, 0));
		Assertions.assertTrue(pedro.ehMaiorDeIdade());
		
		
		Pessoa maria = new Pessoa("Maria", LocalDateTime.now());
		Assertions.assertFalse(maria.ehMaiorDeIdade());
	}
}
