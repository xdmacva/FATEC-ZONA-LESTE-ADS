/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int num1,num2,divi;
    printf("Digite o 1º Numero.\n");
    scanf("%d",&num1);
        printf("Digite o 2º Numero.\n");
    scanf("%d",&num2);
    
    if(num1>num2){
        divi = num1 - num2;
        printf("%d é o maior numero.",num1);
        printf("\n");
        printf("Calculo da Diferença: %d-%d=%d",num1,num2,divi);
    }
    else
    {
        divi = num2 - num1;
        printf("%d é o maior numero.",num2);
        printf("\n");
        printf("Calculo da Diferença: %d-%d=%d",num2,num1,divi);
    }
    
    
}
