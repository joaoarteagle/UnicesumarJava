package transportadoraAtv;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Qual a Altura?"));
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Qual a Largura?"));
		
		TransporteNautico nautico = new TransporteNautico(altura, largura);
		TransporteTerreste terrestre = new TransporteTerreste(altura, largura);
		
		System.out.println("Para Transportar via Terrestre o Frete será de: R$ " + terrestre.calculadoraFrete());
		System.out.println("Para Transportar via Naútica o Frete será de: R$ " + nautico.calculadoraFrete());
	}
		
	

}
