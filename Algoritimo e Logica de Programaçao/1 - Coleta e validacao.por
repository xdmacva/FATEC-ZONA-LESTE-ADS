programa
{
	
	funcao inicio()
	{
		inteiro numero
		faca
		{
			escreva("Digite um numeroero entre 10 a 100 \n - ")
			leia(numero)
		} 
		enquanto(nao validar(numero))
	}
	funcao logico validar(inteiro numero)
	{
		se(numero >= 10 e numero <= 100)
		{
			escreva("O numeroero é valido \n")
			retorne verdadeiro
		}
		senao
		{
			escreva("O numeroero é invalido \n")
			retorne falso
		}
	
	}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */