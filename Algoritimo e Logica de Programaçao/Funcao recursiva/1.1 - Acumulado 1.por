programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro acumulado = 0
		escreva("Digite um numero : ")
		leia(numero)
		enquanto(nao validar(numero,acumulado))
		{
		acumulado = acumulado + 1
		escreva(acumulado,"\n")
		} 

	}
	
	funcao logico validar(inteiro numero , inteiro acumulado)
	{
		se(acumulado < numero)
		{
			retorne falso
		}
		senao
		{
			retorne verdadeiro
		}
	
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */