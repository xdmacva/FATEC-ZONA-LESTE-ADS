/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int profnivel;
    float qtdHoras,valorReceber;
  
  printf("Quantas horas aulas foi dado?\n");
  scanf("%f",&qtdHoras);
  
  printf("Qual o nivel do professor?\n");
  scanf("%d",&profnivel);
  
  if(profnivel < 1 || profnivel > 3)
  {
      printf("Nivel invalido.");
  }
  else
  {
   if(profnivel == 1)
   {
       valorReceber = qtdHoras * 12,00;
   }   
   if(profnivel == 2)
   {
       valorReceber = qtdHoras * 20,31;
   }
   if(profnivel == 3)
   {
       valorReceber = qtdHoras * 37,81;
   }
   printf("Valor a receber devido as horas é %.2f",valorReceber);
  }
    
} 
