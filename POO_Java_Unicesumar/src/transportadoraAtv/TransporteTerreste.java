package transportadoraAtv;

public class TransporteTerreste extends Transportadora {

	double frete;
	public TransporteTerreste(int altura, int largura) {
		super(altura, largura);
	}

	@Override
	double calculadoraFrete() {
		frete = (altura/largura) * 0.20;
		return frete;
		
	}
	
	
}
