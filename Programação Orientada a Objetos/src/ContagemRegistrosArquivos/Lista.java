package ContagemRegistrosArquivos;

public class Lista {
	
	private long id;
	
	private String Arquivo;
	private String Tamanho;
	private String Quantidade;
	private String Threads;
	private String Leitura;
	private String Tempo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getArquivo() {
		return Arquivo;
	}
	public void setArquivo(String arquivo) {
		this.Arquivo = arquivo;
	}
	
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		this.Tamanho = tamanho;
	}
	
	public String getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}
	
	public String getThreads() {
		return Threads;
	}
	public void setThreads(String threads) {
		Threads = threads;
	}
	
	public String getLeitura() {
		return Leitura;
	}
	
	public void setLeitura(String leitura) {
		Leitura = leitura;
	}
	
	public String getTempo() {
		return Tempo;
	}
	
	public void setTempo(String tempo) {
		Tempo = tempo;
	}
	
	public String toString() { 
		return "Arquivo: " + Arquivo + 
						"\nTamanho: " + 
						Tamanho + 
						"\nQuantidade: " + Quantidade+ 
						"\nThreads: " + Threads+ 
						"\nLeitura: " + Leitura;
	}
	
}