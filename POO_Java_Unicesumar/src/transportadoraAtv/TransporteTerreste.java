package transportadoraAtv;

public class TransporteTerreste extends Transportadora {

	float frete;
	public TransporteTerreste(int altura, int largura) {
		super(altura, largura);
	}

	@Override
	float calculadoraFrete() {
		frete = (float) ((altura/largura) * 0.20);
		return frete;
		
	}
	
	
}
