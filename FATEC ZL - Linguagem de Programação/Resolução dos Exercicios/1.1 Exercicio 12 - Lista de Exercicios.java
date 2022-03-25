/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      12. Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e 
        quantos anos terá daqui a 17 anos.

 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int anoNasc,anoAtual,idade;
       double circunf;
       anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual : "));
       anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de nascimento : "));
       
       idade = anoAtual - anoNasc;
       JOptionPane.showMessageDialog(null,"  Idade   \n"+idade+" anos. ");

    }
}
