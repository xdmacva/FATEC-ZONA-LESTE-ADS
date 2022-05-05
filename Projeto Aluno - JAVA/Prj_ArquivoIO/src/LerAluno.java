/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marco-NTB
 */
import java.io.*;	
import javax.swing.*;
class LerAluno {
     public void LerAluno (Aluno[ ] aluno  ) throws IOException 
 {	
  	
  int i,ptos;	
  String fileName = "ArquivoAluno.txt";	
	
  BufferedReader ler = new BufferedReader(new FileReader( fileName ));	

  for (i = 0 ; i < 3 ; i++)	
   aluno[i] = new Aluno();
	
  for (i = 0 ; i < 3 ; i++)
   {	
    aluno[i].pnome = ler.readLine();  	
    aluno[i].unome = ler.readLine();	
    aluno[i].pontos = Integer.parseInt(ler.readLine());	
   }	
  	
  for (i = 0 ; i < 3; i++) {	
   System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);	
  }
  ler.close();	
//  System.exit(0);	
   } // fim do método	
    
}
