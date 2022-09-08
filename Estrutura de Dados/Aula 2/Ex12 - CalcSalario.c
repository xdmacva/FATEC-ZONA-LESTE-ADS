/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    /* Uma empresa concederá um aumento de salário aos
seus funcionários, variável de acordo com o cargo,
conforme a tabela abaixo. Faça um algoritmo que leia o
salário e o cargo de um funcionário e calcule o novo
salário. Se o cargo do funcionário não estiver na tabela,
ele deverá, então, receber 40% de aumento. Mostre o
salário antigo, o novo salário e a diferença. */

int cargo;
float valorSalario,valorMedia,valorTotal;

printf("Digite o Cod do cargo!\n");
scanf("%d",&cargo);
printf("Digite o valor do Salario!\n");
scanf("%f",&valorSalario);

if(cargo == 1001)
{
    valorMedia = (valorSalario/100) * 10;
}
if(cargo == 1002)
{
    valorMedia = (valorSalario/100) * 20;
}
if(cargo == 1003)
{
    valorMedia = (valorSalario/100) * 30;
}
if(cargo > 1003 || cargo < 1001)
{
    valorMedia = valorSalario * 0.4;
}
valorTotal=valorSalario+valorMedia;

printf("Antigo Salario %.2f",valorSalario);
printf("\nReajuste de %.2f",valorMedia);
printf("\nValor do imposto a ser pago %.2f",valorTotal);
}
