package controller;

import java.util.concurrent.Semaphore;

public class MetodosController extends Thread {

	private static int id;
	private Semaphore semaforo;
	
	public MetodosController(Semaphore semafor) {
		this.semaforo = semafor;
		id = id + 1;
	}

	@Override
	public void run() {
		int resto = div();
		
		if(resto == 1) {
			for(int i = 0; i < 2; i++) {
				calculo();
				dorme(500);
				try {
					semaforo.acquire();
					db();
				} 
				
				catch (Exception e) {}	
					
				semaforo.release();
				
				dorme(1000);
			}
			
		}
		
		if(resto == 2) {
			for(int i = 0; i < 3; i++) {
				calculo();
				dorme(700);
				try {
					semaforo.acquire();
					db();
				} 
				catch (Exception e) {}
				
				semaforo.release();
				
				dorme(1500);
			}
		}
		if(resto == 3) {
			for(int i = 0; i < 3; i++) {
				calculo();
				dorme(1000);
				try {
					semaforo.acquire();
					db();
				}
				catch(Exception e) {}
				
				semaforo.release();
				
				dorme(1500);
			}
		}
	}
	
	public int div() {
		return (id % 3);
	}
	
	public void calculo() {
		System.out.println("calculando ...");
	}
	
	public void db() {
		System.out.println("banco de dados..");
	}
	
	public void dorme(int mili) {
		try {
			sleep(mili);
		} 
		catch (Exception e) {
			
		}
	}
}
