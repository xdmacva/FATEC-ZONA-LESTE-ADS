/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

int main()
{
    int valor1,valor2;
    printf("Digite o 1º valor\n");
    scanf("%d",&valor1);
    
    printf("Digite o 2º valor\n");
    scanf("%d",&valor2);
    
    if(valor1<valor2){
        printf("2º valor %d é maior que 1º valor %d.",valor2,valor1);
    }
    else
    {
        printf("1º valor %d é maior que 2º valor %d.",valor1,valor2);
    }
    
    
}
