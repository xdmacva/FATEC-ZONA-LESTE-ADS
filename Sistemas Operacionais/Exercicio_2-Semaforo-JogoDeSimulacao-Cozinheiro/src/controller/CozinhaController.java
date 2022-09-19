package controller;

import java.util.concurrent.Semaphore;

public class CozinhaController extends Thread{

	private static int id = 0;
	private Semaphore semaforo;
	
	public CozinhaController(Semaphore semaforo) {
		id = id + 1;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		int resto = resto();
		
		if(resto == 0) {
			inicio("Sopa de cebola");
			prepara(500, "Sopa de cebola");
			try {
				semaforo.acquire();
				entrega("Sopa de cebola");

			} catch (Exception e) {
			}
			semaforo.release();
		}
		if(resto != 0) {
			inicio("Lasanha a Bolonhesa");
			prepara(700, "Lasanha a Bolonhesa");
			try {
				semaforo.acquire();
				entrega("Lasanha a Bolonhesa");

			} catch (Exception e) {
			}
			semaforo.release();
		}

	}

	public void inicio(String nome) {
		System.out.println("Preparanção do prato: " + nome);
	}
	
	public void prepara(int tempo, String nome) {
		
		int temp = 0;
		
		while(tempo >= temp) {
			if(nome == "Lasanha a Bolonhesa") {
			System.out.println("Preparando: " + nome + " : " + (int)(Math.ceil(((temp/100)* 14.285714285714))) + "/" + ((tempo*100)/tempo) + "%");
			}else 
			{
			System.out.println("Preparando: " + nome + " : " + (int)(Math.ceil(((temp/100)* 20))) + "/" + ((tempo*100)/tempo) + "%");
			}
			temp = temp + 100;
			dorme(100);
			
		}
	}
	
	public void dorme(int tempo) {
		try {
			sleep(tempo);
		} 
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void entrega(String nome) {
		
		System.out.println("Entregando prato: " + nome);	
		dorme(500);
	}
	
	public int resto() {
		return id % 2;
	}
	
	
}
