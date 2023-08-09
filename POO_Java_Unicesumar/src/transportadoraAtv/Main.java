package transportadoraAtv;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Qual a Altura?"));
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Qual a Largura?"));
		
		TransporteNautico nautico = new TransporteNautico(altura, largura);
		TransporteTerreste terrestre = new TransporteTerreste(altura, largura);
		
		JOptionPane.showMessageDialog(null,"Para Transportar via Terrestre o Frete será de: R$ " + terrestre.calculadoraFrete() +
											"\nPara Transportar via Naútica o Frete será de: R$ " + nautico.calculadoraFrete());
		
		//=================================QUAL MAIS BARATO?=======================================================================
		
		JOptionPane.showMessageDialog(null, terrestre.frete > nautico.frete? "O frete Via Nautica é mais barato...":
			 "O frete Via Terrestre é mais barato");
	
		
			 
			 
	
		 
		 
	}
		
	

}
