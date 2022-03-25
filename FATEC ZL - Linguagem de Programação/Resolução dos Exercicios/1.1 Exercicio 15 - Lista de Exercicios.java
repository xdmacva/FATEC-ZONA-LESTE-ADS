/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre 
        a hipotenusa.


 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
   
       double catSim,catOp,hipotenusa,h;
       catSim = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do cateto simples : "));
       catOp = Double.parseDouble(JOptionPane.showInputDialog("Valor do cateto oposto : "));
       h = ((catSim*catSim)+(catOp*catOp));
       hipotenusa = Math.sqrt(h);
       JOptionPane.showMessageDialog(null," O valor da hipotenusa é "+hipotenusa+".");

    }
}
