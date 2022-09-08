/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
int main()
{
    int valor1,valor2,valor3,valor4,valor5,menor,maior;
    printf("Digite o 1º valor\n");
    scanf("%d",&valor1);
    
    printf("Digite o 2º valor\n");
    scanf("%d",&valor2);
    
    printf("Digite o 3º valor\n");
    scanf("%d",&valor3);
    
    printf("Digite o 4º valor\n");
    scanf("%d",&valor4);
    
    printf("Digite o 5º valor\n");
    scanf("%d",&valor5);
    
    if(valor1<valor2){
        menor = valor1;
        maior = valor2;
    }
    if(valor1 > valor2)
    {
        menor = valor2;
        maior = valor1;
    }
    if(valor3 < menor)
    {
        menor = valor3;
    }
    if(valor3 > maior)
    {
        maior = valor3;
    }
    if(valor4 < menor)
    {
        menor = valor4;
    }
    if(valor4 > maior)
    {
        maior = valor4;
    }
    if(valor5 < menor)
    {
        menor = valor5;
    }
    if(valor5 > maior)
    {
        maior = valor5;
    }
    printf("Menor valor: %d",menor);
    printf("\nMaior valor: %d",maior);
    
}
