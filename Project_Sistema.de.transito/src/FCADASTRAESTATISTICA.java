/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ma-cv
 */
import java.io.*;	
import javax.swing.*;	
class FCADASTRAESTATISTICA {
   public ESTATISTICA2022[ ] GravaEstatistica (ESTATISTICA2022[ ] estatistica  ) throws IOException {		
 {		
  int i;	
  String fileName = "ArquivoESTATISTICA2022.txt";	
	
  BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	

  for (i = 0 ; i < 15 ; i++)	
   estatistica[i] = new ESTATISTICA2022();
	
  for (i = 0 ; i < 15 ; i++)
   {	
   estatistica[i].codcity = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo da cidade:"));	
   writer.write(Integer.toString(estatistica[i].codcity)); 
   writer.newLine();	
   estatistica[i].nomecity = JOptionPane.showInputDialog("Qual é a cidade:");	
   writer.write( estatistica[i].nomecity );  	
   writer.newLine();	
   estatistica[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes :"));	
   writer.write(Integer.toString(estatistica[i].qtdacidentes));   	
   writer.newLine();	
   estatistica[i].tipoveiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de veiculo :"));	
   writer.write(Integer.toString(estatistica[i].tipoveiculo));   	
   writer.newLine();	
   }	
     System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
     writer.close();
     return estatistica;

	
   } // fim do método	

}
   public void LerEstatistica (ESTATISTICA2022[ ] estatistica  ) throws IOException {				
    int i;	
    String fileName = "ArquivoESTATISTICA2022.txt";	
	
  BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
  for (i = 0 ; i < 15 ; i++)	
  estatistica[i] = new ESTATISTICA2022();
    for (i = 0 ; i < 15 ; i++){
    estatistica[i].codcity = Integer.parseInt(ler.readLine());
    estatistica[i].nomecity = ler.readLine();  		
    estatistica[i].qtdacidentes = Integer.parseInt(ler.readLine());	
    estatistica[i].tipoveiculo = Integer.parseInt(ler.readLine());
    }
   for (i = 0 ; i < 15; i++) {	
   System.out.println("Codigo da cidade :" + estatistica[i].codcity + " Cidade :" + estatistica[i].nomecity + " Numero de acidentes : " + estatistica[i].qtdacidentes + " Tipo de veiculo :" + estatistica[i].tipoveiculo + "\n");	
   }
      ler.close();
   System.out.println("***************************************************************************");
 }
}
	
 
