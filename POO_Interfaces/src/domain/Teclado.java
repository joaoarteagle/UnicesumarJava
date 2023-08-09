package domain;

public class Teclado implements Produto {
    private String nome;
    private double valor;
    private double peso;

    public Teclado(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;


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
        return 180;
    }

    @Override
    public double getDesconto() {
        if (this.valor > 150.0) {
            return this.valor * 0.08;
        }
        return this.valor * 0.03;
    }

    @Override
    public int getLargura() {
        return 50;
    }

    @Override
    public int getAltura() {
        return 2;
    }
}
