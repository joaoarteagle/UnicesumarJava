package transportadoraAtv;

public class TransporteNautico extends Transportadora{

	float frete;
	
	public TransporteNautico(int altura, int largura) {
		super(altura, largura);
		
	}

	@Override
	float calculadoraFrete() {
		frete = (float) ((altura+largura) * 0.10);
		return frete;
		
		
	}

}
