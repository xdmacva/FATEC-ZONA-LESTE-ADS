/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      11. Receba o raio de uma circunferência. Calcule e mostre o comprimento da
        circunferência.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int raio;
       double circunf;
       raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio da circunferencia: "));
       circunf= 2*3.14*raio;
       JOptionPane.showMessageDialog(null,"A area da circunferencia é \n"+circunf+" cm ");

    }
}
