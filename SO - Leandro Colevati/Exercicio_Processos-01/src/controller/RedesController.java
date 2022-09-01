package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	public RedesController() {
		super();
	}
	public String Os() {

	 String Os = System.getProperty("os.name");
	 return Os;
	 
	}
		 
	public void ip(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String adaptador = "";
			while (linha != null) {
//				if (linha.length() > 0) {
					
				if(linha.contains("Adaptador")){
					 adaptador = linha;
				}
				if(linha.contains("IPv4")) {
				System.out.println(adaptador);	
				System.out.println(linha);
				
					
				 }
				linha = buffer.readLine();
				}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public void ping(String Ping) {

		try {
			Process p;
			p = Runtime.getRuntime().exec(Ping);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if(linha.contains("M¡nimo")){
				String[] texto = linha.split(",");
				System.out.println(texto[2]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
