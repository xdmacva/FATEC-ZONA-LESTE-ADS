package ContagemRegistrosArquivos;

import java.io.File;

public class visualizarArquivos {

	public String diretorio = "C:\\Users\\ma-cv\\Documents\\ArquivosThreads\\";
	public File listaArquivos[] = null;
	public int quantidadeArquivos = 0;


	/**
	 * 
	 */
	public visualizarArquivos() {

		int contador = 0;
		File file = new File(diretorio);
		listaArquivos = file.listFiles();
        int i = 0;
		
		for (int j = listaArquivos.length; i < j; i++) {
			contador++;
		}
		quantidadeArquivos = contador;
	}
	
}
