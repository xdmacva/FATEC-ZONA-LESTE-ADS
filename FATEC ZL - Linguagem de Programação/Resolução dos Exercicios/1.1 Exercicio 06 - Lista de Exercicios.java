import javax.swing.JOptionPane;
public class Exercicios{   
   public static void main (String args [ ])
     {
       int x,y,troca;
       x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X:"));
       y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y:"));
       troca = x;
       x = y;
       y = troca;
             JOptionPane.showMessageDialog(null,"Valor de X: " + x + "Valor de Y: "+y);

    } 
} 


