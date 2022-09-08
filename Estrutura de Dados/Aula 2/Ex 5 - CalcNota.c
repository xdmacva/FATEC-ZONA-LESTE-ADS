/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n1,n2,n3,n4;
    printf("Digite a 1º Nota.\n");
    scanf("%d",&n1);
    printf("Digite a 2º Nota.\n");
    scanf("%d",&n2);
    printf("Digite a 3º Nota.\n");
    scanf("%d",&n3);
    printf("Digite a 4º Nota.\n");
    scanf("%d",&n4);
    
    
    if(((n1 && n2 && n3 && n4) < 1 ) || ((n1 && n2 && n3 && n4 )> 10 )){
        printf("Nota invalida.");
        }
    else
    {
        printf("Nota valida.");
    }
    
    
}
