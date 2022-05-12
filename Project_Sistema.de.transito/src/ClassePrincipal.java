/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ma-cv
 */
import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main (String arg [ ]) throws IOException {
    ESTATISTICA2022[ ] estatistica = new ESTATISTICA2022[15];	
     FCADASTRAESTATISTICA m = new FCADASTRAESTATISTICA(); 
     FTIPO n = new FTIPO();
     QTDACIDENTES o = new QTDACIDENTES();
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("|       MENU ESTATÍSTICA       \n|     Estatísticas de acidentes em 2022       \n| 1 - Cadastro Estatística \n| 2 - Consultar Estatística \n| 3 - Consultar Tipo de veiculo \n| 4 - Quantidade de Acidentes \n| 9 - Finaliza"));
      switch (opc)     {
            case 1: estatistica = m.GravaEstatistica(estatistica);
                         break;
            case 2: m.LerEstatistica (estatistica);
                         break; 
            case 3: n.LerFtipo (estatistica);
                         break;
            case 4: o.LerQtdacidentes(estatistica);
                        break;
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } }

