package ContagemRegistrosArquivos;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable{
	
	private BlockingQueue<String> queue;

    public Consumidor(BlockingQueue<String> q){
        queue = q;
    }

    public void run(){
        while(true){
            String line = queue.poll();

            if(line == null && !ContagemRegistrosArquivoController.isProdutorVivo())
                return;

            if(line != null){
              //Fazer algo com a linha aqui, como verificar se ela contém uma string
            }

        }
    }

}
