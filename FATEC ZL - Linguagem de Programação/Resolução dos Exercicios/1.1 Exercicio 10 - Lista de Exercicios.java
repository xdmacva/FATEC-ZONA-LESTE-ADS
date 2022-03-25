/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int x,y,dif;
       
       x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
       y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
       dif=x-y;
       JOptionPane.showMessageDialog(null,"A diferença de \n"+x+" - "+y+" = "+dif);

    }
}
