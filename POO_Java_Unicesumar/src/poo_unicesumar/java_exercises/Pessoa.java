package poo_unicesumar.java_exercises;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	
	
	//============CONSTRUCTOR===============
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
	//============SETTERS AND GETTERES============
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
