package view;
import controller.RedesController.ThreadVetor;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int numerico;
		int i;
		int vetnumerico[];
		vetnumerico = new int[1000];
		Random gerador = new Random();
		for(i=0;i<1000;i++) 
		{
			vetnumerico[i]= gerador.nextInt(100);
		}
		
		for(numerico=1;numerico<3;numerico++)
		{
			ThreadVetor th = new ThreadVetor(numerico, vetnumerico);
			th.start();
	
		}
		

	}

}
