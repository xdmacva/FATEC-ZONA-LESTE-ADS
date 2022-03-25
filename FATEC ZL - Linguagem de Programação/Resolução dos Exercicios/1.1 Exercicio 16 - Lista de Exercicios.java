/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
        de desconto e o número de descendentes. Calcule o salário que serão as
        horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
        Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
        Líquido. Exiba o salário a receber.


 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int porcDesc,dependentes;
       double qtdHoras,valorHora,salario,salarioLiq;
       qtdHoras = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de horas trabalhadas : "));
       valorHora = Double.parseDouble(JOptionPane.showInputDialog("O valor por hora. \n "));
       porcDesc = Integer.parseInt(JOptionPane.showInputDialog("Porcentual de desconto \n "));
       dependentes = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes \n "));
       salario = qtdHoras*valorHora;
       salarioLiq = (salario -(salario/100 * porcDesc )+ dependentes * 100);
       JOptionPane.showMessageDialog(null," Salario Bruto  \n"+salario+"\n\n Salario a receber \n "+salarioLiq);

    }
}
