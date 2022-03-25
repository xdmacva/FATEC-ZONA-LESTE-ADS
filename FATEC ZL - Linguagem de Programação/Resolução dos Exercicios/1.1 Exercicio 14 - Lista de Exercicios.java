/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      14. Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.



 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
   
       double angulo1,angulo2,angulo3;
       angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro angulo : "));
       angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo angulo : "));
       angulo3 = 180-(angulo1+angulo2);
       JOptionPane.showMessageDialog(null," O valor do Terceiro angulo é \n"+angulo3+"º");

    }
}
