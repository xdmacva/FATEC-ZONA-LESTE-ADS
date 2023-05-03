package ContagemRegistrosArquivos;

import java.io.File;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ContagemRegistrosArquivoController {
	
	private StringProperty Arquivo = new SimpleStringProperty();
	private StringProperty Tamanho = new SimpleStringProperty();
	private StringProperty Quantidade = new SimpleStringProperty();
	private StringProperty Threads = new SimpleStringProperty();
	private StringProperty Leitura = new SimpleStringProperty();
	private StringProperty Tempo = new SimpleStringProperty();	
	private ObservableList<Lista> lista = FXCollections.observableArrayList();

	private static final int NUMERO_DE_CONSUMIDORES = 3; // Número de consumidores
	private static int TAMANHO_FILA = 100; // Tamanho da fila de mensagens
	private static BlockingQueue<String> fila; // Fila de mensagens utilizada pelos produtores e consumidores
	private static Collection<Thread> colecaoDeThreadsDeProdutores, colecaoDeTodasAsThreads;
	public static ArrayList<Integer> listaQuantidadeLinhasArquivo = new ArrayList<Integer>();
	private static ArrayList<Long> listaTempoProcessamento = new ArrayList<Long>();
	private static ArrayList<String> listaProdutorProcessamento = new ArrayList<String>();
	/// PROCESSAR ///
	
	public void novo() { 
		fromEntity(new Lista());
	}
	
	public void fromEntity(Lista d) {
		Arquivo.set(d.getArquivo());
		Tamanho.set(d.getTamanho());
		Quantidade.set(d.getQuantidade());
		Threads.set(d.getThreads());
		Leitura.set(d.getLeitura());
		Tempo.set(d.getTempo());
	}
	
	public void carregarListaArquivos(visualizarArquivos vs) { 
  		int i = 0;
		for (int j = vs.quantidadeArquivos; i < j; i++) {
			Lista d = new Lista();
			File arquivos = vs.listaArquivos[i];
			
			d.setId(i+1);
			d.setArquivo(arquivos.getName());
			d.setTamanho((arquivos.length()/1024)  + " kb");

			lista.add(d);
		}
		
	}
		
	public ObservableList<Lista> getList() { 
		return lista;
	}
	
	/// PROCESSAR ///
	public void processarListaArquivos(visualizarArquivos vs) {
		
		colecaoDeThreadsDeProdutores = new ArrayList<Thread>();
		colecaoDeTodasAsThreads = new ArrayList<Thread>();
		fila = new LinkedBlockingDeque<String>(TAMANHO_FILA);
		listaProdutorProcessamento.clear();
		listaQuantidadeLinhasArquivo.clear();
		listaTempoProcessamento.clear();
		
		criarEIniciarProdutores(vs); // Cria e inicia os produtores
		criarEIniciarConsumidores(vs); // Cria e inicia os consumidores

		// Aguarda a finalização de todas as threads
		for (Thread t : colecaoDeTodasAsThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//Controller finalizado
	
		atualizarListaArquivos(vs);
		
	}
	
	// Cria e inicia os produtores
	private static void criarEIniciarProdutores(visualizarArquivos vs) {
		for (int i = 0; i < vs.listaArquivos.length; i++) {
			// Cria um produtor com o caminho do arquivo e a fila de mensagens
			Producer produtor = new Producer(Paths.get(vs.diretorio + vs.listaArquivos[i].getName()),
					fila, i);
			listaQuantidadeLinhasArquivo.add(0);
			listaTempoProcessamento.add((long) 0);
			// Cria uma thread para o produtor
			Thread threadDeProdutor = new Thread(produtor, "Produtor-" + i);
			listaProdutorProcessamento.add("Produtor-" + (i+1));
			// Adiciona a thread na coleção de threads de produtores
			colecaoDeThreadsDeProdutores.add(threadDeProdutor);
			// Inicia a thread
			threadDeProdutor.start();
		}
		// Adiciona todas as threads de produtores na coleção de todas as threads
		colecaoDeTodasAsThreads.addAll(colecaoDeThreadsDeProdutores);
	}

	// Cria e inicia os consumidores
	private static void criarEIniciarConsumidores(visualizarArquivos vs) {
		
		for (int i = 0; i < NUMERO_DE_CONSUMIDORES; i++) {
			// Cria uma thread para o consumidor, passando a fila de mensagens
			Thread threadDeConsumidor = new Thread(new Consumidor(fila), "consumidor-" + i);
			// Adiciona a thread na coleção de todas as threads
			colecaoDeTodasAsThreads.add(threadDeConsumidor);
			// Inicia a thread
			threadDeConsumidor.start();
		}
	}

	// Verifica se há algum produtor vivo
	public static boolean isProdutorVivo() {
		for (Thread t : colecaoDeThreadsDeProdutores){
            if(t.isAlive())
                return true;
        }
        return false;
    }
	
	public static void atualizarQuantidadeLinhasProcessadas(int arquivoEmProcessamento) {
		int quantidadeAtualLinhas = listaQuantidadeLinhasArquivo.get(arquivoEmProcessamento);
		listaQuantidadeLinhasArquivo.set(arquivoEmProcessamento, quantidadeAtualLinhas +1 );
	}
	
	public static void atualizarTempoProcessamento(int arquivoEmProcessamento, long tempoProcessamentoArquivo) {
		listaTempoProcessamento.set(arquivoEmProcessamento, tempoProcessamentoArquivo );;
	}
	
	public void atualizarListaArquivos(visualizarArquivos vs) {
		
		lista.clear();
		
  		int i = 0;
		for (int j = vs.quantidadeArquivos; i < j; i++) {
			Lista d = new Lista();
			File arquivos = vs.listaArquivos[i];
			
			d.setId(i+1);
			d.setArquivo(arquivos.getName());
			d.setTamanho((arquivos.length()/1024)  + " kb");
			d.setThreads(listaProdutorProcessamento.get(i));
			d.setQuantidade(listaQuantidadeLinhasArquivo.get(i).toString());
			d.setTempo(listaTempoProcessamento.get(i).toString() + " ms");
			lista.add(d);
			
		}
	}

	/// PROCESSAR ///
	
	/// PROPERTY
	public StringProperty arquivoProperty() { 
		return Arquivo;
	}

	public StringProperty tamanhoProperty() { 
		return Tamanho;
	}
	
	public StringProperty quantidadeProperty() { 
		return Quantidade;
	}

	public StringProperty leituraProperty() { 
		return Leitura;
	}
	
	public StringProperty tempoProperty() { 
		return Tempo;
	}
}
