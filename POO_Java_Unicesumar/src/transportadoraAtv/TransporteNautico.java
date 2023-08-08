package transportadoraAtv;

public class TransporteNautico extends Transportadora{

	double frete;
	
	public TransporteNautico(int altura, int largura) {
		super(altura, largura);
		
	}

	@Override
	double calculadoraFrete() {
		frete = (altura+largura) * 0.10;
		return frete;
		
		
	}

}
