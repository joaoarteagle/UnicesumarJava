package domain;

public class Monitor implements Produto {

    private String nome;
    private double valor;
    private double peso;
    private boolean is220;
    private int altura;
    private int largura;

    public Monitor(String nome, double valor, boolean is220, int altura, int largura) {
        this.nome = nome;
        this.valor = valor;
        this.is220 = is220;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public double getPeso() {
        return 2000;
    }

    @Override
    public double getDesconto() {
        return this.valor * 0.1;
    }

    @Override
    public int getAltura() {
        return this.altura;
    }

    @Override
    public int getLargura() {
        return this.largura;
    }
}
