/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      19. Receba 2 valores reais. Calcule e mostre o maior deles.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {

       double valor1,valor2,dif;
       valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
       valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
       
       if(valor1>valor2){
           dif = valor1 - valor2;
           JOptionPane.showMessageDialog(null," O maior valor é "+valor1+"\n A diferença do maior para o menor é "+dif);
       }
       else
       {
           dif = valor2 - valor1;
           JOptionPane.showMessageDialog(null," O maior valor é "+valor2+"\n A diferença do maior para o menor é "+dif);
       }
    }
}
