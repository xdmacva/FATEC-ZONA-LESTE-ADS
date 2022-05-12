
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ma-cv
 */
 class FTIPO {
       public void LerFtipo (ESTATISTICA2022[ ] estatistica  ) throws IOException {				
    int i,consulta;	
  /*
    String fileName = "ArquivoESTATISTICA2022.txt";	
    consulta = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do carro: "));
	
  BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
  
  for (i = 0 ; i < 15 ; i++)	
  estatistica[i] = new ESTATISTICA2022();
  
    for (i = 0 ; i < 15 ; i++){	
    estatistica[i].tipoveiculo = Integer.parseInt(ler.readLine());
    //}
*/
    consulta = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do carro: "));

//   while(estatistica[i].tipoveiculo == consulta)
 //   {
   for (i = 0 ; i < 15; i++) {	
      if (estatistica[i].tipoveiculo == consulta){
          System.out.println("Codigo da cidade :" + estatistica[i].codcity + " Cidade :" + estatistica[i].nomecity + " Numero de acidentes : " + estatistica[i].qtdacidentes + " Tipo de veiculo :" + estatistica[i].tipoveiculo + "\n");	
      }
   }
 //      }
 //     ler.close();
 }
     
}
