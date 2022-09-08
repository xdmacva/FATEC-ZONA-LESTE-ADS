/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    char sexo;
    printf("Digite o sexo: F - Feminino ou M - Masculino\n");
    scanf("%c",&sexo);
    
    if(sexo == 'F' || sexo == 'M' || sexo == 'f' || sexo == 'm'){
        if(sexo =='F' || sexo == 'f'){
        printf("Cara aluna, seu resultado é.");
        }
        else
        {
            if(sexo == 'M' || sexo == 'm')
            {
            printf("Caro aluno, seu resultado é.");    
            }
        }
    }
    else
    {
        printf("%c é um sexo invalido.",sexo);
    }
    
    
}
