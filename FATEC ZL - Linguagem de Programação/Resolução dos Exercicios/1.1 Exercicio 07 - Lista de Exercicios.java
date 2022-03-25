/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      7. Receba os valores do comprimento, largura e altura de um paralelepípedo.
           Calcule e mostre seu volume.6. Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
           conteúdos.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int comp,larg,alt,volume;
       comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do Paralelepipedo:"));
       larg = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do Paralelepipedo:"));
       alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do Paralelepipedo:"));
       volume = comp * larg * alt;
       JOptionPane.showMessageDialog(null,"O volume do Paralelepipedo é: " + volume +" cm³");

    } 
} 
