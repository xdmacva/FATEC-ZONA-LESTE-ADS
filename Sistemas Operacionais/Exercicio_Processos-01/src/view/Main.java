package view;
import javax.swing.JOptionPane;

import controller.*;

public class Main {

	public static void main(String[] args) {
		RedesController op = new RedesController();
		String process = "ipconfig";
		String Ping = "PING -4 -n 10 www.google.com.br";
		int key;
		do {
			

		key = Integer.parseInt(JOptionPane.showInputDialog(null, "[ 1 a 3 ] Informe um número: [ Digite 0 para parar ]   "));
		switch (key) {
		case 1:
			System.out.println(op.Os());
			break;
		case 2:
			op.ip(process);
			break;
		case 3:
			op.ping(Ping);
			break;

		default:
			break;
		}
		} while (key != 0);		
	}

}
