/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      8. Receba o valor de um depósito em poupança. Calcule e mostre o valor
           após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       double valorDep,rendimento,valorTotal;
       int mes = 1;
       
       valorDep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado:"));
       rendimento = (valorDep / 100)* 1.3;
       valorTotal = valorDep + rendimento;
       JOptionPane.showMessageDialog(null,"O valor do rendimento em 1 mes: " + rendimento +" Reais. "+"\n O valor total após 1 mes: "+ valorTotal+" Reais. ");

    } 
