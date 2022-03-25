/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco Aurélio - FATEC ZONA LESTE
 * 
 *
 *      17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
        automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.

 */
import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
   
       double qtdLitros,tempoPerc,veloMedia,km;
       int consumo = 12;
       tempoPerc = Double.parseDouble(JOptionPane.showInputDialog("Quanto tempo foi gasto na viagem. \n - "));
       veloMedia = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade média. \n - "));
       km = (tempoPerc * veloMedia);
       qtdLitros = km / consumo;
       JOptionPane.showMessageDialog(null," Foram rodados "+km+"Km.\n"+" Com "+qtdLitros+" Litros.");

    }
}
