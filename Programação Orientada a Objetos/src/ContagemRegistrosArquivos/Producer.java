package ContagemRegistrosArquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private Path fileToRead; // Variável do tipo Path que representa o arquivo a ser lido
	private BlockingQueue<String> queue; // Variável do tipo BlockingQueue que representa a fila de strings
	private int arquivo;
	
	public Producer(Path filePath, BlockingQueue<String> q, int arquivoEmProcessamento){ // Construtor que recebe o caminho do arquivo e a fila de strings
	    fileToRead = filePath;
	    queue = q;
        arquivo = arquivoEmProcessamento;
	}

	@Override
	public void run() { // Implementação do método run() da interface Runnable

		LocalDateTime dataHotaInicioProcessamento = LocalDateTime.now();  
		
	    try {
	        BufferedReader reader = Files.newBufferedReader(fileToRead, StandardCharsets.UTF_8); // Criação de um BufferedReader para ler o arquivo
	        String line; // Variável que receberá cada linha do arquivo
	        while((line = reader.readLine()) != null){ // Enquanto houver linhas no arquivo
	            try {
	                queue.put(line); // Adiciona a linha na fila
	                //System.out.println(Thread.currentThread().getName() + " adicionou \"" + line + "\" a fila, tamanho da fila: " + queue.size()); // Imprime a mensagem de adição da linha na fila             
	            } catch (InterruptedException e) { // Tratamento de exceção para interrupção do processo
	                e.printStackTrace(); // Imprime a pilha de exceções
	            }
	            ContagemRegistrosArquivoController.atualizarQuantidadeLinhasProcessadas(arquivo);
	        }
			LocalDateTime dataHotaFimProcessamento = LocalDateTime.now();  

		    Duration duration = Duration.between(dataHotaFimProcessamento, dataHotaInicioProcessamento);
		    long diff = Math.abs(duration.toMillis());
		    
		    ContagemRegistrosArquivoController.atualizarTempoProcessamento(arquivo, diff);
		    
			
	       // System.out.println(Thread.currentThread().getName()+" finalizou"); // Imprime a mensagem de finalização da thread
	        
	    } catch (IOException e) { // Tratamento de exceção para leitura do arquivo
	        e.printStackTrace(); // Imprime a pilha de exceções
	    }
	}

}
