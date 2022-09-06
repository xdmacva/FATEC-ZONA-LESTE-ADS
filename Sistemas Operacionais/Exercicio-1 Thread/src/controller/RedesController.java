package controller;

public class RedesController {

	public RedesController() {
		super();
	}
	public static class ThreadVetor extends Thread {
		public ThreadVetor(int numerico,int vetnumerico[]) {
			if((numerico/2)== 0) 
			{
				 double tempoInicial = System.nanoTime();
				 for(int i = 0 ; i < vetnumerico.length; i++)
				 {
					 
				 }
				 double tempoFinal = System.nanoTime();
					double tempoTotal = ((tempoFinal - tempoInicial)* Math.pow(10,-9));
					System.out.print("For ==> "+tempoTotal+" S.\n");
			}
			else
			{
					double tempoInicial = System.nanoTime();
					for (int i : vetnumerico) {

					}
					double tempoFinal = System.nanoTime();
					double tempoTotal = ((tempoFinal - tempoInicial)* Math.pow(10,-9));
					System.out.print("Foreach ==> "+tempoTotal+" S.");
			}
		}
	 }
		public void run() {
			
		}
	

}
