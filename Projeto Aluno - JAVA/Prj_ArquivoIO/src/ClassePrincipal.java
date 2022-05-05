import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main (String arg [ ]) throws IOException {
    Aluno[ ] aluno = new Aluno[3];	
     GravaAluno m = new GravaAluno();
     LerAluno l = new LerAluno();
     
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("|       MENU ALUNO       \n|     Programa Aluno       \n| 1 - Cadastro Aluno \n| 2 - Consultar Aluno \n| 9 - Finaliza"));
      switch (opc)     {
            case 1: aluno = m.GravaAluno(aluno);
                         break;
            case 2: l.LerAluno (aluno);
                         break;                     
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } }