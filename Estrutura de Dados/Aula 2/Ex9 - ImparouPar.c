/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    /*Faça um algoritmo que leia um número e mostre uma
mensagem indicando se este número é par ou ímpar e
se é positivo ou negativo. */

int num1;

printf("Digite um número!\n");
scanf("%d",&num1);

if((num1/2)==1)
{
    printf("O número digitado é Par!");
}
else
{
    printf("O número digitado é Impar!");
}

}
