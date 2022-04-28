programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um numero \n")
		leia(numero)
		acumular(numero)

	}
	
	funcao acumular(inteiro numero)
	{
		inteiro acumulado = 0
			enquanto(acumulado < numero)
			{
			acumulado = acumulado + 1
			escreva(acumulado,"\n")
			} 

	
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */