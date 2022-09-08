/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    /* Num determinado Estado, para transferências de
veículos, o DETRAN cobra uma taxa de 1% para carros
fabricados antes de 1990 e uma taxa de 1.5% para os
fabricados de 1990 em diante, taxa está incidindo sobre
o valor de tabela do carro. O algoritmo abaixo lê o ano
e o preço do carro e a seguir calcula e imprime imposto
a ser pago. */

int ano;
float valor,valorMedia;
printf("Digite o ano do veiculo!\n");
scanf("%d",&ano);
printf("Digite o valor do veiculo!\n");
scanf("%f",&valor);

if(ano <= 1990)
{
    valorMedia = (valor/100) * 1;
}
else
{
    valorMedia =  (valor/100) * 1.5;
}
printf("Valor do imposto a ser pago %.2f",valorMedia);
}
