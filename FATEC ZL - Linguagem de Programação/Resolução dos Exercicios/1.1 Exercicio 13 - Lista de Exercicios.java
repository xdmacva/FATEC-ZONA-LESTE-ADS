/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias 
        durará esse alimento sabendo que a pessoa consome 50g ao dia.


 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int diasReal;
       double consumo = 0.05;
       double pesoKg,dias;
       pesoKg = Double.parseDouble(JOptionPane.showInputDialog("Quantos KG de alimento : "));
       dias = pesoKg / consumo;
       JOptionPane.showMessageDialog(null," Consumira "+pesoKg+"Kg em "+dias+" Dias.");

    }
}
