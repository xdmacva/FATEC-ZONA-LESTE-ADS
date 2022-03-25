/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      9. Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int x,y,soma;
       
       x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
       y = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
       soma=((x*x)+(y*y));
       JOptionPane.showMessageDialog(null,"A soma dos quadrados é : " + soma);

    }
}
