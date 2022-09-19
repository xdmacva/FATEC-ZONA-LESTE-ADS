package view;

import java.util.concurrent.Semaphore;

import controller.MetodosController;

public class Main {

	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore(1);
		
		MetodosController[] metodos = new MetodosController[21];
		
		for(int i = 0; i < 21; i++) {
			metodos[i] = new MetodosController(semaforo);
			
			metodos[i].start();
		}
	}

}
