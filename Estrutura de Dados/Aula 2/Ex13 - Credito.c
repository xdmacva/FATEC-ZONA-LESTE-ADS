/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    /* Um banco concederá um crédito especial aos seus
clientes, variável com o saldo médio no último ano. Faça
um algoritmo que leia o saldo médio de um cliente e
calcule o valor do crédito de acordo com a tabela abaixo.
Mostre uma mensagem informando o saldo médio e o
valor do crédito. */

int cargo;
float valorMedia,saldoMedio,valorTotal;


printf("Digite o saldo médio!\n");
scanf("%f",&saldoMedio);

if(saldoMedio <= 200)
{
    
}
if(saldoMedio > 200 && saldoMedio <= 400)
{
    valorMedia = (saldoMedio/100) * 20;
    
}
if(saldoMedio > 400 && saldoMedio <= 600)
{
    valorMedia = (saldoMedio/100) * 30;
}
if(saldoMedio > 600)
{
    valorMedia = saldoMedio * 0.4;
}
valorTotal=saldoMedio+valorMedia;

printf("Antigo Saldo %.2f",saldoMedio);
printf("\nValor do Credito %.2f",valorMedia);
printf("\nValor total %.2f",valorTotal);
}
