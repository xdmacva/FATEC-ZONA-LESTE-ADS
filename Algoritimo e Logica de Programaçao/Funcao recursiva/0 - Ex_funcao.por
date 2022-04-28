programa
{

	funcao inicio()
	{
	inteiro num
	num = 1
	validar(num)
	escreva(validar(num))
	}
	
	funcao inteiro validar(inteiro n)
	{
		inteiro s
		se(n != 100){
			s=n+validar(n+1)
			retorne s
			}
			senao {
				retorne n
				}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */