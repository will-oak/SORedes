package view;

import controller.RedesController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		RedesController redes = new RedesController();
		
		int option = 0;
		
		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma op��o: \n 1 - Consultar IPv4 \n 2 - Consultar ping m�dio \n 0 - Sair"));
			} catch (Exception error) {
				JOptionPane.showMessageDialog(null, "Obrigado pela prefer�ncia");
				break;
			}
			
			switch (option) {
				case 1:
					redes.getIp();
					break;
				case 2: 
					redes.getPing();
					break;
				case 0: 
					JOptionPane.showMessageDialog(null, "Obrigado pela prefer�ncia");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			} 
			
		} while (option != 0);
	}
}
